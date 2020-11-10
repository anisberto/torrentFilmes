package br.com.torrent.model;

public class VisualizaModel {

    private int id;
    private UsuarioModel usuario;
    private String dataVisualizacao;
    private FilmeModel fime;
    private boolean visuCompleto;

    public VisualizaModel(int id, UsuarioModel usuario, FilmeModel fime, boolean visuCompleto) {
        this.id = id;
        this.usuario = usuario;
        this.fime = fime;
        this.visuCompleto = visuCompleto;
    }

    public String getDataVisualizacao() {
        return dataVisualizacao;
    }

    public void setDataVisualizacao(String dataVisualizacao) {
        this.dataVisualizacao = dataVisualizacao;
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

    public boolean isVisuCompleto() {
        return visuCompleto;
    }

    public void setVisuCompleto(boolean visuCompleto) {
        this.visuCompleto = visuCompleto;
    }

    @Override
    public String toString() {
        return "VisualizaModel{" + "id=" + id + ", usuario=" + usuario.getNome() + ", dataVisualizacao=" + dataVisualizacao + ", fime=" + fime.getTitulo() + ", visuCompleto=" + visuCompleto + '}';
    }

}
