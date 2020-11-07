package br.com.torrent.model;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorPlano implements Iterator {

    PlanoModel[] array = null;
    int pos = 0;

    public IteratorPlano(ArrayList<PlanoModel> planos) throws Exception {
         if (planos == null) {
            throw new Exception("Colecao nao enviada");
        }
        this.array = array;
        pos = 0;
    }

    @Override
    public boolean hasNext() {
        if (pos == array.length) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        return array[pos++];
    }

}
