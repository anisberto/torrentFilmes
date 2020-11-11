package br.com.torrent.model;

public class ContratoModel {

    private int id;
    private String fim;
    private String inicio;
    private String status;
    private PlanoModel id_plano;
    private UsuarioModel id_usu;
    private double precoComDesconto;

    public ContratoModel(int id, String fim, String inicio, String status, PlanoModel id_plano, UsuarioModel id_usu) {
        this.id = id;
        this.fim = fim;
        this.inicio = inicio;
        this.status = status;
        this.id_plano = id_plano;
        this.id_usu = id_usu;
        this.precoComDesconto = id_plano.getPreco()-((id_usu.getCupom().getPorcentagem() / 100) * id_plano.getPreco());
    }

    public ContratoModel() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UsuarioModel getId_usu() {
        return id_usu;
    }

    public void setId_usu(UsuarioModel id_usu) {
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
        precoComDesconto = id_plano.getPreco()-((id_usu.getCupom().getPorcentagem() / 100) * id_plano.getPreco());
        return precoComDesconto;
    }

    public void setPrecoComDesconto(double precoComDesconto) {
        this.precoComDesconto =  precoComDesconto;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ContratoModel{" + "id=" + id + ", fim=" + fim + ", inicio=" + inicio + ", status=" + status + ", id_plano=" + id_plano + ", id_usu=" + id_usu + '}';
    }

}
