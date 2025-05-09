package dio.my_first_web_api.repository;

import java.util.ArrayList;
import java.util.List;
import dio.my_first_web_api.model.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario){
	if(usuario.getId()==null)
		System.out.println("SAVE - Recebendo usuário na camada de repositório");
	else
		System.out.println("Update - Recebendo usuário na camada de repositório");

	System.out.println(usuario);
	}
	public void deleteById(Integer id){
		System.out.println(String.format("DELETE/id - Recebendo o if: %d para excluir um usuario " , id));
		System.out.println(id);
	}
	public List<Usuario> findALL(){
		System.out.println("LIST - Listando os usuários do sistema");
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario("morgan", "password"));
        usuarios.add(new Usuario("frank", "masterpass"));
        return usuarios;
        }
        public Usuario findById(Integer id){
            System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuario", id));
            return new Usuario("morgan", "password");
        }
        public Usuario findByUserNnme(String username){
            System.out.println(String.format("FIND/username - Recebendo o username para localizar um usuario"));
            return new Usuario("morgan", "password");
        }
}