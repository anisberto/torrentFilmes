package br.com.torrent.interfaces;

import br.com.torrent.model.VisualizaModel;
import java.util.ArrayList;

public interface VisualizaInterface {

    public void adicionarVisualizacao(VisualizaModel vizualiza);

    public void deleteVisualizacao(int idVisu);

    public void updateVisualizacao(VisualizaModel vizualiza);

    public ArrayList<VisualizaModel> getAllVisualizacoes();

    public VisualizaModel getVisualizacaoById(int id);

}
