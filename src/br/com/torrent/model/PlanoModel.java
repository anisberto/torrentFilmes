package br.com.torrent.model;

public class PlanoModel {

    private int id;
    private boolean acessoSimultaneo;
    private String nome;
    private double preco;

    public PlanoModel(int id, boolean acessoSimultaneo, String nome, double preco) {
        this.id = id;
        this.acessoSimultaneo = acessoSimultaneo;
        this.nome = nome;
        this.preco = preco;
    }

    public PlanoModel() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAcessoSimultaneo() {
        return acessoSimultaneo;
    }

    public void setAcessoSimultaneo(boolean acessoSimultaneo) {
        this.acessoSimultaneo = acessoSimultaneo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "PlanoModel{" + "id=" + id + ", acessoSimultaneo=" + acessoSimultaneo + ", nome=" + nome + ", preco=" + preco + '}';
    }

}
