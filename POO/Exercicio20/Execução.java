package POO.Exercicio20;

import java.util.Scanner;

class Produto {
    String nome;
    double preco;
    int quantidade;

    Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    boolean verificarEstoque(int quantidadeSolicitada) {
        return quantidadeSolicitada <= quantidade;
    }

    void vender(int quantidadeVendida) {
        quantidade -= quantidadeVendida;
    }
}

class SuperMercado {
    Produto[] produtos;

    SuperMercado() {
        produtos = new Produto[5];
        produtos[0] = new Produto("Arroz", 5.50, 20);
        produtos[1] = new Produto("Feijão", 6.30, 15);
        produtos[2] = new Produto("Macarrão", 3.90, 25);
        produtos[3] = new Produto("Leite", 2.50, 30);
        produtos[4] = new Produto("Açúcar", 4.10, 18);
    }

    void mostrarProdutos() {
        for (int i = 0; i < produtos.length; i++) {
            System.out.println((i + 1) + ". " + produtos[i].nome + " - R$" + produtos[i].preco + " - " + produtos[i].quantidade + " em estoque");
        }
    }

    boolean venderProduto(int indice, int quantidade) {
        if (produtos[indice].verificarEstoque(quantidade)) {
            produtos[indice].vender(quantidade);
            return true;
        }
        return false;
    }

    double calcularTotal(int[] quantidades) {
        double total = 0;
        for (int i = 0; i < produtos.length; i++) {
            total += produtos[i].preco * quantidades[i];
        }
        return total;
    }

    double calcularTroco(double valorPago, double total) {
        return valorPago - total;
    }

    void calcularNotas(double troco) {
        int[] notas = {100, 50, 20, 10, 5, 2, 1};
        System.out.println("Troco: R$" + troco);
        for (int nota : notas) {
            int qtdNotas = (int) (troco / nota);
            if (qtdNotas > 0) {
                System.out.println(qtdNotas + " notas de R$" + nota);
                troco -= qtdNotas * nota;
            }
        }
    }
}

public class Execução {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SuperMercado mercado = new SuperMercado();
        int[] quantidades = new int[5];

        while (true) {
            System.out.println("Produtos disponíveis:");
            mercado.mostrarProdutos();
            System.out.print("Digite o número do produto que deseja comprar ou 0 para finalizar: ");
            int opcao = sc.nextInt() - 1;

            if (opcao == -1) break;

            System.out.print("Digite a quantidade: ");
            int quantidade = sc.nextInt();

            if (mercado.venderProduto(opcao, quantidade)) {
                quantidades[opcao] += quantidade;
                System.out.println("Produto adicionado!");
            } else {
                System.out.println("Quantidade indisponível em estoque!");
            }
        }

        double total = mercado.calcularTotal(quantidades);
        System.out.println("Total a pagar: R$" + total);

        System.out.print("Digite o valor pago: ");
        double valorPago = sc.nextDouble();

        if (valorPago >= total) {
            double troco = mercado.calcularTroco(valorPago, total);
            mercado.calcularNotas(troco);
        } else {
            System.out.println("Valor insuficiente para pagamento!");
        }

        sc.close();
    }
}
