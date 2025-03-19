package LaçosDeRepetição.Exercicio08;
import java.util.Scanner;

public class Exercicio08 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            float numero = 0;

            while( numero != 10){
                System.out.println("Digite um número, e 10 para encerrar o programa");
                numero = sc.nextFloat();
                }
            System.out.println("Programa encerrado");
            sc.close();
    }
}
