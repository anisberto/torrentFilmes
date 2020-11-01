package br.com.torrent.dal;

import br.com.torrent.model.Usuario;
import br.com.torrent.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDal {

    private Connection conexao;

    public UsuarioDal() throws Exception {
        conexao = Conexao.getInstance().getConnection();
    }

    public void adicionarUsuario(Usuario usuario) throws Exception {
        String sql = "INSERT INTO usuario (usu_nome, usu_cpf, usu_email, usu_senha) VALUES (?, ?,?, ?, ? )";

        try { // preparando a conexao;
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setObject(1, usuario.getNome());
            preparedStatement.setObject(2, usuario.getCpf());
            preparedStatement.setObject(3, usuario.getEmail());
            preparedStatement.setObject(4, usuario.getSenha());

            preparedStatement.executeUpdate(); // executa o comando da String sql;
        } catch (SQLException erro) {
            throw new Exception("Error ao inserir registro" + erro.getMessage());
        }
    }

    public void deleteUsuario(int id) throws Exception {
        String sql = "DELETE FROM usuario WHERE usu_iden=?";
        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();

        } catch (SQLException erro) {
            throw new Exception("Ocorreu um erro ao deletar este registro!\n"
                    + erro.getMessage());
        }
    }

    public void updateUsuario(Usuario usuario) throws Exception {
        String sql = "UPDATE usuario set  usu_nome=?, usu_cpf=?, usu_email=?, usu_senha=?, where usu_cup_iden=?";

        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setString(1, usuario.getNome());
            preparedStatement.setInt(2, usuario.getIden());
            preparedStatement.setString(3, usuario.getEmail());
            preparedStatement.setString(4, usuario.getSenha());
            preparedStatement.executeUpdate();

        } catch (SQLException erro) {
            throw new Exception("Ocorreu um erro ao alterar este registro\n"
                    + erro.getMessage());
        }
    }

    public List<Usuario> getAllUsuario() throws Exception {
        List<Usuario> listUsuario = new ArrayList<Usuario>();
        try {
            Statement statement = conexao.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM cup_usuarios");
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setIden(rs.getInt("cup_iden"));
                usuario.setNome(rs.getString("cup_nome"));
                usuario.setEmail(rs.getString("cup_email"));
                usuario.setSenha(rs.getString("cup_senha"));
                usuario.setCpf(rs.getString("cup_cpf"));
                listUsuario.add(usuario);
            }
        } catch (SQLException erro) {
            throw new Exception("Ocorreu um erro ao consultar os registros de fabricantes\n" + erro.getMessage());
        }
        return listUsuario;
    }

    public Usuario getUsuarioById(int id) throws Exception {
        Usuario usuario = new Usuario();
        String sql = "SELECT * FROM usuario WHERE usu_iden=?";
        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                usuario.setIden(rs.getInt("usu_id"));
                usuario.setNome(rs.getString("usu_nome"));
                usuario.setSenha(rs.getString("usu_senha"));
            }
        } catch (Exception erro) {
            throw new Exception("Erro ao buscar no banco de dados: Alunos!!\n" + erro.getMessage());
        }
        return usuario;
    }
}
