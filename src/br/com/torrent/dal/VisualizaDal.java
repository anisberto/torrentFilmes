package br.com.torrent.dal;

import br.com.torrent.interfaces.VisualizaInterface;
import br.com.torrent.model.VisualizaModel;
import br.com.torrent.util.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class VisualizaDal implements VisualizaInterface {

    Connection conect;
    UsuarioDal usuario = new UsuarioDal();
    FilmesDal filme = new FilmesDal();

    public VisualizaDal() throws Exception {
        conect = Conexao.getInstance().getConnection();
    }

    @Override
    public void adicionarVisualizacao(VisualizaModel vizualiza) {
        try {
            PreparedStatement prep = conect.prepareStatement("INSERT INTO "
                    + "visualiza (vis_completo, vis_fil_iden, vis_cup_iden)"
                    + "values(?,?,?)");
            prep.setBoolean(1, vizualiza.isVisuCompleto());
            prep.setInt(2, vizualiza.getFime().getIden());
            prep.setInt(3, vizualiza.getUsuario().getIden());
            prep.executeUpdate();
        } catch (Exception e) {
        }
    }

    @Override
    public void deleteVisualizacao(int vizualiza) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateVisualizacao(VisualizaModel vizualiza) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<VisualizaModel> getAllVisualizacoes() {
        try {
            FilmesDal filme = new FilmesDal();
            UsuarioDal usuario = new UsuarioDal();
        } catch (Exception e) {
        }

        ArrayList<VisualizaModel> visual = new ArrayList<VisualizaModel>();
        try {
            Statement statement = conect.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM visualiza");
            while (result.next()) {
                VisualizaModel novaVisua = new VisualizaModel();
                novaVisua.setId(result.getInt("vis_iden"));
                novaVisua.setDataVisualizacao(result.getString("vis_data_visualizacao"));
                novaVisua.setFime(filme.getFilmesById(result.getInt("vis_fil_iden")));
                novaVisua.setUsuario(usuario.getUsuarioById(result.getInt("vis_cup_iden")));
                novaVisua.setVisuCompleto(result.getBoolean("vis_completo"));
                visual.add(novaVisua);
            }
            return visual;
        } catch (Exception e) {
            try {
                throw new Exception("Erro ao Listar todos os Planos: " + e.getMessage());
            } catch (Exception ex) {
                Conexao conec = Conexao.getInstance();
                conec.notifyObservers();
                Logger.getLogger(PlanoDal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    @Override
    public VisualizaModel getVisualizacaoById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
