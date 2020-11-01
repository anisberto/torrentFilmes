package br.com.torrent.dal;

import br.com.torrent.interfaces.PlanoInterface;
import br.com.torrent.model.PlanoModel;
import br.com.torrent.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PlanoDal implements PlanoInterface {

    private Connection conect;

    public PlanoDal() throws Exception {
        this.conect = Conexao.getInstance().getConnection();
    }

    @Override
    public void adicionarPlano(PlanoModel plano) {
        try {
            PreparedStatement prepared = conect.prepareCall("INSERT INTO planos(pla_acesso_simultaneo, pla_nome, pla_preco)\n"
                    + "	VALUES (?, ?, ?);");
            prepared.setBoolean(1, plano.isAcessoSimultaneo());
            prepared.setString(2, plano.getNome());
            prepared.setDouble(3, plano.getPreco());
            prepared.executeUpdate();
        } catch (SQLException e) {
            try {
                throw new Exception("Erro ao incluir novo Plano!" + e.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(PlanoDal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public ArrayList<PlanoModel> getAllPlano() {
        ArrayList<PlanoModel> planos = new ArrayList<PlanoModel>();
        try {
            Statement statement = conect.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM planos");
            while (result.next()) {
                PlanoModel novoPlano = new PlanoModel();
                novoPlano.setId(result.getInt("pla_iden"));
                novoPlano.setAcessoSimultaneo(result.getBoolean("pla_acesso_simultaneo"));
                novoPlano.setNome(result.getString("pla_nome"));
                novoPlano.setPreco(result.getDouble("pla_preco"));
                planos.add(novoPlano);
            }
            return planos;
        } catch (Exception e) {
            try {
                throw new Exception("Erro ao Listar todos os Planos: " + e.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(PlanoDal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    @Override
    public void deletePlano(PlanoModel plano) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updatePlano(PlanoModel plano) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PlanoModel getPlanoById(int id) {
        PlanoModel retPlano = new PlanoModel();
        try {
            PreparedStatement prep = conect.prepareStatement("SELECT * FROM planos where pla_iden =?");
            prep.setInt(0, id);
            ResultSet resul = prep.executeQuery();
            while (resul.next()) {
                retPlano.setId(resul.getInt("pla_iden"));
                retPlano.setNome(resul.getString("pla_nome"));
                retPlano.setAcessoSimultaneo(resul.getBoolean("pla_acesso_simultaneo"));
                retPlano.setPreco(resul.getDouble("pla_preco"));
            }
            return retPlano;
        } catch (Exception e) {
            try {
                throw new Exception("Erro ao buscar por id: " + e.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(PlanoDal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    @Override
    public PlanoModel findPlanoName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
