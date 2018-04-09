package pkg3Program;

import java.util.Comparator;

public class HumanComparatorBySecondName implements Comparator<Human> {

    @Override
    public int compare(Human o1, Human o2) {
        int rez;
        if (o1.equals(o2)) return 0;
        rez = o1.getSecondName().compareToIgnoreCase(o2.getSecondName());
        return rez;
    }

}