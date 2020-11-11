package br.com.torrent.dal;

import br.com.torrent.interfaces.UsuarioInterface;
import br.com.torrent.model.CupomModel;
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

            String sql = "INSERT INTO cup_usuarios(\n"
                    + "	cup_porcentagem, cup_nome, cup_cpf, cup_email, cup_senha)\n"
                    + "	VALUES (?, ?, ?, ?, ?);";
            PreparedStatement preparedStatement = conect.prepareStatement(sql);
            preparedStatement.setString(2, usuario.getNome());
            preparedStatement.setString(3, usuario.getCpf());
            preparedStatement.setString(4, usuario.getEmail());
            preparedStatement.setString(5, usuario.getSenha());
            preparedStatement.setDouble(1, usuario.getCupom().getPorcentagem());

            preparedStatement.executeUpdate(); // executa o comando da String sql;
        } catch (SQLException e) {
            try {
                throw new Exception("Erro ao incluir novo usuario!" + e.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(UsuarioDal.class.getName()).log(Level.SEVERE, null, ex);
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
            prep.setString(2, usuario.getCpf());
            prep.setString(3, usuario.getEmail());
            prep.setString(4, usuario.getSenha());
            prep.setInt(5, usuario.getIden());
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
                CupomModel cupom = new CupomModel();
                UsuarioModel novoUsuario = new UsuarioModel();
                novoUsuario.setIden(rs.getInt("cup_iden"));
                novoUsuario.setNome(rs.getString("cup_nome"));
                novoUsuario.setCpf(rs.getString("cup_cpf"));
                novoUsuario.setEmail(rs.getString("cup_email"));
                novoUsuario.setSenha(rs.getString("cup_senha"));
                cupom.setPorcentagem(rs.getDouble("cup_porcentagem"));
                novoUsuario.setCupom(cupom);
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
                retUsuario.setEmail(rs.getString("cup_email"));
                retUsuario.setSenha(rs.getString("cup_senha"));
            }
        } catch (Exception e) {
            try {
                throw new Exception("Erro ao buscar no banco de dados: Alunos!!\n" + e.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(UsuarioDal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
}
