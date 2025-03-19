package ExerciciosBasicos.Exercicio02;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String produto = sc.nextLine();

        System.out.print("Digite a quantidade do produto: ");
        int quantidade = sc.nextInt();

        System.out.print("Digite o preço do produto: ");
        double preco = sc.nextDouble();

        double total = preco * quantidade;
        double desconto = 0;

        if (quantidade > 50) {
            desconto = 0.25;
        } else if (quantidade > 20) {
            desconto = 0.20;
        } else if (quantidade > 10) {
            desconto = 0.10;
        }

        double valorFinal = total - (total * desconto);

        System.out.println("Produto comprado: " + produto);
        System.out.println("Valor a pagar: R$" + valorFinal);

        sc.close();
    }
}
