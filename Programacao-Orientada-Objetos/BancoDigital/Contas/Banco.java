package BancoDigital.Contas;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas = new ArrayList<>();

    public Banco(String nome) {
        this.nome = nome;
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public List<Conta> getContas() {
        return contas;
    }

    public Conta buscarPorNumero(int numero) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }

    public String getNome() {
        return nome;
    }
}