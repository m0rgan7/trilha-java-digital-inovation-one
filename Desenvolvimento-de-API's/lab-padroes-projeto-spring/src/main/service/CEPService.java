package Desenvolvimento_de_APIs.lab_padroes_projeto_spring.src.main.service;

import digital.inovation.labpadroesprojetospring.client.ViaCepClient;
import digital.inovation.labpadroesprojetospring.exception.CepInvalidoException;
import digital.inovation.labpadroesprojetospring.model.Endereco;
import Desenvolvimento_de_APIs.lab_padroes_projeto_spring.src.main.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CepService {

    @Autowired
    private ViaCepClient viaCepClient;

    @Autowired
    private EnderecoRepository enderecoRepository;

    public Endereco buscarEndereco(String cep) {
        Optional<Endereco> enderecoSalvo = enderecoRepository.findById(cep);
        if (enderecoSalvo.isPresent()) {
            return enderecoSalvo.get();
        }

        Endereco enderecoApi = viaCepClient.buscarEnderecoPorCep(cep);
        if (enderecoApi.getCep() == null || enderecoApi.getCep().isEmpty()) {
            throw new CepInvalidoException(cep);
        }

        enderecoRepository.save(enderecoApi);
        return enderecoApi;
    }
}
