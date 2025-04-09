import java.util.Scanner;

public class ControleDeFluxo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        try{
            System.out.println("Digite o primeiro parâmetro");
            int primeiroParametro = scanner.nextInt();
       
            System.out.println("Digite o segundo parâmetro");
            int segundoParametro = scanner.nextInt();

            if (primeiroParametro > segundoParametro){
                throw new ParametrosInvalidosException("");
            }

            for (int parametros = primeiroParametro; parametros <= segundoParametro; parametros ++){
            System.out.println("Imprimindo numero " + parametros);
            }
        }
        catch (Exception e){

            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
        finally{
        scanner.close();
        }
    }
}

class ParametrosInvalidosException extends Exception{
    public ParametrosInvalidosException(String message) {
    }
}