/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.torrent.bll;

import br.com.torrent.dal.FilmesDal;
import br.com.torrent.model.FilmeModel;
import java.util.List;

/**
 *
 * @author AnthonnyMax
 */
public class FilmesBll {
    
    private FilmesDal filmesDao;

    public FilmesBll() throws Exception {
        filmesDao = new FilmesDal();
    }

    // 1�
    public void adicionarFilmes(FilmeModel filme) throws Exception {
        filmesDao.adicionarFilme(filme);
    }

    // 2�
    public void removerFilmes(FilmeModel filme) throws Exception {
        filmesDao.deleteUsuario(filme.getIden());
    }

    // 3�
    public void alterarFilmes(FilmeModel filme) throws Exception {
        filmesDao.updateFilme(filme);
    }

    // 4� 
    public List<FilmeModel> consultarFilmes() throws Exception {
        return filmesDao.getAllFilme();
    }

    // 5�
    public FilmeModel consultarFilmesPorId(int id) throws Exception {
        return filmesDao.getFilmeById(id);
    }
}
