package Desenvolvimento_de_APIs.lab_padroes_projeto_spring.src.main.controller;

import Desenvolvimento_de_APIs.lab_padroes_projeto_spring.src.main.Endereco;
import Desenvolvimento_de_APIs.lab_padroes_projeto_spring.src.main.CepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cep")
public class CepController {

    @Autowired
    private CepService cepService;

    @GetMapping("/{cep}")
    public Endereco buscarCep(@PathVariable String cep) {
        return cepService.buscarEndereco(cep);
    }
}
