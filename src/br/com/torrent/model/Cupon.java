package br.com.torrent.model;

/**
 *
 * @author edivan
 */
// melhor gera essa o radon e a data no banco de dados postrgres
// https://www.savepoint.blog.br/2015/11/26/gerando-valores-aleatorios-ou-quase/
public class Cupon {

    private double porcentagem;
    private int data_geracao;
    private int rando;

    public Cupon() {
    }

    public Cupon(double porcentagem, int data_geracao, int rando) {
        this.porcentagem = porcentagem;
        this.data_geracao = data_geracao;
        this.rando = rando;
    }

    public double getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(double porcentagem) {
        this.porcentagem = porcentagem;
    }

    public int getData_geracao() {
        return data_geracao;
    }

    public void setData_geracao(int data_geracao) {
        this.data_geracao = data_geracao;
    }

    public int getRando() {
        return rando;
    }

    public void setRando(int rando) {
        this.rando = rando;
    }

}
