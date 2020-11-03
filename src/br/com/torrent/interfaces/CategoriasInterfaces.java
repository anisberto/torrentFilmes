package br.com.torrent.interfaces;

import br.com.torrent.model.CategoriaFilmesModel;
import java.util.ArrayList;

public interface CategoriasInterfaces {

    public void adicionarCategorias(CategoriaFilmesModel categoria);

    public void deleteCategorias(CategoriaFilmesModel categoria);

    public void updateCategorias(CategoriaFilmesModel categoria);

    public ArrayList<CategoriaFilmesModel> getAllCategorias();

    public CategoriaFilmesModel getCategoriasById(int id);

    public CategoriaFilmesModel findCategoriasName(String nome);
}
