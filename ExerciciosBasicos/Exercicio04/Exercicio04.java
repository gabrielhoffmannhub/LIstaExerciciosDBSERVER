package ExerciciosBasicos.Exercicio04;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("Calculadora");
            System.out.println("Escolha uma operação: ");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.print("Sua Escolha: ");
            escolha = sc.nextInt();

            if (escolha < 1 || escolha > 4) {
                System.out.println("Opção inválida. Tente novamente.");;
            }
        } while (escolha < 1 || escolha > 4);

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        double resultado;
        switch (escolha) {
            case 1:
                resultado = num1 + num2;
                System.out.println("O resultado da adição é: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("O resultado da subtração é: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("O resultado da multiplicação é: " + resultado);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("O resultado da divisão é: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
        }

        sc.close();
    }
}