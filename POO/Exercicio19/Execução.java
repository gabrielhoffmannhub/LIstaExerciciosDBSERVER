package POO.Exercicio19;
import java.util.Scanner;

class Contato {
    String nome;
    String telefone;

    Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    void imprimirContato() {
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
    }
}


public class Execução {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Contato[] agenda = new Contato[10];
        int contador = 0;

        while (true) {
            System.out.println("1 - Adicionar Contato");
            System.out.println("2 - Deletar Contato");
            System.out.println("3 - Listar Contatos");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                if (contador < 10) {
                    System.out.print("Digite o nome do contato: ");
                    String nome = sc.nextLine();
                    System.out.print("Digite o telefone do contato: ");
                    String telefone = sc.nextLine();
                    agenda[contador] = new Contato(nome, telefone);
                    contador++;
                } else {
                    System.out.println("Agenda cheia!");
                }
            } else if (opcao == 2) {
                System.out.print("Digite o nome do contato a ser deletado: ");
                String nomeDeletar = sc.nextLine();
                boolean encontrado = false;
                for (int i = 0; i < contador; i++) {
                    if (agenda[i].nome.equals(nomeDeletar)) {
                        for (int j = i; j < contador - 1; j++) {
                            agenda[j] = agenda[j + 1];
                        }
                        agenda[contador - 1] = null;
                        contador--;
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("Contato não encontrado!");
                }
            } else if (opcao == 3) {
                if (contador == 0) {
                    System.out.println("Agenda vazia!");
                } else {
                    System.out.println("Contatos na agenda:");
                    for (int i = 0; i < contador; i++) {
                        agenda[i].imprimirContato();
                    }
                }
            } else if (opcao == 4) {
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }
}