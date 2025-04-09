import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao{
    public static void main(String[] args) {
    //   Number valor = Double.valueOf("a1.75");
    //pra abrir certinho aperta ctrl e clica no valueOf. esse é um erro que tem que esperar acontecer pra poder resolver, ele é um erro que nao esperam que vc trate
        Number valor;
        try {
            valor = NumberFormat.getNumberInstance().parse("a1.75");
            System.out.println(valor);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    //pesquisa mais sobre pois nao entendi o motivo de trocar pra esse outro codigo na linha 10 o invés do na linha 6

    }
} 