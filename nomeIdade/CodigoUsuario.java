import java.util.Scanner;

public class CodigoUsuario {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    Usuario nomeIdade = new Usuario();

    System.out.println("Digite seu nome ");
    String nome = input.nextLine();
    nomeIdade.setNome(nome);

    System.out.println("Digite sua idade ");
    int idade = input.nextInt();
    nomeIdade.setIdade(idade);

    System.out.println("Oi " + nomeIdade.getNome() + " você tem " + nomeIdade.getIdade() + " anos de idade.");

    input.close();
  }   
}
/* so compila manualmente no terminal, tem que colocar:
* cd nomeIdade
* javac Usuario.java
* java CodigoUsuario.java */