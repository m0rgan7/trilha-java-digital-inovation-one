public class FormatadorCepExemplo {
    
    public static void main(String[] args) {
        try{
        String cepFormatado = formatarCep("5545555");
        System.out.println(cepFormatado);
    } 
    catch (CepInvalidException e){
        e.printStackTrace();
        System.out.println("Não corresponde com as regras do CEP");
    }
}

//Esse tem algo a ver com o outro ou é só coincidência?
    static String formatarCep(String cep) throws CepInvalidException{
        if (cep.length() != 8)
            throw new CepInvalidException();

            //simulando um cep formatado
            return "xx.xxx-xxx";
    }
}

/*class CepInvalidException  extends Exception{
* pq que ele so funciona se for aqui no final? faz sentido com a logica de programação?
*  }
*/

/* Fiquei bem confusa pq tem umas coisas que nao foram declaradas e mesmo assim funciona sem declarar elas...
 * pra rodar tem que usar o seguinte comando no terminal:
 * javac FormatadorCepExemplo.java CepInvalidException.java
 * java FormatadorCepExemplo
 * 
 * Mas nesse exemplo o outro file não era necessário, tinha como colocar no final, igual coloquei na linha 24.
 * 
 * toda vez que tem conexao com outro da erro, a ide nao deve ta configurada direito, olha isso depois
 */

 
