package LaçosDeRepetição.Exercicio06;
import java.util.Random;

public class Exercicio06 {
    public static void main(String[] args){
        Random rd = new Random();
        int[] numeros = new int[10];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        System.out.println("Gerador de números aleatórios de 1 a 100");
        for(int i = 0; i < 10; i++){
            numeros[i] = rd.nextInt(101);
            System.out.println(numeros[i]);
            if(numeros[i] < min){
                min = numeros[i];
            }
            if(numeros[i] > max){
                max = numeros[i];
            }
        }
    }
}
