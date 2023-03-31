import java.util.Scanner;

public class WeekendCountdown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayOfWeek, hour, minute;

        while (true) {
            System.out.println("Ingresa un día de la semana (Lunes - Viernes):");
            String inputDay = scanner.nextLine().trim().toLowerCase();

            dayOfWeek = getDayOfWeek(inputDay);
            if (dayOfWeek != -1) {
                break;
            }
            System.out.println("Día inválido. Intenta de nuevo.");
        }

        while (true) {
            System.out.println("Ingresa una hora (formato 24 horas):");
            hour = scanner.nextInt();

            if (hour >= 0 && hour < 24) {
                break;
            }
            System.out.println("Hora inválida. Intenta de nuevo.");
        }

        while (true) {
            System.out.println("Ingresa los minutos:");
            minute = scanner.nextInt();

            if (minute >= 0 && minute < 60) {
                break;
            }
            System.out.println("Minutos inválidos. Intenta de nuevo.");
        }

        int minutesLeft = calculateMinutesLeft(dayOfWeek, hour, minute);
        System.out.println("Faltan " + minutesLeft + " minutos para el fin de semana.");
    }

    public static int getDayOfWeek(String day) {
        switch (day) {
            case "lunes":
                return 1;
            case "martes":
                return 2;
            case "miercoles":
            case "miércoles":
                return 3;
            case "jueves":
                return 4;
            case "viernes":
                return 5;
            default:
                return -1;
        }
    }

    public static int calculateMinutesLeft(int dayOfWeek, int hour, int minute) {
        int fridayHour = 15;
        int totalDays = 5 - dayOfWeek;
        int totalHours = fridayHour - hour - 1;
        int totalMinutes = 60 - minute;

        return totalDays * 24 * 60 + totalHours * 60 + totalMinutes;
    }
}
