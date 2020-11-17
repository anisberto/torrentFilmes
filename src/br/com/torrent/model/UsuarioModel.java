package br.com.torrent.model;

import java.util.InputMismatchException;

public class UsuarioModel {

    private int iden;
    private String nome;
    private String cpf;
    private String email;
    private String senha;
    private CupomModel cupom;

    public UsuarioModel() {
    }

    public UsuarioModel(String cpf) {
        this.cpf = cpf;
    }

    public UsuarioModel(int iden, String nome, String cpf, String email, String senha, CupomModel cupom) {
        this.iden = iden;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.cupom = cupom;
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
//    public void setCpf(String cpf) throws Exception {
//        if (isCPF(cpf) == false) {
//            throw new Exception("Cpf Invalido!!!");
//        }
//        this.cpf = cpf;
//    }

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

    public CupomModel getCupom() {
        return cupom;
    }

    public void setCupom(CupomModel cupom) {
        this.cupom = cupom;
    }

    @Override
    public String toString() {
        return "UsuarioModel{" + "iden=" + iden + ", nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", senha=" + senha + ", cupom=" + cupom.getPorcentagem() + '}';
    }

}
