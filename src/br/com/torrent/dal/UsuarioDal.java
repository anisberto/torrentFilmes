package br.com.torrent.dal;

import br.com.torrent.interfaces.UsuarioInterface;
import br.com.torrent.model.UsuarioModel;
import br.com.torrent.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
    public void deleteUsuario(int usuario) {
        try {
            PreparedStatement prep = conect.prepareStatement("DELETE FROM cup_usuarios WHERE cup_iden=?");
            prep.setInt(1, usuario);
            prep.executeUpdate();
        } catch (Exception e) {
        }
    }

    @Override
    public void updateUsuario(UsuarioModel usuario) {
        try {
            PreparedStatement prep = conect.prepareStatement("UPDATE cup_usuarios set  cup_nome=?, cup_cpf=?, cup_email=?, cup_senha=? where cup_iden=?;");

            prep.setString(1, usuario.getNome());
            prep.setInt(2, usuario.getIden());
            prep.setString(3, usuario.getEmail());
            prep.setString(4, usuario.getSenha());
            prep.executeUpdate();
        } catch (Exception e) {
        }
    }

    @Override
    public ArrayList<UsuarioModel> getAllUsuario() {
        ArrayList<UsuarioModel> usuarios = new ArrayList<UsuarioModel>();
        try {
            Statement statement = conect.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM cup_usuarios");
            while (rs.next()) {
                UsuarioModel novoUsuario = new UsuarioModel();
                novoUsuario.setIden(rs.getInt("cup_iden"));
                novoUsuario.setNome(rs.getString("cup_nome"));
                novoUsuario.setCpf(rs.getString("cup_cpf"));
                novoUsuario.setEmail(rs.getString("cup_email"));
                novoUsuario.setSenha(rs.getString("cup_senha"));
                usuarios.add(novoUsuario);
            }
            return usuarios;
        } catch (Exception e) {
            try {
                throw new Exception("Erro ao Listar todos os usuarios: " + e.getMessage());
            } catch (Exception ex) {
                Conexao conec = Conexao.getInstance();
                conec.notifyObservers();
                Logger.getLogger(UsuarioDal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;

    }

    @Override
    public UsuarioModel getUsuarioById(int id) {
        UsuarioModel retUsuario = new UsuarioModel();

        try {
            String sql = "SELECT * FROM cup_usuarios WHERE cup_iden=?";
            PreparedStatement preparedStatement = conect.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                
                retUsuario.setIden(rs.getInt("cup_iden"));
                retUsuario.setNome(rs.getString("cup_nome"));
                retUsuario.setCpf(rs.getString("cup_cpf"));
                retUsuario.setEmail(rs.getString("cup_email"));
                retUsuario.setSenha(rs.getString("cup_senha"));
            }
        } catch (Exception erro) {
            try {
                throw new Exception("Erro ao buscar no banco de dados: !!\n" + erro.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(UsuarioDal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return retUsuario;
    }

    @Override
    public UsuarioModel findUsuarioName(String nome) {
        UsuarioModel retUsuario = new UsuarioModel();
        try {
            PreparedStatement prep = conect.prepareStatement("SELECT * FROM cup_usuarios WHERE cup_nome=?");                      
            prep.setString(1, nome);
            ResultSet rs = prep.executeQuery();
            if (rs.next()) {
                retUsuario.setIden(rs.getInt("cup_iden"));
                retUsuario.setNome(rs.getString("cup_nome"));
                retUsuario.setCpf(rs.getString("cup_cpf"));
                retUsuario.setCpf(rs.getString("cup_email"));
                retUsuario.setSenha(rs.getString("cup_senha"));
            }
        } catch (Exception erro) {
            try {
                throw new Exception("Erro ao buscar no banco de dados: Alunos!!\n" + erro.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(UsuarioDal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
}
