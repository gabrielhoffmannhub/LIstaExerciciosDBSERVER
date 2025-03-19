package POO.Exercicio16;

import java.util.Scanner;

class Livro {
    String titulo;

    Livro(String titulo) {
        this.titulo = titulo;
    }
}

class Pessoa {
    String nome;

    Pessoa(String nome) {
        this.nome = nome;
    }
}
class Emprestimo {
    Livro livro;
    Pessoa pessoa;
    int dataEmprestimo;
    int dataDevolucao;

    Emprestimo(Livro livro, Pessoa pessoa, int dataDevolucao) {
        this.livro = livro;
        this.pessoa = pessoa;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }
}
public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Livro[] livros = new Livro[3];
        livros[0] = new Livro("Pai rico, pai pobre");
        livros[1] = new Livro("Os segredos da mente milionária");
        livros[2] = new Livro("A única coisa");

        System.out.println("Livros disponíveis:");
        for (int i = 0; i < livros.length; i++) {
            System.out.println((i + 1) + ". " + livros[i].titulo);
        }

        System.out.print("Digite o número do livro que deseja emprestar: ");
        int escolha = sc.nextInt() - 1;
        sc.nextLine();

        System.out.print("Digite o nome de quem fará o empréstimo: ");
        String nomePessoa = sc.nextLine();
        Pessoa pessoa = new Pessoa(nomePessoa);

        System.out.print("Digite o dia do empréstimo (exemplo 20): ");
        int diaEmprestimo = sc.nextInt();
        System.out.print("Digite o mês do empréstimo (exemplo 03): ");
        int mesEmprestimo = sc.nextInt();
        System.out.print("Digite o ano do empréstimo (exemplo 2025): ");
        int anoEmprestimo = sc.nextInt();

        int diaDevolucao = diaEmprestimo + 7;

        System.out.println("Devolução para data de: " + diaDevolucao + "/" + mesEmprestimo + "/" + anoEmprestimo);

        sc.close();
    }
}

