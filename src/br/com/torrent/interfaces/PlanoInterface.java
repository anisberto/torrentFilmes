package br.com.torrent.interfaces;

import br.com.torrent.model.PlanoModel;
import java.util.ArrayList;
import java.util.Iterator;

public interface PlanoInterface {

    public void adicionarPlano(PlanoModel plano);

    public void deletePlano(PlanoModel plano);

    public void updatePlano(PlanoModel plano);

    public ArrayList<PlanoModel> getAllPlano();

    public PlanoModel getPlanoById(int id);

    public PlanoModel findPlanoName();
}
