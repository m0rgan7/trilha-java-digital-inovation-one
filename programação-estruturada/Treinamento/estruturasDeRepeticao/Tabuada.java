import java.util.Scanner;

public class Tabuada{
    public static void main (String [] args){
      Scanner input = new Scanner(System.in);
      int resultado;
      
      System.out.println ("Digite um número: ");
      int numero = input.nextInt();
      
        for (int n=1; n<=10; n++){
          resultado = numero * n;
            
          System.out.println (resultado);
        }      
        input.close();
  }
}
