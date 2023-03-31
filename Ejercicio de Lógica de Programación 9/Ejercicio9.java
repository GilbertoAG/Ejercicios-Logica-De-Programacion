import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SpanishEnglishDictionary {
    public static void main(String[] args) {
        Map<String, String> dictionary = createDictionary();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una palabra en español:");
        String inputWord = scanner.nextLine().trim().toLowerCase();

        String translatedWord = dictionary.get(inputWord);

        if (translatedWord == null) {
            System.out.println("La palabra no se encuentra en el diccionario");
        } else {
            System.out.println(translatedWord);
        }
    }

    public static Map<String, String> createDictionary() {
        Map<String, String> dictionary = new HashMap<>();

        dictionary.put("gato", "cat");
        dictionary.put("perro", "dog");
        dictionary.put("casa", "house");
        dictionary.put("libro", "book");
        dictionary.put("amigo", "friend");
        dictionary.put("comida", "food");
        dictionary.put("auto", "car");
        dictionary.put("agua", "water");
        dictionary.put("sol", "sun");
        dictionary.put("luna", "moon");
        dictionary.put("cielo", "sky");
        dictionary.put("tierra", "earth");
        dictionary.put("verde", "green");
        dictionary.put("rojo", "red");
        dictionary.put("amarillo", "yellow");
        dictionary.put("azul", "blue");
        dictionary.put("grande", "big");
        dictionary.put("pequeño", "small");
        dictionary.put("rápido", "fast");
        dictionary.put("lento", "slow");

        return dictionary;
    }
}
