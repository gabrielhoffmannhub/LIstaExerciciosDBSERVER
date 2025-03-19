package MatrizesVetores.Exercicio15;
import java.util.Scanner;

public class Exercicio15 {

    public static double soma(double a, double b) {
        return a + b;
    }

    public static double subtracao(double a, double b) {
        return a - b;
    }

    public static double multiplicacao(double a, double b) {
        return a * b;
    }

    public static double divisao(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Erro: Divisão por zero não é permitida.");
            return Double.NaN;
        }
    }

    public static double potencia(double a, double b) {
        return Math.pow(a, b);
    }

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
            System.out.println("5 - Potenciação");
            System.out.print("Sua Escolha: ");
            escolha = sc.nextInt();

            if (escolha < 1 || escolha > 5) {
                System.out.println("Opção inválida. Tente novamente.");
            }
        } while (escolha < 1 || escolha > 5);

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        double resultado;

        switch (escolha) {
            case 1:
                resultado = soma(num1, num2);
                System.out.print("O resultado da adição é: " + resultado);
                break;
            case 2:
                resultado = subtracao(num1, num2);
                System.out.print("O resultado da subtração é: " + resultado);
                break;
            case 3:
                resultado = multiplicacao(num1, num2);
                System.out.print("O resultado da multiplicação é: " + resultado);
                break;
            case 4:
                resultado = divisao(num1, num2);
                if (!Double.isNaN(resultado)) {
                    System.out.print("O resultado da divisão é: " + resultado);
                }
                break;
            case 5:
                resultado = potencia(num1, num2);
                System.out.print("O resultado da potência é: " + resultado);
                break;
        }

        sc.close();
    }
}
