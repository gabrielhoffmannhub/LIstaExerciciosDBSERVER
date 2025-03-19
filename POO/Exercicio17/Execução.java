package POO.Exercicio17;

import java.util.Scanner;
class Pessoa {
    String nome;
    int idade;
    Pessoa pai;
    Pessoa mae;

    Pessoa(String nome, int idade, Pessoa pai, Pessoa mae) {
        this.nome = nome;
        this.idade = idade;
        this.pai = pai;
        this.mae = mae;
    }

    void imprimirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Pai: " + pai.nome);
        System.out.println("Mãe: " + mae.nome);
    }
}

public class Execução {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pessoa[] familiares = new Pessoa[2];

        for (int i = 0; i < 2; i++) {
            System.out.println("\nDigite as informações do familiar " + (i + 1));
            System.out.print("Digite o nome da pessoa: ");
            String nome = sc.nextLine();

            System.out.print("Digite a idade de " + nome + ": ");
            int idade = sc.nextInt();
            sc.nextLine();

            System.out.print("Digite o nome do pai de " + nome + ": ");
            String nomePai = sc.nextLine();
            System.out.print("Digite a idade do pai de " + nome + ": ");
            int idadePai = sc.nextInt();
            sc.nextLine();
            Pessoa pai = new Pessoa(nomePai, idadePai, null, null);

            System.out.print("Digite o nome da mãe de " + nome + ": ");
            String nomeMae = sc.nextLine();
            System.out.print("Digite a idade da mãe de " + nome + ": ");
            int idadeMae = sc.nextInt();
            sc.nextLine();
            Pessoa mae = new Pessoa(nomeMae, idadeMae, null, null);

            familiares[i] = new Pessoa(nome, idade, pai, mae);
        }

        System.out.println("\nInformações dos familiares:");
        for (Pessoa p : familiares) {
            p.imprimirInformacoes();
        }

        sc.close();
    }
}
