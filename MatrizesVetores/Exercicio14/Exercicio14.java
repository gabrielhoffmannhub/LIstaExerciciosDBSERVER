package MatrizesVetores.Exercicio14;
import java.util.Scanner;

public class Exercicio14 {
    public static int lerTempo(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tempo em segundos: ");
        int segundos = scanner.nextInt();
        scanner.close();
        return segundos;
    }

    public static int obterHoras(int segundos){
        return segundos / 3600;
    }

    public static int obterMinutos(int segundos){
        return (segundos % 3600) / 60;
    }
    public static int obterSegundos(int segundos){
        return segundos % 60;
    }

    public static void exibirResultados(int horas, int minutos, int segundos){
        System.out.print("Equivale a: "+ horas + " horas "+ minutos + " minutos "+ segundos + " segundos");
    }

    public static void main(String[] args){
        int totalSegundos = lerTempo();
        int horas = obterHoras(totalSegundos);
        int minutos = obterMinutos(totalSegundos);
        int segundos = obterSegundos(totalSegundos);
        exibirResultados(horas, minutos, segundos);
    }
}

