package br.com.exercicios.exercicio05;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String senha;
    private List<String> ultimasSenhas = new ArrayList<>();

    // Construtor
    public Usuario(String senha) {
        this.senha = senha;
        ultimasSenhas.add(senha);
    }

    // Método para alterar a senha
    public String alterarSenha(String novaSenha) {
        // Verifica se a nova senha é igual às três últimas utilizadas
        if (ultimasSenhas.contains(novaSenha)) {
            return "Senha não pode ser igual às três últimas utilizadas";
        }

        // Remove a senha mais antiga se houver mais de três senhas armazenadas
        if (ultimasSenhas.size() >= 3) {
            ultimasSenhas.remove(0);
        }

        // Verifica se a lista não está vazia
        if (!ultimasSenhas.isEmpty()) {
            // Adiciona a nova senha à lista de últimas senhas
            ultimasSenhas.add(novaSenha);
            return "Senha alterada com sucesso";
        }

        // Se a lista estiver vazia, retorna um erro
        return "Não é possível remover uma senha de uma lista vazia";
    }

    // Getter para a senha (pode ser útil em algumas situações)
    public String getSenha() {
        return senha; // Retorna a senha diretamente, sem necessidade de clone
    }
}
