package MatrizesVetores.Exercicio12;
import java.util.Arrays;
import java.util.Random;

public class Exercicio12 {

    public static void main(String[] args) {
        Random rd = new Random();

        int[] vetor1 = new int[50];
        int[] vetor2 = new int[50];

        for (int i = 0; i < 50; i++) {
            vetor1[i] = rd.nextInt(100);
            vetor2[i] = rd.nextInt(100);
        }

        Arrays.sort(vetor1);
        Arrays.sort(vetor2);

        int[] vetorCombinado = new int[100];
        System.arraycopy(vetor1, 0, vetorCombinado, 0, 50);
        System.arraycopy(vetor2, 0, vetorCombinado, 50, 50);

        Arrays.sort(vetorCombinado);

        System.out.println("Vetor 1 ordenado:");
        System.out.println(Arrays.toString(vetor1));

        System.out.println("Vetor 2 ordenado:");
        System.out.println(Arrays.toString(vetor2));

        System.out.println("Vetor combinado e ordenado:");
        System.out.println(Arrays.toString(vetorCombinado));
    }
}
