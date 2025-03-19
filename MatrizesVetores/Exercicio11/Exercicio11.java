package MatrizesVetores.Exercicio11;
import java.util.Random;

public class Exercicio11 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }

        bubbleSort(array);

        System.out.println("Array ordenado:");
        printArray(array);
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    public static void printArray(int[] array) {
        for (int num: array) {
            System.out.println(num + " ");
        }
        System.out.println();
    }
}
