package LaçosDeRepetição.Exercicio07;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número para calcular a série de Fibonacci: ");
        int numero = sc.nextInt();

        int a = 0, b = 1, c = 0;

        System.out.print("Série de Fibonacci: ");
        while (c <= numero) {
            System.out.print(a + " ");
            int numero2 = a;
            a = b;
            b = numero2 + b;
            c++;
        }

        sc.close();

    }
}
