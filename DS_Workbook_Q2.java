import java.util.Random;

public class ArrayPrintExamples {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        // Initialize the array with random integers
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100); // Generating random integers between 0 and 99
        }

        System.out.println("Every element at an even index:");
        for (int i = 0; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("Every odd element:");
        for (int num : array) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        System.out.println("All elements in reverse order:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("Only the first and last element:");
        System.out.println(array[0] + " " + array[array.length - 1]);
    }
}
