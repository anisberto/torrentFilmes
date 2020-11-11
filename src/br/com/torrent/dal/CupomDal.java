package br.com.torrent.dal;

import br.com.torrent.model.CupomModel;
import br.com.torrent.model.FilmeModel;
import br.com.torrent.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import br.com.torrent.interfaces.CupomInterface;

/**
 *
 * @author edivan
 */
public class CupomDal implements CupomInterface {

    private Connection conect;

    public CupomDal() throws Exception {
        this.conect = Conexao.getInstance().getConnection();
    }

    @Override
    public CupomModel gerarRadon(String cupon) {
        CupomModel retCupom = new CupomModel();
        try {
            PreparedStatement prep = conect.prepareStatement("SELECT cup_usuarios(round(random() * 59 + 1)) cup_porcentagem");
            //prep.setString(1, cupon);
            ResultSet rs = prep.executeQuery();
            System.out.println(cupon);
            retCupom.setPorcentagem(rs.getDouble("cup_porcentagem"));
//            if (rs.next()) {
//                retCupom.setPorcentagem(rs.getDouble("cup_porcentagem"));
//            }
        } catch (Exception e) {
            try {
                throw new Exception("Erro ao gerar o RANDOM!!\n" + e.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(CupomDal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return retCupom;
    }

}
