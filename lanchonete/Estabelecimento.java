package lanchonete;

public class Estabelecimento {
    public static void main(String[] args) {
     Cozinheiro cozinheiro = new Cozinheiro();

     //açoes que o  estabelecimento precisa ter ciencia:
     cozinheiro.adicionarComidaNoBalcao();

     //açoes que so a cozinha e o almoxarife precisam saber:
     cozinheiro.ChecarGas();

     Almoxarife almoxarife = new Almoxarife();
     //nao tem que estar disponível por toda a aplicaçao
     almoxarife.checarEntradaIngredientes();

     //açoes que so o pacote cozinha precisa conhecer (pesquisa o que é default)
     almoxarife.entregarIngredientes();
     almoxarife.trocarGas();

     Atendente atendente = new Atendente();
     atendente.pegarPratoNoBalcao();

     Cliente cliente = new  Cliente();
     cliente.comer();

     //ação sigilosa, deixa ela privada
     cliente.checarSaldo();

    //pro cliente nao ouvir as conversas entre o cozinheiro e o almoxarife sobre a troca do gas
    cozinheiro.pedirParaTrocarGas(almoxarife);
    
    }    
}