package dio.my_first_web_api.controller;

import java.util.List;
import dio.my_first_web_api.model.Usuario;
import dio.my_first_web_api.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;
    public List<Usuario> getUsuarios(){
        return repository.findALL();
    }
}
