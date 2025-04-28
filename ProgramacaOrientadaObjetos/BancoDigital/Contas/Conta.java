package BancoDigital.Contas;

public class Conta {

    public int saldoInicial = 0;
    protected double saldo;
    protected double valor;
    protected double numero;

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public double getNumero() {
        return numero;
    }
    public void setNumero(double numero) {
        this.numero = numero;
    }

}