package br.com.torrent.dal;

import br.com.torrent.interfaces.ContratoInterface;
import java.sql.PreparedStatement;
import java.sql.Connection;
import br.com.torrent.model.ContratoModel;
import br.com.torrent.util.Conexao;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ContratoDal implements ContratoInterface {

    private Connection conect;

    public ContratoDal() throws Exception {
        conect = Conexao.getInstance().getConnection();
    }

    @Override
    public void adicionarContrato(ContratoModel contrato) {
        try {
            PreparedStatement prep = conect.prepareStatement("INSERT INTO contrata(\n"
                    + "	con_status, con_fim, con_inicio, con_pla_iden, con_cup_iden)\n"
                    + "	VALUES (?, ?, ?, ?, ?);");
            prep.setString(1, contrato.getStatus().toString());
            prep.setDate(2, new java.sql.Date(contrato.getFim().getTime()));
            prep.setDate(3, new java.sql.Date(contrato.getInicio().getTime()));
            prep.setInt(4, contrato.getId_plano().getId());
            prep.setInt(5, contrato.getId_usu().getIden());
            prep.executeUpdate();
        } catch (Exception e) {
            try {
                throw new Exception("Erro ao incluir: " + e.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(ContratoDal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void deleteContrato(ContratoModel contrato) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateContrato(ContratoModel contrato) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ContratoModel> getAllContratos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ContratoModel getContratoById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ContratoModel findContratoUsuName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
