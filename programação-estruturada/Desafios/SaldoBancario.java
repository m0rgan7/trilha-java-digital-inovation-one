//código que foi aceito pelo desafio
import java.util.Scanner;

public class SaldoBancario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //tive que retirar o System.out.print para aceitarem
        System.out.println("Digite o saldo inicial: ");
        double saldoInicial = scanner.nextDouble();
        System.out.println("Digite o valor da 1a trasação: ");
        double transacao1 = scanner.nextDouble();
        System.out.println("Digite o valor da 2a trasação: ");
        double transacao2 = scanner.nextDouble();
        System.out.println("Digite o valor da 3a trasação: ");
        double transacao3 = scanner.nextDouble();
      //estava errando aqui colocando "-" pois interpretei errado
        double saldoFinal = saldoInicial + transacao1 + transacao2 + transacao3;

        
        System.out.printf("%.2f\n", saldoFinal);

        scanner.close();
    }
}