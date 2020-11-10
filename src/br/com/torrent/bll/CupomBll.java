package br.com.torrent.bll;

import br.com.torrent.dal.CupomDal;
import br.com.torrent.model.CupomModel;
import br.com.torrent.interfaces.CupomInterface;

/**
 *
 * @author edivan
 */
public class CupomBll implements CupomInterface {

    CupomInterface novoCupom;

    public CupomBll() throws Exception {
        novoCupom = new CupomDal();
    }

    @Override
    public CupomModel gerarRadon(String cupon) {
        try {
            return novoCupom.gerarRadon(cupon);
        } catch (Exception e) {
        }
        return null;
    }

}
