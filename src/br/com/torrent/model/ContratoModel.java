package br.com.torrent.model;

import br.com.torrent.enumerations.Status;
public class ContratoModel {

    private int id;
    private String fim;
    private String inicio;
    private String status;
    private PlanoModel id_plano;
    private double precoComDesconto;
    private Usuario id_usu;

    public ContratoModel(int id, String fim, String inicio, String status, PlanoModel id_plano, Usuario id_usu) {
        this.id = id;
        this.fim = fim;
        this.inicio = inicio;
        this.status = status;
        this.id_plano = id_plano;
        this.id_usu = id_usu;
        this.precoComDesconto = (getId_usu().getIden() * getId_plano().getPreco() - getId_plano().getPreco());
    }

    public ContratoModel() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getId_usu() {
        return id_usu;
    }

    public void setId_usu(Usuario id_usu) {
        this.id_usu = id_usu;
    }

    public String getFim() {
        return fim;
    }

    public void setFim(String fim) {
        this.fim = fim;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public PlanoModel getId_plano() {
        return id_plano;
    }

    public void setId_plano(PlanoModel id_plano) {
        this.id_plano = id_plano;
    }

    public String getStatus() {
        return status;
    }

    public double getPrecoComDesconto() {
        return precoComDesconto;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ContratoModel{" + "id=" + id + ", fim=" + fim + ", inicio=" + inicio + ", status=" + status + ", id_plano=" + id_plano + ", id_usu=" + id_usu + '}';
    }

}
