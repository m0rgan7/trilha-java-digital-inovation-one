import java.util.InputMismatchException;
//o codico dele nao tinha esse import, mas nao roda sem no meu, provavelmente é extensão que nao baixei, mas confirma depois

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
   public static void main(String[] args) {

    try{
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    //pesquisa sobre esse locale e porque é locale.us

    System.out.println("Digite seu nome: ");
    String nome = scanner.next();
    //por que ele declarou junto assim?  qual jeito é melhor, o meu ou esse? acabei de remarar que essa string so é scanner.next, mas eu coloquei next line em outro projeto...

    System.out.println("Digite sua idade: ");
    int idade = scanner.nextInt();
    //por que so o string começa maiúsculo? (o exemplo de exceção desse caso é que dará erro se o cliente digitar cursivo ao inves de colocar em numero)

    System.out.println("Digite sua altura: ");
    double altura = scanner.nextInt();
    //o possivel erro é o cliente colocar "," ao invés de "." tem um codigo seu que da esse erron aplica nele depois esse exceção

    //pra que serve esse uper case? no caso o dele tinha sobrenome e eu nao quis colocar, mas ele usava 'System.out.println("Me chamo " + nome.toUpperCase() + "" + sobrenome);'
    System.out.println("Me chamo " + nome);
    System.out.println("Minha idade é "+ idade);
    System.out.println("Minha altura é: "+ altura);

    scanner.close();
    }
    //nao entendi muito bem se o conteúdo em parenteses do catch sempre sera o que aparecer no terminal, se sempre será esse ou se tenho que pesquisar no manual do java, pois nosso trabalho também é prever erros né?
    catch (InputMismatchException e){
        System.out.println("Os campos idade e altura precisam ser numéricos e altura precisa utilizar '.'");
        //como que coloca aspas na mensagem impressa sem perder o colorido?
        //para uso do cliente poderia adicionar umas coisas tipo voltar a rodar apos mandar essa mensagem, usaria um while? se nao for possivel tem algum comando especifico pra voltar do inicio sem ser estrutura de repetiçao?
       }
   } 
}
