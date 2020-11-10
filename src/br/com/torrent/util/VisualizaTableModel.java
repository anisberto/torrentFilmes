package br.com.torrent.util;

import br.com.torrent.model.VisualizaModel;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class VisualizaTableModel extends AbstractTableModel {

    ArrayList<VisualizaModel> dados = null;
    String[] colunas = null;

    public VisualizaTableModel(String[] colunas) {
        this.dados = new ArrayList<>();
        this.colunas = colunas;
    }

    private VisualizaTableModel() {
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
                return dados.get(rowIndex).isVisuCompleto()?"SIM":"NÃO";
            case 1:
                return dados.get(rowIndex).getId()+"";
            case 2:
                return dados.get(rowIndex).getFime().getTitulo();
            case 3:
                return dados.get(rowIndex).getUsuario().getNome();
            case 4:
                return dados.get(rowIndex).getDataVisualizacao();
            default:
                throw new AssertionError();
        }
    }

    public void addRow(VisualizaModel tipo) {
        this.dados.add(tipo);
    }

    public void update(ArrayList<VisualizaModel> lista) {
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
            ArrayList<VisualizaModel> lista = new ArrayList<>();
            for (int i = 0; i < dados.size(); i++) {
                for (int j = 0; j < dadosSV.length; j++) {
                    if (dados.get(i).getDataVisualizacao().equals(dadosSV[j])) {
                        lista.add(dados.get(i));
                    }
                }
            }
            update(lista);
        } catch (Exception e) {
            throw e;
        }
    }

}
