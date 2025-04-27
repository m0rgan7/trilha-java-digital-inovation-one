package ProgramacaOrientadaObjetos.estruturaControle.calculoImc;

public class Pessoa {
    private double altura;
    private double peso;

    public Pessoa(double altura, double peso) {
        this.altura = altura;
        this.peso = peso;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public String categoriaIMC() {
        double imc = calcularIMC();
        if (imc <= 18.5) {
            return "Abaixo do peso";
        } else if (imc <= 24.9) {
            return "Peso ideal";
        } else if (imc <= 29.9) {
            return "Levemente acima do peso";
        } else if (imc <= 34.9) {
            return "Obesidade Grau I";
        } else if (imc <= 39.9) {
            return "Obesidade Grau II (Severa)";
        } else {
            return "Obesidade III (Mórbida)";
        }
    }
}