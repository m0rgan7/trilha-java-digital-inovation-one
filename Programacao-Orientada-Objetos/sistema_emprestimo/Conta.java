package sistema_emprestimo;

abstract class Conta {

    protected double saldo; 

    public Conta(double saldo) {
        this.saldo = saldo;
    }
    
    public abstract void sacar(double valor);
    
    public void exibirSaldo() {
        System.out.printf("Saldo Atual: %.2f%n", saldo);
    }
}

/*abstract class Conta {
    protected String titular;
    protected int numeroConta;
    protected double saldo;

    public Conta(String titular, int numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    
    public abstract void sacar(double valor);

    public void depositar(double valor) {
        saldo += valor;
        System.out.printf("Depósito realizado: %.2f%n", valor);
        exibirSaldo();
    }

    public void exibirSaldo() {
        System.out.printf("Saldo Atual: %.2f%n", saldo);
    }
}
*/