package LaçosDeRepetição.Exercicio09;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe até qual número mostrar a série de Fibonacci: ");
        int numero = sc.nextInt();

        int a = 0, b = 1;

        System.out.print("Série de Fibonacci Até " + numero + ": ");
        while (a <= numero) {
            System.out.print( a + " ");
            int numero2 = a;
            a = b;
            b = numero2  + b;
            numero2++;
        }

        sc.close();

    }
}
