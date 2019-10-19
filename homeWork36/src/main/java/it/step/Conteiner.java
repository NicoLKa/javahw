package it.step;

import java.util.List;

public class Conteiner implements Collection {
    private List<AllUnits> listI;

    Conteiner(List list){
        listI = list;
    }

    @Override
    public Iterator getIterator() {
        return new IteratorMy();
    }

    private class IteratorMy implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            if(index < listI.size()){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            listI.get(index).getUnits();
            return listI.get(index++);
        }
    }
}
