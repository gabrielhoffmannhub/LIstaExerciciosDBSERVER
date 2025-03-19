package ExerciciosBasicos.Exercicio03;
import java.util.Random;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.println("Jogo jokenpo");
        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Pedra");
        System.out.println("2 - Papel");
        System.out.println("3 - Tesoura");
        int escolhaJogador = sc.nextInt();

        int escolhaMaquina = rd.nextInt(3) + 1;

        System.out.println("Você Escolheu: " + escolhaString(escolhaJogador));
        System.out.println("A máquina Escolheu: " + escolhaString(escolhaMaquina));

        if (escolhaJogador == escolhaMaquina) {
            System.out.println("Empate");
        } else if ((escolhaJogador == 1 && escolhaMaquina == 3) ||
                (escolhaJogador == 2 && escolhaMaquina == 1) ||
                (escolhaJogador == 3 && escolhaMaquina == 2)) {
            System.out.println("Você Ganhou");

        } else {
            System.out.println("Você Perdeu");
        }
        sc.close();
    }


        public static String escolhaString(int opcao) {
            switch (opcao) {
                case 1:
                    return "Pedra";
                case 2:
                    return "Papel";
                case 3:
                    return "Tesoura";
                default:
                    return "Opção inválida";
            }
        }
    }