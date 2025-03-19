package MatrizesVetores.Exercicio10;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho da matriz (N): ");
        int n = sc.nextInt();

        int[][] matriz = new int[n][n];
        int somaDiagonal = 0;

        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
                if (i == j) {
                    somaDiagonal += matriz[i][j];
                }
            }
        }

        System.out.println("\nMatriz digitada:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nSoma da diagonal principal: " + somaDiagonal);

        sc.close();
    }
}

