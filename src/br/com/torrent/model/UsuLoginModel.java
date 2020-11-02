package br.com.torrent.model;

public class UsuLoginModel {

    private int id;
    private String login;
    private String nome;
    private String senha;

    public UsuLoginModel(String login, String nome, String senha) {
        this.id = id;
        this.login = login;
        this.nome = nome;
        this.senha = senha;
    }

    public UsuLoginModel(UsuLoginModel usuario) {
        this.id = usuario.getId();
        this.login = usuario.getNome();
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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

    @Override
    public String toString() {
        return "UsuLoginModel{" + "id=" + id + ", nome=" + login + ", senha=" + senha + '}';
    }

}
