package br.com.torrent.dal;

import br.com.torrent.interfaces.ContratoInterface;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import br.com.torrent.model.ContratoModel;
import br.com.torrent.util.Conexao;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ContratoDal implements ContratoInterface {

    private Connection conect;
    private PlanoDal planoDal = new PlanoDal();
    private UsuarioDal usuarioDal = new UsuarioDal();

    public ContratoDal() throws Exception {
        conect = Conexao.getInstance().getConnection();
    }

    @Override
    public void adicionarContrato(ContratoModel contrato) {
        try {
            PreparedStatement prep = conect.prepareStatement("INSERT INTO public.contrata(\n"
                    + "	con_status, con_fim, con_inicio, con_pla_iden, con_cup_iden, con_precocomdesconto)\n"
                    + "	VALUES (?, ?, ?, ?, ?, ?);");
            prep.setString(1, contrato.getStatus());
            prep.setDate(2, new java.sql.Date(new Date(contrato.getFim()).getTime()));
            prep.setDate(3, new java.sql.Date(new Date(contrato.getInicio()).getTime()));
            prep.setInt(4, contrato.getId_plano().getId());
            prep.setInt(5, contrato.getId_usu().getIden());
            prep.setDouble(6, contrato.getPrecoComDesconto());
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
    public ArrayList<ContratoModel> getAllContratos() {
        ArrayList<ContratoModel> contratos = new ArrayList<ContratoModel>();
        try {
            Statement statement = conect.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM contrata");
            while (result.next()) {
                ContratoModel novocontrato = new ContratoModel();
                novocontrato.setId(result.getInt("con_iden"));
                novocontrato.setStatus(result.getString("con_status"));
                novocontrato.setFim(result.getString("con_fim"));
                novocontrato.setInicio(result.getString("con_inicio"));
                novocontrato.setId_plano(planoDal.getPlanoById(result.getInt("con_pla_iden")));
                novocontrato.setId_usu(usuarioDal.getUsuarioById(result.getInt("con_cup_iden")));
                novocontrato.setPrecoComDesconto(result.getDouble("con_precocomdesconto"));
                contratos.add(novocontrato);
            }
            return contratos;
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
    public void deleteContrato(int contrato) {
        try {
            PreparedStatement prepa = conect.prepareStatement("DELETE FROM contrata\n"
                    + "	WHERE con_iden=?;");
            prepa.setInt(1, contrato);
            prepa.executeUpdate();
        } catch (Exception e) {
            try {
                throw new Exception("Erro ao deletar: dal.error.2445");
            } catch (Exception ex) {
                Logger.getLogger(ContratoDal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void updateContrato(ContratoModel contrato) {
        try {
            PreparedStatement prepare = conect.prepareStatement("UPDATE contrata\n"
                    + "	SET con_status=?, con_fim=?, con_inicio=?, con_pla_iden=?, con_cup_iden=?, con_precocomdesconto=?\n"
                    + "	WHERE con_iden=?;");
            prepare.setString(1, contrato.getStatus());
            prepare.setDate(2, new java.sql.Date(new Date(contrato.getFim()).getTime()));
            prepare.setDate(3, new java.sql.Date(new Date(contrato.getInicio()).getTime()));
            prepare.setInt(4, contrato.getId_plano().getId());
            prepare.setInt(5, contrato.getId_usu().getIden());
            prepare.setDouble(6, contrato.getPrecoComDesconto());
            prepare.setInt(7, contrato.getId());
            prepare.executeUpdate();
        } catch (Exception e) {
            try {
                throw new Exception("Erro ao atualizar: dal.error.2323");
            } catch (Exception ex) {
                Logger.getLogger(ContratoDal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public ContratoModel getContratoById(int id) {
        ContratoModel bContrato = new ContratoModel();
        try {
            PreparedStatement prep = conect.prepareStatement("SELECT * FROM contrata WHERE con_iden = ?");
            prep.setInt(1, id);
            ResultSet resultado = prep.executeQuery();

            while (resultado.next()) {
                bContrato.setId(resultado.getInt("con_iden"));
                bContrato.setStatus(resultado.getString("con_status"));
                bContrato.setFim(resultado.getDate("con_fim").toString());
                bContrato.setInicio(resultado.getDate("con_inicio").toString());
                bContrato.setId_plano(planoDal.getPlanoById(resultado.getInt("con_pla_iden")));
                bContrato.setId_usu(usuarioDal.getUsuarioById(resultado.getInt("con_cup_iden")));
                bContrato.setPrecoComDesconto(resultado.getDouble("con_precocomdesconto"));
            }
        } catch (Exception e) {
            try {
                throw new Exception("Erro ao buscar por id: dal.erro.1223");
            } catch (Exception ex) {
                Logger.getLogger(ContratoDal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return bContrato;
    }

    @Override
    public ContratoModel findContratoUsuName(String nome) {
        return null;
    }
}
