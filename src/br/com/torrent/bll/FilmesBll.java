package br.com.torrent.bll;

import br.com.torrent.dal.FilmesDal;
import br.com.torrent.interfaces.FilmesInterfaces;
import br.com.torrent.model.FilmeModel;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FilmesBll implements FilmesInterfaces {

    private FilmesDal filmesDao;

    public FilmesBll() throws Exception {
        filmesDao = new FilmesDal();
    }

    @Override
    public void adicionarFilmes(FilmeModel filme) {
        try {
            filmesDao.adicionarFilmes(filme);
        } catch (Exception e) {
            try {
                throw new Exception("Erro ao incluir: dal.erro." + e.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(FilmesBll.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void deleteFilmes(int id) {
        try {
            filmesDao.deleteFilmes(id);
        } catch (Exception e) {
            try {
                throw new Exception("Erro ao deletar: dal.erro." + e.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(FilmesBll.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void updateFilmes(FilmeModel filme) {
        try {
            filmesDao.updateFilmes(filme);
        } catch (Exception e) {
            try {
                throw new Exception("Erro ao atulizar: dal.erro." + e.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(FilmesBll.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public ArrayList<FilmeModel> getAllFilmes() {
        try {
            return filmesDao.getAllFilmes();
        } catch (Exception e) {
            try {
                throw new Exception("Erro ao listar todos: dal.erro." + e.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(FilmesBll.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    @Override
    public FilmeModel getFilmesById(int id) {
        try {
            filmesDao.getFilmesById(id);
        } catch (Exception e) {
            try {
                throw new Exception("Erro ao buscar por id: dal.erro." + e.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(FilmesBll.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    @Override
    public FilmeModel findFilmesTitulo(String titulo) {
        try {
            filmesDao.findFilmesTitulo(titulo);
        } catch (Exception e) {
            try {
                throw new Exception("Erro ao buscar por titulo: dal.erro." + e.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(FilmesBll.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
}
