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

    System.out.println("O aluno " + nomeIdade.getNome() + " tem " + nomeIdade.getIdade());

    input.close();
  }   
}