package lanchonete.atendimento.cozinha;

public class Cozinheiro{
    private void prepararComida(){

        System.out.println("Preparando o pedido do cliente x ");
    }
    //por que tem ()?
    public void adicionarComidaNoBalcao() {
        prepararComida();
        System.out.println ("Adicionando comida no balcão ");
    }
    void ChecarGas() {
        pedirParaTrocarGas(null);
        System.out.println ("Checando ");
    }
    private void pedirParaTrocarGas(Almoxarife amigo){

        amigo.trocarGas();
    }
}