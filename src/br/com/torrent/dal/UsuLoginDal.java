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
        String sql = "INSERT INTO log_usuarios (log_login, log_senha,log_nome) VALUES (?, ?,?)";

        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setString(1, usuario.getLogin());
            preparedStatement.setString(2, usuario.getSenha());
            preparedStatement.setString(3, usuario.getNome());
            preparedStatement.executeUpdate();
        } catch (SQLException erro) {
            throw new Exception("Error ao inserir registro" + erro.getMessage());
        }
    }

    public void deleteUsuario(int id) throws Exception {
        String sql = "DELETE FROM log_usuarios WHERE log_iden=?";
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
        String sql = "UPDATE log_usuarios set  log_nome=?, log_login=?, log_senha=? where log_iden=?";
        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setString(1, usuario.getNome());
            preparedStatement.setString(2, usuario.getLogin());
            preparedStatement.setString(3, usuario.getSenha());
            preparedStatement.setInt(4, usuario.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException erro) {
            throw new Exception("Ocorreu um erro ao alterar este registro\n"
                    + erro.getMessage());
        }
    }

    public ArrayList<UsuLoginModel> getAllUsuario() throws Exception {
        List<UsuLoginModel> listUsuario = new ArrayList<UsuLoginModel>();
        String sql = "SELECT * FROM log_usuarios";
        try {
            Statement statement = (Statement) conexao.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                UsuLoginModel usuario = new UsuLoginModel();
                usuario.setId(rs.getInt("log_iden"));
                usuario.setNome(rs.getString("log_nome"));
                usuario.setLogin(rs.getString("log_login"));
                usuario.setSenha(rs.getString("log_senha"));
                listUsuario.add(usuario);
            }
        } catch (SQLException erro) {
            throw new Exception("Ocorreu um erro ao consultar os registros de fabricantes\n" + erro.getMessage());
        }
        return (ArrayList<UsuLoginModel>) listUsuario;
    }

    public UsuLoginModel getUsuarioById(int id) throws Exception {
        UsuLoginModel usuario = new UsuLoginModel();
        String sql = "SELECT * FROM log_usuarios WHERE log_iden=?";
        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                usuario.setId(rs.getInt("log_iden"));
                usuario.setNome(rs.getString("log_nome"));
                usuario.setLogin(rs.getString("log_login"));
                usuario.setSenha(rs.getString("log_senha"));
            }
        } catch (Exception erro) {
            throw new Exception("Erro ao buscar no banco de dados: Alunos!!\n" + erro.getMessage());
        }
        return usuario;
    }

    public UsuLoginModel findName(String nome) {
        UsuLoginModel usuario = new UsuLoginModel();
        try {
            PreparedStatement prepa = conexao.prepareStatement("select from log_usuarios where log_login =?");
            prepa.setString(1, nome);
            ResultSet rs = prepa.executeQuery();
            while (rs.next()) {
                usuario.setId(rs.getInt("log_iden"));
                usuario.setNome(rs.getString("log_nome"));
                usuario.setLogin(rs.getString("log_login"));
                usuario.setSenha(rs.getString("log_senha"));
            }
        } catch (Exception e) {
        }
        return usuario;
    }
}
