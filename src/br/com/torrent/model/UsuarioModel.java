package br.com.torrent.model;

public class UsuarioModel {

    private int iden;
    private String nome;
    private String cpf;
    private String email;
    private String senha;
    private double desconto;

    public UsuarioModel() {
    }

    public UsuarioModel(int iden, String nome, String cpf, String email, String senha, double desconto) {
        this.iden = iden;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.desconto = desconto;

    }

    public int getIden() {
        return iden;
    }

    public void setIden(int iden) {
        this.iden = iden;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        return "UsuarioModel{" + "iden=" + iden + ", nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", senha=" + senha + ", desconto=" + desconto + '}';
    }

}
