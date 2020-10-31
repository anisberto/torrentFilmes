package br.com.torrent.model;

public class ContratoModel {

    private int id;
    private String fim;
    private String inicio;
    private PlanoModel id_plano;

    public ContratoModel(int id, String fim, String inicio, PlanoModel plano) {
        this.id = id;
        this.fim = fim;
        this.inicio = inicio;
        this.id_plano = plano;
    }

    public ContratoModel() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "ContratoModel{" + "id=" + id + ", fim=" + fim + ", inicio=" + inicio + ", id_plano=" + id_plano.getNome()+ '}';
    }

}
