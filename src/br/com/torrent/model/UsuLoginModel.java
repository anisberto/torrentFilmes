package br.com.torrent.model;

public class UsuLoginModel {

    private int id;
    private String nome;
    private String senha;

    public UsuLoginModel(int id, String nome, String senha) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
    }

    public UsuLoginModel(UsuLoginModel usuario) {
        this.id = usuario.getId();
        this.nome = usuario.getNome();
        this.senha = usuario.getSenha();
    }

    public UsuLoginModel() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
