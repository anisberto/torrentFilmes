package br.com.torrent.util;

import br.com.torrent.model.ContratoModel;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ContratoTableModel extends AbstractTableModel {

    ArrayList<ContratoModel> dados = null;
    String[] colunas = null;

    public ContratoTableModel(String[] colunas) {
        this.dados = new ArrayList<>();
        this.colunas = colunas;
    }

    private ContratoTableModel() {
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
                return dados.get(rowIndex).getId_plano().getNome();
            case 1:
                return dados.get(rowIndex).getId_usu().getNome();
            case 2:
                return dados.get(rowIndex).getPrecoComDesconto() + "";
            case 3:
                return dados.get(rowIndex).getId_usu().getCupom().getPorcentagem() + "%";
            case 4:
                return dados.get(rowIndex).getInicio() + " - " + dados.get(rowIndex).getFim();
            case 5:
                return dados.get(rowIndex).getStatus();
            case 6:
                return "R$ " + dados.get(rowIndex).getId_plano().getPreco() + "";
            case 7:
                return "" + dados.get(rowIndex).getId();
            default:
                throw new AssertionError();
        }
    }

    public void addRow(ContratoModel tipo) {
        this.dados.add(tipo);
    }

    public void update(ArrayList<ContratoModel> lista) {
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
            ArrayList<ContratoModel> lista = new ArrayList<>();
            for (int i = 0; i < dados.size(); i++) {
                for (int j = 0; j < dadosSV.length; j++) {
                    if (dados.get(i).getInicio().equals(dadosSV[j])) {
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
