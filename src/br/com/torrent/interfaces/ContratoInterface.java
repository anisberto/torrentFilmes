package br.com.torrent.interfaces;

import br.com.torrent.model.ContratoModel;
import java.util.ArrayList;

public interface ContratoInterface {

    public void adicionarContrato(ContratoModel contrato);

    public void deleteContrato(ContratoModel contrato);

    public void updateContrato(ContratoModel contrato);

    public ArrayList<ContratoModel> getAllContratos();

    public ContratoModel getContratoById(int id);

    public ContratoModel findContratoUsuName();
}
