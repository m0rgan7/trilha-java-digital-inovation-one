import java.util.Scanner;

public class ContaTerminal {
    public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);

        String agencia, nomeCliente;
        int numeroConta;
        float saldo;

        //pesquisa por que que quando coloquei o da agencia após o numero conta ele for pulado?

        System.out.println ("Por favor, digite o número da Agência! ");
        agencia = scanner.nextLine();

        System.out.println ("Por favor, digite seu nome! ");
        nomeCliente = scanner.nextLine();
        
        System.out.println ("Por favor, digite o número da sua conta! ");
        numeroConta = scanner.nextInt();

        System.out.println ("Por favor, digite o seu saldo! ");
        saldo= scanner.nextFloat();

        System.out.println("Olá, " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta "+ numeroConta+" e seu saldo " + saldo + " ja esta disponível para saque!");

    scanner.close();
    }
}