/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplos.yt.aulajtable2;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Mateus Campos
 */
public class MeuTableModel extends AbstractTableModel {

    private final String[] mNomesColunas = {"Nome", "Idade"};

    private final List<Pessoa> mLista;

    public MeuTableModel(List<Pessoa> pListaPessoas) {
        mLista = pListaPessoas;
    }

    @Override
    public int getRowCount() {
        if (null == mLista) {
            return 0;
        }
        return mLista.size();
    }

    @Override
    public int getColumnCount() {
        return mNomesColunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch (coluna) {
            case 0:
                return mLista.get(linha).getNome();
            case 1:
                return mLista.get(linha).getIdade();
            default:
                return 0;
        }
    }

    // métodos opcionais, porém importantes
    public String getColumnName(int indice) {
        return mNomesColunas[indice];
    }

    public Class getColClass(int coluna) {
        switch (coluna) {
            case 0:
                return String.class;
            case 1:
                return Integer.class;
            default:
                return null;
        }
    }
    public Pessoa getPessoa(int linha) {
        Pessoa pessoaDaLinha = new Pessoa();
        pessoaDaLinha.setNome(mLista.get(linha).getNome());
        pessoaDaLinha.setIdade(mLista.get(linha).getIdade());
        
        return pessoaDaLinha;
    }
}
