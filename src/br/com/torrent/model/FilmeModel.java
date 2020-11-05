package br.com.torrent.model;


public class FilmeModel {

    private int iden;
    private String sinopse;
    private String titulo;
    private int ano;
    private CategoriaFilmesModel categoria;

    public FilmeModel() {

    }

    public FilmeModel(int iden, String sinopse, String titulo, int ano, CategoriaFilmesModel categoria) {
        this.iden = iden;
        this.sinopse = sinopse;
        this.titulo = titulo;
        this.ano = ano;
        this.categoria = categoria;
    }

    public int getIden() {
        return iden;
    }

    public void setIden(int iden) {
        this.iden = iden;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the categoria
     */
    public CategoriaFilmesModel getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(CategoriaFilmesModel categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Id Filme: " + iden + ", Titulo: " + titulo + ", Ano: " + ano + ", Sinope: " + sinopse + ", Categoria: " + getCategoria();
    }

}
