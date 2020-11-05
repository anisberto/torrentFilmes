package br.com.torrent.bll;

import br.com.torrent.dal.ContratoDal;
import br.com.torrent.interfaces.ContratoInterface;
import br.com.torrent.model.ContratoModel;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ContratoBll implements ContratoInterface {

    ContratoInterface contratobll;

    public ContratoBll() throws Exception {
        contratobll = new ContratoDal();
    }

    @Override
    public void adicionarContrato(ContratoModel contrato) {
        try {
            contratobll.adicionarContrato(contrato);
        } catch (Exception e) {
            try {
                throw new Exception("Erro ao incluir: " + e.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(ContratoBll.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void deleteContrato(int contrato) {
        try {
            contratobll.deleteContrato(contrato);
        } catch (Exception e) {
            try {
                throw new Exception("Erro ao Deletar: " + e.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(ContratoBll.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void updateContrato(ContratoModel contrato) {
        try {
            contratobll.updateContrato(contrato);
        } catch (Exception e) {
            try {
                throw new Exception("Erro ao atualizar: " + e.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(ContratoBll.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public ArrayList<ContratoModel> getAllContratos() {
        try {
            return contratobll.getAllContratos();
        } catch (Exception e) {
            try {
                throw new Exception("Erro ao listar: " + e.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(ContratoBll.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    @Override
    public ContratoModel getContratoById(int id) {
        try {
            return contratobll.getContratoById(id);
        } catch (Exception e) {
            try {
                throw new Exception("Erro ao buscar por id: " + e.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(ContratoBll.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    @Override
    public ContratoModel findContratoUsuName(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
