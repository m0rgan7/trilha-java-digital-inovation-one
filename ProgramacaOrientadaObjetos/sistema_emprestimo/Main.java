package sistema_emprestimo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tipoConta = scanner.next(); 
        scanner.nextLine(); 
        scanner.nextLine(); 
        scanner.next(); 
        double saldoInicial = scanner.nextDouble(); 

        Conta conta;

        // TODO: Implemente a lógica para criar uma instância de ContaCorrente ou ContaPoupanca:
        // Dica: Use um if para verificar o tipo da conta.
        
            // TODO: Para Conta Corrente, leia também o limite de cheque especial e crie a instância.
            
        
  
            // TODO: Para Conta Poupança, apenas inicialize a conta com o saldo inicial:
        

        while (scanner.hasNextDouble()) {
            double valorSaque = scanner.nextDouble(); 
            conta.sacar(valorSaque); 
        }

        scanner.close(); 
    }
}

/*
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tipoConta = scanner.nextLine();        // Corrente ou Poupanca
        String titular = scanner.nextLine();          // Nome do titular
        int numeroConta = scanner.nextInt();          // Número da conta
        double saldoInicial = scanner.nextDouble();   // Saldo inicial

        Conta conta;

        if (tipoConta.equalsIgnoreCase("Corrente")) {
            double limite = scanner.nextDouble(); // Limite do cheque especial
            conta = new ContaCorrente(titular, numeroConta, saldoInicial, limite);
        } else {
            conta = new ContaPoupanca(titular, numeroConta, saldoInicial);
        }

        while (scanner.hasNextDouble()) {
            double valor = scanner.nextDouble();
            conta.sacar(valor);
        }

        scanner.close();
    }
}
 */