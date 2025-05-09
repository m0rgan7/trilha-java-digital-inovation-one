package Desenvolvimento_de_APIs.lab_padroes_projeto_spring.src.main.exception;

public class CepInvalidException extends RuntimeException {
    public CepInvalidException(String cep) {
        super("CEP inválido ou não encontrado: " + cep);
    }
}