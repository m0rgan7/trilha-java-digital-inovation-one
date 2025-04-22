public class Usuario {

    //depois quero testar deixar public e so puxar essas variaveis no main pra ver o erro que daria

    private String nome;
    private int idade;

    public String getNome(){
        return nome;
    }
    public void setNome (String newNome){
        nome = newNome;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade  (int newIdade){
        idade = newIdade;
    }   
}