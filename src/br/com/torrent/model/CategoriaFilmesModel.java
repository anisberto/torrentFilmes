package br.com.torrent.model;

public class CategoriaFilmesModel {

    private int iden;
    private String nome;

    public CategoriaFilmesModel() {

    }

    public CategoriaFilmesModel(int iden, String nome) {
        this.iden = iden;
        this.nome = nome;
    }

    /**
     * @return the iden
     */
    public int getIden() {
        return iden;
    }

    /**
     * @param iden the iden to set
     */
    public void setIden(int iden) {
        this.iden = iden;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Id Categoria: " + iden + ", Categoria: " + nome;
    }
}
