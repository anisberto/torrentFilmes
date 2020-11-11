package br.com.torrent.util;

import br.com.torrent.model.UsuarioModel;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class UsuarioTableModel extends AbstractTableModel {

    ArrayList<UsuarioModel> dados = null;
    String[] colunas = null;

    public UsuarioTableModel(String[] colunas) {
        this.dados = new ArrayList<>();
        this.colunas = colunas;
    }

    public UsuarioTableModel() {
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
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return dados.get(rowIndex).getIden();
            case 1:
                return dados.get(rowIndex).getNome() + "";
            case 2:
                return dados.get(rowIndex).getCpf() + "";
            case 3:
                return dados.get(rowIndex).getEmail() + "";
            case 4:
                return dados.get(rowIndex).getCupom().getPorcentagem() + "";
            default:
                throw new AssertionError();
        }
    }

    public void addRow(UsuarioModel tipo) {
        this.dados.add(tipo);
    }

    public void update(ArrayList<UsuarioModel> lista) {
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
            ArrayList<UsuarioModel> lista = new ArrayList<>();
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
