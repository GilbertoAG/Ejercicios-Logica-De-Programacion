import java.util.Scanner;

public class PrimesFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Ingresa 10 números:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        int[] orderedArray = orderPrimesFirst(numbers);
        System.out.println("Array ordenado:");
        for (int i = 0; i < orderedArray.length; i++) {
            System.out.println("pos[" + i + "] = " + orderedArray[i]);
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] orderPrimesFirst(int[] numbers) {
        int[] orderedArray = new int[numbers.length];
        int primeIndex = 0;
        int nonPrimeIndex = numbers.length - 1;

        for (int number : numbers) {
            if (isPrime(number)) {
                orderedArray[primeIndex] = number;
                primeIndex++;
            } else {
                orderedArray[nonPrimeIndex] = number;
                nonPrimeIndex--;
            }
        }

        return orderedArray;
    }
}
