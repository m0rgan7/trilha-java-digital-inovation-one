import java.util.Scanner;

 public class ControleDeFluxo {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
	
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
            terminal.close();
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		
		
		int contagem = parametroDois - parametroUm;

		for (int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o número " + i);
		}
	}
}

class ParametrosInvalidosException extends Exception{
   public ParametrosInvalidosException(String message){
     super(message);
   }
}


/* Minha tentativa de fazer sem o esboço que passaram:

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

*/

