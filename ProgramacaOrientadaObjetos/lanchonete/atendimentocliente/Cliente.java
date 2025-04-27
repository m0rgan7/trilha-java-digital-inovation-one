package lanchonete.atendimentocliente;

public class Cliente{
    public void comer () {

        System.out.println("Comendo ");
    }
    private void checarSaldo () {

        System.out.println("Checando ");
    }
    void pagarComida(){
        checarSaldo();
        System.out.println("Pagando ");
    }
}