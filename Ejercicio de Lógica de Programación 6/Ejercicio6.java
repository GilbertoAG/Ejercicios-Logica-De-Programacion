import java.util.Scanner;

public class ReverseText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una palabra o frase:");
        String inputText = scanner.nextLine();
        String reversedText = reverseString(inputText);
        System.out.println("Texto invertido: " + reversedText);
    }

    public static String reverseString(String text) {
        StringBuilder reversed = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed.append(text.charAt(i));
        }
        return reversed.toString();
    }
}