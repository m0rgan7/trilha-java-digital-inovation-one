package ProgramacaOrientadaObjetos.estruturaControle.calculoImc;
import java.util.Scanner;

public class CalculoImc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua altura (em metros): ");
        double altura = scanner.nextDouble();

        System.out.print("Digite seu peso (em kg): ");
        double peso = scanner.nextDouble();

        Pessoa pessoa = new Pessoa(altura, peso);

        double imc = pessoa.calcularIMC();
        String categoria = pessoa.categoriaIMC();

        System.out.printf("Seu IMC é: %.2f\n", imc);
        System.out.println("Classificação: " + categoria);

        scanner.close();
    }
}

/* pra rodar tem que colocar no terminal:
 * cd estruturaControle
 * javac Pessoa.java
 * java CalculoImc.java
 */