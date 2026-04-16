import java.util.Scanner;

public class InversorDeNumero{
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        System.out.println ("Digite um numero inteiro sem dar espaços (ex: 12345): ");
        int numero = input.nextInt();
        int inverso = 0;

        while (numero != 0){
            int digito = numero % 10; //pega o ultimo digito do numero
            inverso = inverso * 10 + digito; //adiciona o digito ao inverso
            numero /= 10; //remove o ultimo digito do numero
        }
        System.out.println("O numero invertido é: " + inverso);
        input.close();
    }
}