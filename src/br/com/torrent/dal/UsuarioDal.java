package br.com.torrent.dal;

import br.com.torrent.interfaces.UsuarioInterface;
import br.com.torrent.model.Cupon;
import br.com.torrent.model.UsuarioModel;
import br.com.torrent.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDal implements UsuarioInterface {

    private Connection conect;

    public UsuarioDal() throws Exception {
        this.conect = Conexao.getInstance().getConnection();
    }

    @Override
    public void adicionarUsuario(UsuarioModel usuario) {

        try { // preparando a conexao;

            String sql = "INSERT INTO cup_usuarios (cup_nome, cup_cpf, cup_email, cup_senha) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = conect.prepareStatement(sql);
            preparedStatement.setObject(1, usuario.getNome());
            preparedStatement.setObject(2, usuario.getCpf());
            preparedStatement.setObject(3, usuario.getEmail());
            preparedStatement.setObject(4, usuario.getSenha());
            preparedStatement.executeUpdate(); // executa o comando da String sql;
        } catch (SQLException e) {
            try {
                throw new Exception("Erro ao incluir novo usuario!" + e.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(PlanoDal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void deleteUsuario(UsuarioModel usuario) {

        try {
            String sql = "DELETE FROM usuario WHERE usu_iden=?";
            PreparedStatement preparedStatement = conect.prepareStatement(sql);
            preparedStatement.setInt(1, usuario.getIden());
            preparedStatement.executeUpdate();
        } catch (SQLException erro) {
        }
    }

    @Override
    public void updateUsuario(UsuarioModel usuario) {
        try {
            String sql = "UPDATE usuario set  usu_nome=?, usu_cpf=?, usu_email=?, usu_senha=?, where usu_cup_iden=?";
            PreparedStatement preparedStatement = conect.prepareStatement(sql);
            preparedStatement.setString(1, usuario.getNome());
            preparedStatement.setInt(2, usuario.getIden());
            preparedStatement.setString(3, usuario.getEmail());
            preparedStatement.setString(4, usuario.getSenha());
            preparedStatement.executeUpdate();

        } catch (SQLException erro) {
        }
    }

    @Override
    public ArrayList<UsuarioModel> getAllUsuario() {
        List<UsuarioModel> usuarios = new ArrayList<UsuarioModel>();

        try {
            Statement statement = conect.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM cup_usuarios");
            while (rs.next()) {
                UsuarioModel novoUsuario = new UsuarioModel();
                novoUsuario.setIden(rs.getInt("cup_iden"));
                novoUsuario.setNome(rs.getString("cup_nome"));
                novoUsuario.setEmail(rs.getString("cup_email"));
                novoUsuario.setSenha(rs.getString("cup_senha"));
                novoUsuario.setCpf(rs.getString("cup_cpf"));
                usuarios.add(novoUsuario);
            }
            //return usuarios;
        } catch (Exception e) {
            try {
                throw new Exception("Erro ao Listar todos os usuarios: " + e.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(PlanoDal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;

    }

    @Override
    public UsuarioModel getUsuarioById(int id) {
        UsuarioModel retUsuario = new UsuarioModel();

        try {
            String sql = "SELECT * FROM usuario WHERE usu_iden=?";
            PreparedStatement preparedStatement = conect.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                retUsuario.setIden(rs.getInt("usu_id"));
                retUsuario.setNome(rs.getString("usu_nome"));
                retUsuario.setSenha(rs.getString("usu_senha"));
            }
        } catch (Exception erro) {
            try {
                throw new Exception("Erro ao buscar no banco de dados: Alunos!!\n" + erro.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(UsuarioDal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return retUsuario;
    }

    @Override
    public UsuarioModel findUsuarioName(String nome) {
        UsuarioModel usuario = new UsuarioModel();

        try {
            String sql = "SELECT * FROM cup_usuarios WHERE cup_nome=?";
            PreparedStatement preparedStatement = conect.prepareStatement(sql);
            preparedStatement.setString(1, nome);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                usuario.setIden(rs.getInt("cup_iden"));
                usuario.setNome(rs.getString("cup_nome"));
                usuario.setSenha(rs.getString("cup_senha"));
            }
        } catch (Exception erro) {
            try {
                throw new Exception("Erro ao buscar no banco de dados: Alunos!!\n" + erro.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(UsuarioDal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return usuario;
    }
}
