package br.com.torrent.interfaces;

import br.com.torrent.model.CategoriaFilmesModel;
import java.util.ArrayList;

public interface CategoriasInterfaces {

    public void adicionarCategorias(CategoriaFilmesModel categoria) throws Exception;

    public void deleteCategorias(int id);

    public void updateCategorias(CategoriaFilmesModel categoria);

    public ArrayList<CategoriaFilmesModel> getAllCategorias();

    public CategoriaFilmesModel getCategoriasById(int id);

    public CategoriaFilmesModel findCategoriasName(String nome);

}
