package Desenvolvimento_de_APIs.lab_padroes_projeto_spring.src.main.repository;

import Desenvolvimento_de_APIs.lab_padroes_projeto_spring.src.main.model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, String> {
}
