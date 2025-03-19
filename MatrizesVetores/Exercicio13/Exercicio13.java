package MatrizesVetores.Exercicio13;
import java.util.Scanner;

public class Exercicio13 {

    public static double calcularTotal(double preco, int quantidade) {
        double desconto;

        if (quantidade > 50) {
            desconto = 0.25;
        } else if (quantidade >= 21 && quantidade <= 50) {
            desconto = 0.20;
        } else if (quantidade >= 11 && quantidade <= 20) {
            desconto = 0.10;
        } else {
            desconto = 0;
        }

        double total = preco * quantidade * (1 - desconto);
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Preço unitário: ");
        double preco = scanner.nextDouble();

        System.out.print("Quantidade comprada: ");
        int quantidade = scanner.nextInt();

        double totalPagar = calcularTotal(preco, quantidade);

        System.out.print("Produto: "+ nome + "Total a pagar: R$" + totalPagar);

        scanner.close();
    }
}

