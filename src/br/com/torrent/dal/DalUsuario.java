package br.com.torrent.dal;

import br.com.torrent.model.Usuario;
import br.com.torrent.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DalUsuario {

    private Connection conexao;

    public DalUsuario() throws Exception {
        conexao = (Connection) Conexao.getInstance();
    }

    public void adicionarUsuario(Usuario usuario) throws Exception {
        String sql = "INSERT INTO usuario (usu_nome, usu_cpf, usu_email, usu_senha, usu_cup_iden) VALUES (?, ?,?, ?, ?, default )";

        try {
            // preparando a conexao;
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            // pegar os dados da variavel Alunos usando o getNome;
            preparedStatement.setObject(1, usuario.getNome());
            preparedStatement.setObject(2, usuario.getCpf());
            preparedStatement.setObject(3, usuario.getEmail());
            preparedStatement.setObject(4, usuario.getSenha());

            preparedStatement.executeUpdate(); // executa o comando da String sql;
        } catch (SQLException erro) {
            throw new Exception("Error ao inserir registro" + erro.getMessage());

        }
    }
}
