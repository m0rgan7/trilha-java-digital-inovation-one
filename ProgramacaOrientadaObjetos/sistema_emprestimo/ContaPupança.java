package sistema_emprestimo;

class ContaPoupanca extends Conta {

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    // Implementação do método sacar para Conta Poupança
    @Override
    public void sacar(double valor) {
        // TODO: Implemente a lógica para verificar se o saque é permitido considerando apenas o saldo:
        // Dica: Se saldo >= valor, o saque é permitido.
        

        exibirSaldo(); // Exibe o saldo atualizado
    }
}
/*
class ContaPoupanca extends Conta {

    public ContaPoupanca(String titular, int numeroConta, double saldo) {
        super(titular, numeroConta, saldo);
    }

    @Override
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.printf("Saque realizado: %.2f%n", valor);
        } else {
            System.out.println("Saque invalido: Saldo insuficiente");
        }
        exibirSaldo();
    }
}
*/