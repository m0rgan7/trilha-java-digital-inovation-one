package sistema_emprestimo;

class ContaCorrente extends Conta {
    private double limite; 
        
    public ContaCorrente(double saldo, double limite) {
        super(saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        // TODO: Implemente a lógica para verificar se o saque é permitido considerando o saldo e o limite:
        // Dica: Se saldo - valor >= -limite, o saque é permitido.
       


        exibirSaldo(); // Exibe o saldo atualizado
    }
}

/*
 class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(String titular, int numeroConta, double saldo, double limite) {
        super(titular, numeroConta, saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (saldo - valor >= -limite) {
            saldo -= valor;
            System.out.printf("Saque realizado: %.2f%n", valor);
        } else {
            System.out.println("Saque invalido: Excede limite");
        }
        exibirSaldo();
    }
}
 */