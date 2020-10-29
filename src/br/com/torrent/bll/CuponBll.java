package br.com.torrent.bll;

import br.com.torrent.dal.CuponDao;
import br.com.torrent.model.Cupon;

/**
 *
 * @author edivan
 */
public class CuponBll {
    private CuponDao cuponDao;

    public CuponBll() throws Exception {
    cuponDao = new CuponDao();
    }
    
    public Cupon gerarRadon(int idRandon) throws Exception{
        return cuponDao.gerarRadon(idRandon);
    }
    
}
