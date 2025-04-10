class MinhaClasse {
    public static void main (String [] args) {
        String primeiroNome = "Morgan";
        String segundoNome = "Melo";

//por que que tem esse segundo "nomeCompleto?" e por que nao roda sem ele?
        String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);
        System.out.println(nomeCompleto);
    }
//da erro se nao tiver essa parte, mas nao entendi o pra que que ela existe
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
        }
}
