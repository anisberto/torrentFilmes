package br.com.torrent.util;

import java.util.ArrayList;
import br.com.torrent.model.PlanoModel;
import javax.swing.table.AbstractTableModel;

public class PlanoTableModel extends AbstractTableModel {

    ArrayList<PlanoModel> dados = null;
    String[] colunas = null;

    public PlanoTableModel(String[] colunas) {
        this.dados = new ArrayList<>();
        this.colunas = colunas;
    }

    private PlanoTableModel() {
        dados = null;
        colunas = null;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return dados.get(rowIndex).getNome();
            case 1:
                return dados.get(rowIndex).getPreco() + "";
            case 2:
                return dados.get(rowIndex).getId() + "";
            case 3:
                return dados.get(rowIndex).isAcessoSimultaneo() ? "SIM" : "NÃO";
            default:
                throw new AssertionError();
        }
    }

    public void addRow(PlanoModel tipo) {
        this.dados.add(tipo);
    }

    public void update(ArrayList<PlanoModel> lista) {
        try {
            dados.removeAll(dados);
            lista.forEach((tipo) -> {
                this.addRow(tipo);
            });
            this.fireTableDataChanged();
        } catch (Exception e) {
        }
    }

    public void update(String[] dadosSV) {
        try {
            ArrayList<PlanoModel> lista = new ArrayList<>();
            for (int i = 0; i < dados.size(); i++) {
                for (int j = 0; j < dadosSV.length; j++) {
                    if (dados.get(i).getNome().equals(dadosSV[j])) {
                        lista.add(dados.get(i));
                    }
                }
            }
            update(lista);
        } catch (Exception e) {
            throw e;
        }
    }

    public void update(PlanoModel next) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
