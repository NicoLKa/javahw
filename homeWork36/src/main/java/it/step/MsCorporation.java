package it.step;

import java.util.ArrayList;
import java.util.List;

import it.step.example.*;

//В этом классе содержться паттерн Composite и патерн Iterator
//getUnits(); - вызов с исполозованием итератора
public class MsCorporation implements AllUnits {
    private List<AllUnits> compor = new ArrayList<>();
    private Conteiner cont = new Conteiner(compor);

    private void allCompor(AllUnits... allUnits) {
        for (AllUnits a : allUnits) {
            compor.add(a);
        }
    }

    @Override
    public void getUnits() {
        Iterator iter = cont.getIterator();

        while (iter.hasNext()) {
            iter.next();
        }
    }

    public static void main(String[] args) {
        // Зачем так много классов? Классов должно быть только два -
        // первый - который представляет составной объект (подразделение)
        // и второй - простой - отдел. Естественно должен быть и базовый класс

        // Пример находится в пакете example

        Unit corporation = new Branch("MS");
        corporation.add(new Branch("Dev"));
        corporation.getUnit("Dev").add(new Department("OS"));
        corporation.getUnit("Dev").add(new Department("Game"));
        corporation.getUnit("Dev").add(new Department("Office"));

        System.out.println(corporation.report());

        // MsCorporation comp = new MsCorporation();

        // comp.allCompor(new Develoment(),
        // new Eu(),
        // new Usa(),
        // new Uk(),
        // new Hh(),
        // new Market(),
        // new Game(),
        // new Office(),
        // new Os()
        // );

        // //Итератор
        // comp.getUnits();

    }
}
