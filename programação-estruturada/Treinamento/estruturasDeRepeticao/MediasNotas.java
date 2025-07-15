import java.util.Scanner;

public class MediaNotas{
    public static void main (String [] args){
        Scanner input = new Scanner (System.in;

        do {
            System.out.println ("Digite a notas que deseja calcular a média: ");
            float nota = input.nextFloat();

             System.out.println("Deseja parar? ");
             String continuar = input.nextString;

            if (continuar = "nao"){
              break;

        } while (continuar = "sim");
  //esqueci de calcular a media e acho que a estrutura ta toda errada, nao tenho ideia de como que criam novas variaveis "notas" automaticamente
        input.close();
        }
  }
}
