package br.com.torrent.dal;

import br.com.torrent.interfaces.CuponInterface;
import br.com.torrent.model.CupomModel;
import br.com.torrent.model.FilmeModel;
import br.com.torrent.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author edivan
 */
public class CupomDal implements CuponInterface {

    private Connection conect;

    public CupomDal() throws Exception {
        this.conect = Conexao.getInstance().getConnection();
    }

//    public CupomModel gerarRadon(CupomModel idRandon) throws Exception {
//        CupomModel cupon = new CupomModel();
//        String sql = "SELECT round(random() * 59 + 1) id_radon";
//
//        try {
//            PreparedStatement preparedStatement = conect.prepareStatement(sql);
//            preparedStatement.setInt(1, idRandon);
//            ResultSet rs = preparedStatement.executeQuery();
//            if (rs.next()) {
//                cupon.setPorcentagem(rs.getInt("id_radon"));
//            }
//        } catch (Exception erro) {
//            throw new Exception("Erro ao buscar no banco de dados: Alunos!!\n" + erro.getMessage());
//        }
//        return cupon;
//    }
    @Override
    public CupomModel gerarRadon(String cupon) {
        CupomModel retCupom = new CupomModel();
        try {
            PreparedStatement prep = conect.prepareStatement("SELECT round(random() * 59 + 1) id_radon");
            prep.setString(1, cupon);
            ResultSet rs = prep.executeQuery();
            if (rs.next()) {
                retCupom.setPorcentagem(rs.getInt("id_radon"));
            }
        } catch (Exception e) {
            try {
                throw new Exception("Erro ao gerar o RANDOM!!\n" + e.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(CupomDal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

}
