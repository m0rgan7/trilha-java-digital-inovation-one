package lanchonete;

import lanchonete.atendimento.Atendente;
import lanchonete.atendimentocliente.*;  //por que tem esse "*" aqui?
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
     Cozinheiro cozinheiro = new Cozinheiro();

     //açoes que o  estabelecimento precisa ter ciencia:
     cozinheiro.adicionarComidaNoBalcao();

     Atendente atendente = new Atendente();
     atendente.servirMesa();

     Cliente cliente = new  Cliente();
     cliente.comer();

    }    
}
