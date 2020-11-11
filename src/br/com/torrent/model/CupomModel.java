package br.com.torrent.model;

import java.util.Random;
// melhor gera essa o radon e a data no banco de dados postrgres
// https://www.savepoint.blog.br/2015/11/26/gerando-valores-aleatorios-ou-quase/

public class CupomModel {

    private double porcentagem;
    private String data_geracao;

    public CupomModel() {
    }

    public CupomModel(double porcentagem, String data_geracao) {
        this.porcentagem = porcentagem;
        this.data_geracao = data_geracao;
    }

    public double getPorcentagem() {
        return porcentagem;
    }

    // criar metodo porcentagem
    public static int random() {
        Random rand = new Random();
        return rand.nextInt(61);
        //return rand.nextInt(60 - 0 + 1) - 1;
    }

    public void setPorcentagem(double porcentagem) {
        this.porcentagem = porcentagem;
    }

    public String getData_geracao() {
        return data_geracao;
    }

    public void setData_geracao(String data_geracao) {
        this.data_geracao = data_geracao;
    }

    @Override
    public String toString() {
        return "Cupon{" + "porcentagem=" + porcentagem + ", data_geracao=" + data_geracao + '}';
    }

    // teste de mesa
//    public static void main(String[] args) {
//        int a = CupomModel.random();
//        CupomModel cupom = new CupomModel();
//        cupom.setPorcentagem(a);
//        System.out.println(cupom);
//    }
}
