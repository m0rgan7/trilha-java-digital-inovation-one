package dio.my_first_web_api.controller;

import java.util.List;
import dio.my_first_web_api.model.Usuario;
import dio.my_first_web_api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping ("/users")
    public List<Usuario> getUsuarios(){
        return repository.findALL();
    }

    @GetMapping ("/users/{username)")
    public Usuario geOne(@PathVariable("username") String username){
	return repository.findByUserNnme(username);
    }

    @DeleteMapping ("/users/{id}")
    public void deleteUser(@PathVariable("id") Integer id){
        repository.deleteById(id);
    }
}