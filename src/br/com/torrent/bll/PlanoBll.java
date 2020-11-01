package br.com.torrent.bll;

import br.com.torrent.dal.PlanoDal;
import br.com.torrent.interfaces.PlanoInterface;
import br.com.torrent.model.PlanoModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PlanoBll implements PlanoInterface {

    PlanoInterface novoPlano;

    public PlanoBll() throws Exception {
        novoPlano = new PlanoDal();
    }

    @Override
    public void adicionarPlano(PlanoModel plano) {
        try {
            novoPlano.adicionarPlano(plano);
        } catch (Exception e) {
            try {
                throw new Exception("Erro bll incluir" + e.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(PlanoBll.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void deletePlano(PlanoModel plano) {
        try {
            novoPlano.deletePlano(plano);
        } catch (Exception e) {
            try {
                throw new Exception(e.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(PlanoBll.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void updatePlano(PlanoModel plano) {
        try {
            novoPlano.updatePlano(plano);
        } catch (Exception e) {
            try {
                throw new Exception(e.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(PlanoBll.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public ArrayList<PlanoModel> getAllPlano() {
        try {
            return novoPlano.getAllPlano();
        } catch (Exception e) {
            try {
                throw new Exception(e.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(PlanoBll.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    @Override
    public PlanoModel getPlanoById(int id) {
        try {
            return novoPlano.getPlanoById(id);
        } catch (Exception e) {
            try {
                throw new Exception(e.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(PlanoBll.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    @Override
    public PlanoModel findPlanoName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
