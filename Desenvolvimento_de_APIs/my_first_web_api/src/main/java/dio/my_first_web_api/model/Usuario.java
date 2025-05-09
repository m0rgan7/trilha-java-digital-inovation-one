package dio.my_first_web_api.model;

public class Usuario {
    private Integer id;
    private String login, password; //pode assim?

    public Usuario() {} //o que que essa linha fez?

    public Usuario(String login, String password){
        this.login = login;
        this.password = password;
    }

@Override
public String toString(){
    return "User{" + //nao faz diferença deixar assim ou do outro que eu faria normalmente
   "login='" + login + '\'' + //esse '\'' ta dizendo que é pra guardar o ' nao o \, usa ele pro compilador ter certeza que nao é um erro de digoitação
           ", password='" + password + '\'' +
           '}';
  }
  
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}