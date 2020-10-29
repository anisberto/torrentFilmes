package br.com.torrent.bll;

import br.com.torrent.dal.CategoriaDal;
import br.com.torrent.model.CategoriaFilmesModel;
import br.com.torrent.model.Usuario;
import java.util.List;

/**
 *
 * @author CCE
 */
public class CategoriaBll {
    
    private CategoriaDal categoriaDao;

    public CategoriaBll() throws Exception {
        categoriaDao = new CategoriaDal();
    }

    // 1�
    public void adicionarCategoria(CategoriaFilmesModel categoria) throws Exception {
        categoriaDao.adicionarCategoria(categoria);
    }

    // 2�
    public void removerCategoria(CategoriaFilmesModel usuario) throws Exception {
        categoriaDao.deleteCategoria(usuario.getIden());
    }

    // 3�
    public void alterarCategoria(CategoriaFilmesModel categoria) throws Exception {
        categoriaDao.updateCategoria(categoria);
    }

    // 4� 
    public List<CategoriaFilmesModel> consultarCategoria() throws Exception {
        return categoriaDao.getAllCategoria();
    }

    // 5�
    public CategoriaFilmesModel consultarCategoriaPorId(int id) throws Exception {
        return categoriaDao.getCategoriaById(id);
    }
}
