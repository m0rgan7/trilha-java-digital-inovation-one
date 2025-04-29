package sistema_bancario;

public class Conta {

    private String titular;
    private int numeroConta;
    private double saldo;

    public String getTitular() {
        return titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public Conta(String titular, int numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public boolean sacar(double valor) {
        if (valor > saldo) {
            return false; 
        }
        saldo -= valor;
        return true;
    }

    public void depositar(double valor) {
        saldo += valor;
    }
}