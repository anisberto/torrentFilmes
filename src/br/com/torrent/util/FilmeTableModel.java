package br.com.torrent.util;

import br.com.torrent.model.FilmeModel;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class FilmeTableModel extends AbstractTableModel {

    ArrayList<FilmeModel> dados = null;
    String[] colunas = null;

    public FilmeTableModel(String[] colunas) {
        this.dados = new ArrayList<>();
        this.colunas = colunas;
    }

    private FilmeTableModel() {
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
                return dados.get(rowIndex).getIden() + "";
            case 1:
                return dados.get(rowIndex).getTitulo();
            case 2:
                return dados.get(rowIndex).getAno() + "";
            case 3:
                return dados.get(rowIndex).getCategoria().getNome();
            default:
                throw new AssertionError();
        }
    }

    public void addRow(FilmeModel tipo) {
        this.dados.add(tipo);
    }

    public void update(ArrayList<FilmeModel> lista) {
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
            ArrayList<FilmeModel> lista = new ArrayList<>();
            for (int i = 0; i < dados.size(); i++) {
                for (int j = 0; j < dadosSV.length; j++) {
                    if (dados.get(i).getTitulo().equals(dadosSV[j])) {
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
