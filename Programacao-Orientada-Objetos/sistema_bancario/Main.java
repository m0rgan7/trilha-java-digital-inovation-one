package sistema_bancario;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //como nao tem o system out println ja vai direto pro scanner
        String titular = sc.nextLine(); 
        int numeroConta = sc.nextInt(); 
        double saldoInicial = sc.nextDouble(); 

        Conta conta = new Conta(titular, numeroConta, saldoInicial); //objeto conta

        if (sc.hasNextDouble()) { 
            double valorSaque = sc.nextDouble(); 
           
            if (!conta.sacar(valorSaque)) { 
                System.out.println("Saque invalido: Saldo insuficiente");
                System.out.println("Saldo Atual: " + String.format("%.2f", conta.consultarSaldo()));
                sc.close();
                return; 
            }
        }

        if (sc.hasNextDouble()) { 
            double valorDeposito = sc.nextDouble(); 
            conta.depositar(valorDeposito); 
        }

        System.out.println("Saldo Atualizado: " + String.format("%.2f", conta.consultarSaldo()));

        sc.close();
    }
}