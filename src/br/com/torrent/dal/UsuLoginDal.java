package br.com.torrent.dal;

import br.com.torrent.model.UsuLoginModel;
import br.com.torrent.util.Conexao;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UsuLoginDal {

    private Connection conexao;

    public UsuLoginDal() throws Exception {
        conexao = Conexao.getInstance().getConnection();
    }

    public void adicionarUsuario(UsuLoginModel usuario) throws Exception {
        String sql = "INSERT INTO usuario (usu_nome, usu_senha) VALUES (?, ? )";

        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setObject(1, usuario.getNome());
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

    public void updateUsuario(UsuLoginModel usuario) throws Exception {
        String sql = "UPDATE usuario set  usu_nome=?, usu_senha=?, where usu_iden=?";
        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setString(1, usuario.getNome());
            preparedStatement.setString(4, usuario.getSenha());
            preparedStatement.setInt(3, usuario.getId());
            preparedStatement.executeUpdate();

        } catch (SQLException erro) {
            throw new Exception("Ocorreu um erro ao alterar este registro\n"
                    + erro.getMessage());
        }
    }

    public Iterator<UsuLoginModel> getAllUsuario() throws Exception {
        List<UsuLoginModel> listUsuario = new ArrayList<UsuLoginModel>();
        String sql = "SELECT * FROM usuario";
        try {
            Statement statement = (Statement) conexao.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                UsuLoginModel usuario = new UsuLoginModel();
                usuario.setId(rs.getInt("usu_iden"));
                usuario.setNome(rs.getString("usu_nome"));
                usuario.setSenha(rs.getString("usu_senha"));
                listUsuario.add(usuario);
            }
        } catch (SQLException erro) {
            throw new Exception("Ocorreu um erro ao consultar os registros de fabricantes\n" + erro.getMessage());
        }
        return (Iterator<UsuLoginModel>) listUsuario;
    }

    public UsuLoginModel getUsuarioById(int id) throws Exception {
        UsuLoginModel usuario = new UsuLoginModel();
        String sql = "SELECT * FROM usuario WHERE usu_iden=?";
        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                usuario.setId(rs.getInt("usu_iden"));
                usuario.setNome(rs.getString("usu_nome"));
                usuario.setSenha(rs.getString("usu_senha"));
            }
        } catch (Exception erro) {
            throw new Exception("Erro ao buscar no banco de dados: Alunos!!\n" + erro.getMessage());
        }
        return usuario;
    }

    public UsuLoginModel findName(String nome) {
        UsuLoginModel usu = new UsuLoginModel();
        try {
            PreparedStatement prepa = conexao.prepareStatement("select * from usuario where usu_nome=?");
            prepa.setString(1, nome);
            ResultSet result = prepa.executeQuery();
            while (result.next()) {
                usu.setId(result.getInt("usu_iden"));
                usu.setNome(result.getString("usu_nome"));
                usu.setSenha(result.getString("usu_senha"));
            }
        } catch (Exception e) {
        }
        return usu;
    }
}
