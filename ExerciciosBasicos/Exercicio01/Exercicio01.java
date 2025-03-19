package ExerciciosBasicos.Exercicio01;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        if (idade >= 18) {
            System.out.println("É maior de idade");
        }else {
            System.out.println("Menor de idade");
        }
        scanner.close();
    }
}
