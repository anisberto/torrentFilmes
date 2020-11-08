package br.com.torrent.model;

public class VisualizaModel {

    private int id;
    private UsuarioModel usuario;
    private FilmeModel fime;
    private String data_visualizacao;
    private boolean visuCompleto;

    public VisualizaModel(int id, UsuarioModel usuario, FilmeModel fime, String data_visualizacao, boolean visuCompleto) {
        this.id = id;
        this.usuario = usuario;
        this.fime = fime;
        this.data_visualizacao = data_visualizacao;
        this.visuCompleto = visuCompleto;
    }

    public VisualizaModel() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UsuarioModel getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioModel usuario) {
        this.usuario = usuario;
    }

    public FilmeModel getFime() {
        return fime;
    }

    public void setFime(FilmeModel fime) {
        this.fime = fime;
    }

    public String getData_visualizacao() {
        return data_visualizacao;
    }

    public void setData_visualizacao(String data_visualizacao) {
        this.data_visualizacao = data_visualizacao;
    }

    public boolean isVisuCompleto() {
        return visuCompleto;
    }

    public void setVisuCompleto(boolean visuCompleto) {
        this.visuCompleto = visuCompleto;
    }

    @Override
    public String toString() {
        return "VisualizaModel{" + "id=" + id + ", usuario=" + usuario + ", fime=" + fime + ", data_visualizacao=" + data_visualizacao + ", visuCompleto=" + visuCompleto + '}';
    }

}
