package it.step;

import java.util.ArrayList;
import java.util.List;


//В этом классе содержться паттерн Composite и патерн Iterator
public class MsCorporation implements Collection {
    private static List<AllUnits> compor = new ArrayList<>();

    private void allCompor(AllUnits... allUnits) {
        for (AllUnits a : allUnits) {
            compor.add(a);
        }
    }

    private void getReport() {
        for (AllUnits a : compor) {
            a.getUnits();
        }
    }

    public Iterator getIterator() {
        return new IteratorMy();
    }


    //Итератор
    private class IteratorMy implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            if(index < compor.size()){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            compor.get(index).getUnits();
            return compor.get(index++);
        }
    }

    public static void main(String[] args) {
        MsCorporation comp = new MsCorporation();

        comp.allCompor(new Develoment(),
                        new Eu(),
                        new Usa(),
                        new Uk(),
                        new Hh(),
                        new Market(),
                        new Game(),
                        new Office(),
                        new Os()
        );

        comp.getReport();

        //Итератор
        Iterator iter = comp.getIterator();

        while (iter.hasNext()){
            iter.next();
        }
    }
}
