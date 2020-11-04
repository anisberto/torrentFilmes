package br.com.torrent.bll;

import br.com.torrent.dal.CategoriaDal;
import br.com.torrent.interfaces.CategoriasInterfaces;
import br.com.torrent.model.CategoriaFilmesModel;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CategoriaBll implements CategoriasInterfaces {

    private CategoriaDal categoriaDao;

    public CategoriaBll() throws Exception {
        categoriaDao = new CategoriaDal();
    }

    @Override
    public void adicionarCategorias(CategoriaFilmesModel categoria) {
        try {
            categoriaDao.adicionarCategorias(categoria);
        } catch (Exception e) {
            try {
                throw new Exception("Erro ao incluir: dal.error." + e.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(CategoriaBll.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void deleteCategorias(int id) {
        try {
            categoriaDao.deleteCategorias(id);
        } catch (Exception e) {
            try {
                throw new Exception("Erro ao deletar: dal.error." + e.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(CategoriaBll.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void updateCategorias(CategoriaFilmesModel categoria) {
        try {
            categoriaDao.updateCategorias(categoria);
        } catch (Exception e) {
            try {
                throw new Exception("Erro ao atualizar: dal.error." + e.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(CategoriaBll.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public ArrayList<CategoriaFilmesModel> getAllCategorias() {
        try {
            return categoriaDao.getAllCategorias();
        } catch (Exception e) {
            try {
                throw new Exception("Erro ao listar todas as categorias: dal.error." + e.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(CategoriaBll.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    @Override
    public CategoriaFilmesModel getCategoriasById(int id) {
        try {
            return categoriaDao.getCategoriasById(id);
        } catch (Exception e) {
            try {
                throw new Exception("Erro ao listar categoria: dal.error." + e.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(CategoriaBll.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    @Override
    public CategoriaFilmesModel findCategoriasName(String nome) {
        try {
            return categoriaDao.findCategoriasName(nome);
        } catch (Exception e) {
            try {
                throw new Exception("Erro ao listar categoria: dal.error." + e.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(CategoriaBll.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
}
