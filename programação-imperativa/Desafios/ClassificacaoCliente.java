import java.util.Scanner;

public class ClassificacaoCliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//pra eles aceitarem tive que tirar o System.out.println
        System.out.println("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        if (saldo < 0){
          System.out.println("Negativado");
        }
        else if (saldo < 500) {
          System.out.println("Baixo");
        } else {
          System.out.println("Confortavel");
        }
        
        scanner.close();
    }
}