package br.com.torrent.bll;

import br.com.torrent.dal.VisualizaDal;
import br.com.torrent.interfaces.VisualizaInterface;
import br.com.torrent.model.VisualizaModel;
import java.util.ArrayList;

public class VisualizaBll implements VisualizaInterface {

    VisualizaDal visua;

    public VisualizaBll() throws Exception {
        visua = new VisualizaDal();
    }

    @Override
    public void adicionarVisualizacao(VisualizaModel vizualiza) {
        try {
            visua.adicionarVisualizacao(vizualiza);
        } catch (Exception e) {
        }
    }

    @Override
    public void deleteVisualizacao(int vizualiza) {
        try {
            visua.deleteVisualizacao(vizualiza);
        } catch (Exception e) {
        }
    }

    @Override
    public void updateVisualizacao(VisualizaModel vizualiza) {
        try {
            visua.updateVisualizacao(vizualiza);
        } catch (Exception e) {
        }
    }

    @Override
    public ArrayList<VisualizaModel> getAllVisualizacoes() {
        try {
            return visua.getAllVisualizacoes();
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public VisualizaModel getVisualizacaoById(int id) {
        try {
            return visua.getVisualizacaoById(id);
        } catch (Exception e) {
        }
        return null;
    }

}
