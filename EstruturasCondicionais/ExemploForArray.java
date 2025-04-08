public class ExemploForArray {
    public static void main (String[] args){

        //em arrays o indice inicia em zero, se nao pula o primeiro que nesse exemplo é o felipe
        String alunos [] = {"Felipe", "Jonas", "Julia", "Marcos"};
        
        for (int x=0; x < alunos.length; x++){

            System.out.println("O aluno no x = " + x + " é " + alunos[x]);
        }

        /* Tem outra forma de fazer que seria:
        *
        * for (String aluno: alunos) {
        * esse ":" diz que pra cada interação de alunos o indice atual vai ser atualizado
        *
        * System.out.println ("Nome do aluno é: " + aluno);
        * }
        */
    }
}