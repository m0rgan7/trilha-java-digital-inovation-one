package areaRetangulo;

import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Calculo valor = new Calculo();
        
        System.out.println("Digite o tamanho da base do retangulo: ");
        float base = input.nextFloat();
        valor.setBase(base);

        System.out.println("Digite a altura do retangulo: ");
        float altura = input.nextFloat();
        valor.setAltura(altura);

        float areaRetangulo = valor.getBase() * valor.getAltura();

        System.out.println(areaRetangulo);

       input.close();
    }
}

//Fala que ta certo mas nao rodaaa nem como javac, tenho que configurar a ide...