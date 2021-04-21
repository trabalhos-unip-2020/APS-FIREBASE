package com.mycompany.firebase.menu;

/**
 *
 * @author Diogo Enrico Marianna
 */

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import com.mycompany.firebase.model.SpcModel;

public class MenuJTable extends AbstractTableModel{
    
    private ArrayList<SpcModel> linhas;
    String[] colunas;
    
    public MenuJTable(ArrayList<SpcModel> arrayspc, String[] colunas){
        this.colunas = colunas;
        linhas = arrayspc;
    }
    
    @Override
    public int getColumnCount(){//quantidade de colunas do modelo
        return colunas.length;
    }
    
    @Override
    public int getRowCount(){//quantidade de linhas atual do objeto
        return linhas.size();
    }
    
    @Override
    public String getColumnName(int indiceColuna){//retorna o nome da coluna
        return colunas[indiceColuna];
    }
    
    @Override
    public Object getValueAt(int row, int col){
        SpcModel bananaFlex = (SpcModel) linhas.get(row);
        switch (col){
            case 0:
                return bananaFlex.getFauflo();
            case 1:
                return bananaFlex.getGrupo();
            case 2:
                return bananaFlex.getFamilia();
            case 3:
                return bananaFlex.getEspecie();
            case 4:
                return bananaFlex.getNome_comum();
            case 5:
                return bananaFlex.getCategoria();
            case 6:
                return bananaFlex.getBioma();
            case 7:
                return bananaFlex.getAmeaca();
            case 8:
                return bananaFlex.getEstado();
            default:
                return null;
        }
    }
    
    public void addbananaFlex(ArrayList<SpcModel> bananaflex){
        int tamanhoLista = getRowCount();

        linhas.addAll(bananaflex);

        fireTableRowsInserted(tamanhoLista, getRowCount() -1);
    }
}
