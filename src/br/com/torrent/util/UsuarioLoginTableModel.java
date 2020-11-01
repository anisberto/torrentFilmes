package br.com.torrent.util;

import br.com.torrent.model.ContratoModel;
import br.com.torrent.model.UsuLoginModel;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class UsuarioLoginTableModel extends AbstractTableModel {

    ArrayList<UsuLoginModel> dados = null;
    String[] colunas = null;

    public UsuarioLoginTableModel(String[] colunas) {
        this.dados = new ArrayList<>();
        this.colunas = colunas;
    }

    private UsuarioLoginTableModel() {
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
                return dados.get(rowIndex).getLogin();
            default:
                throw new AssertionError();
        }
    }

    public void addRow(UsuLoginModel tipo) {
        this.dados.add(tipo);
    }

    public void update(ArrayList<UsuLoginModel> lista) {
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
            ArrayList<UsuLoginModel> lista = new ArrayList<>();
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

}
