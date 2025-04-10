import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        
        double mesada = 50;
        while(mesada>0){
            double valorDoce = ThreadLocalRandom.current().nextDouble(0,50);
            //o valorAleatório nao tava funcionando pra mim então modifiquei
            if (valorDoce > mesada)
            valorDoce = mesada;

            System.out.println("Valor do doce: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }

        System.out.println("Mesada " + mesada);
        System.out.println("Joao gastou toda sua mesada em doces.");

        /* while (expressao booleana de validaçao)
         * {
         * comando que será executado ate que a condiçao booleana se torne falsa
         * }
         */

    }
}