import java.util.Random;
public class ExemploDoWhile {
    public static void main(String[] args) {
        //a diferença entre esse e o outro é que esse aqui testa de pois de executar o codigo, ja o while é antes. significa que mesmo se for falso vai executar pelo menos uma vez.
        System.out.println("Discando...");

        do {
            System.out.println("Tocando...");
        } while (tocando());

        System.out.println("Alo!!!");  
        }

        public static boolean tocando() {
            boolean atendeu = new Random().nextInt(3)==1;
            System.out.println("Atendeu? " + atendeu);

            return ! atendeu;
    }
}
