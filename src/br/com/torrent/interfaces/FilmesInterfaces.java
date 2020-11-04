package br.com.torrent.interfaces;

import br.com.torrent.model.FilmeModel;
import java.util.ArrayList;

public interface FilmesInterfaces {

    public void adicionarFilmes(FilmeModel filme);

    public void deleteFilmes(int id);

    public void updateFilmes(FilmeModel filme);

    public ArrayList<FilmeModel> getAllFilmes();

    public FilmeModel getFilmesById(int id);

    public FilmeModel findFilmesTitulo(String titulo);
}
