package br.com.torrent.dal;

import br.com.torrent.interfaces.VisualizaInterface;
import br.com.torrent.model.VisualizaModel;
import br.com.torrent.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Date;

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
            PreparedStatement prep = conect.prepareStatement("INSET INTO "
                    + "visualiza (vis_data_visualizacao, vis_completo, vis_fil_iden, vis_cup_iden)"
                    + "values(?,?,?,?)");
            prep.setDate(1, new java.sql.Date(new Date(vizualiza.getData_visualizacao()).getTime()));
            prep.setBoolean(2, vizualiza.isVisuCompleto());
            prep.setInt(3, vizualiza.getFime().getIden());
            prep.setInt(4, vizualiza.getUsuario().getIden());
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VisualizaModel getVisualizacaoById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
