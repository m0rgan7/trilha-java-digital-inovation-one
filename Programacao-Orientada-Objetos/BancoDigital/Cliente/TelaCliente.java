package BancoDigital.Cliente;

import java.util.Scanner;

import BancoDigital.Contas.Conta;

public class TelaCliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cliente cliente = new Cliente();

        System.out.println("Informe seu nome: ");
        String nome = scanner.nextLine();
        cliente.setNome(nome);

        System.out.println("Informe como gostaria de ser chamado: ");
        String apelido = scanner.nextLine();
        cliente.setApelido(apelido);

        System.out.println("Informe seu cpf: ");
        int cpf = scanner.nextInt();
        cliente.setCpf(cpf);

        System.out.println("Seu número de agência é: " ); //TO DO adiciona a agencia ali

        Conta conta = new Conta();

        System.out.println("Digite o valor para depositar: ");
        double saldo = scanner.nextDouble();
        conta.setSaldo(saldo);

        System.out.println("Depositado, seu saldo atual é: " +  conta.getSaldo());

        System.out.println("Digite o valor que você deseja transferir: ");
        double valor = scanner.nextDouble();
        conta.setValor(valor); 

        conta.setSaldo(conta.getSaldo() - conta.getValor());

        System.out.println("Transferido, seu saldo atual é: " +  conta.getSaldo());

        System.out.println("Digite o valor que você deseja sacar: (lembre-se, esse valor é de acordo com seu saldo)");
        double numero = scanner.nextDouble();
        conta.setValor(numero);

        conta.setSaldo(conta.getSaldo() - conta.getNumero());

        System.out.println("Saque feito, seu saldo atual é de: " +  conta.getSaldo());

        scanner.close();
    }
}