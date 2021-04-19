package com.mycompany.firebase.menu;

/**
 *
 * @author Diogo Enrico Marianna
 */

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import com.mycompany.firebase.model.SpcModel;

public abstract class MenuJTable extends AbstractTableModel{
    
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
        SpcModel especie = (SpcModel) linhas.get(row);
        switch (col){
            case 0:
                return especie.getFauflo();
            case 1:
                return 
        }
    }
}
