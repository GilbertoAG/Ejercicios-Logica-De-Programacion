import java.util.*;

/**
 * Clase TranslationQuiz que contiene un mini juego de traducción de palabras en español a inglés.
 */
public class TranslationQuiz {

    /**
     * Método main que se encarga de la ejecución del programa.
     *
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        // Crear el diccionario de palabras en español e inglés
        Map<String, String> dictionary = createDictionary();
        // Escoger 5 palabras al azar del diccionario
        List<String> words = pickRandomWords(dictionary, 5);

        // Inicializar el contador de respuestas correctas
        int correctAnswers = 0;
        Scanner scanner = new Scanner(System.in);

        // Iterar por cada palabra seleccionada
        for (String word : words) {
            System.out.println("Ingresa la traducción en inglés de la palabra: " + word);
            String userTranslation = scanner.nextLine().trim().toLowerCase();

            // Verificar si la traducción ingresada es correcta
            if (dictionary.get(word).equalsIgnoreCase(userTranslation)) {
                correctAnswers++;
            }
        }

        // Mostrar el número de respuestas correctas e incorrectas
        System.out.println("Respuestas correctas: " + correctAnswers);
        System.out.println("Respuestas incorrectas: " + (words.size() - correctAnswers));
    }

    /**
     * Método que crea un diccionario Español-Inglés utilizando un objeto HashMap.
     *
     * @return Un diccionario que contiene pares de palabras en español e inglés.
     */
    public static Map<String, String> createDictionary() {
        Map<String, String> dictionary = new HashMap<>();

        // Añadir pares de palabras al diccionario
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

    /**
     * Método que selecciona palabras al azar de un diccionario dado.
     *
     * @param dictionary El diccionario del que se seleccionarán las palabras
     * @param count      El número de palabras a seleccionar
     * @return Una lista que contiene las palabras seleccionadas al azar.
     */
    public static List<String> pickRandomWords(Map<String, String> dictionary, int count) {
        List<String> words = new ArrayList<>(dictionary.keySet());
        // Mezclar la lista de palabras
        Collections.shuffle(words);
        // Devolver las primeras 'count' palabras de la lista mezclada
        return words.subList(0, count);
    }
}
