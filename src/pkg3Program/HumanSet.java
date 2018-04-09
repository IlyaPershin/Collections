package pkg3Program;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HumanSet {
    
    public void PrintHashSet(){
        Human h1 = new Human("Иван","Иванов",18);
        Human h2 = new Human("Перт","Петров",13);
        HashSet<Human> hs = new HashSet();
        hs.add(h1);
        hs.add(h2);
        
        System.out.println();
        System.out.println("B");
        Iterator iter = hs.iterator();
        for(Human human:hs){
            human.Print();
        }
        
        
        System.out.println();
        System.out.println("C");
        LinkedHashSet<Human> lhs = new LinkedHashSet(hs);
        for(Human human:lhs){
            human.Print();
        }
        
        
        System.out.println();
        System.out.println("D");
        TreeSet<Human> ts = new TreeSet(hs);
        for(Human human:ts){
            human.Print();
        }
        
        
        System.out.println();
        System.out.println("E");
        HumanComparatorBySecondName comperator = new HumanComparatorBySecondName();
        TreeSet<Human> ts2 = new TreeSet(comperator);
        ts2.add(h1);
        ts2.add(h2);
        for(Human human:ts2){
            human.Print();
        }
        
        
        System.out.println();
        System.out.println("F");
        Comparator<Human> comperator2 = (Human o1, Human o2) -> {
            if (o1.equals(o2)||o1.getAge()==o2.getAge()) return 0;
            if (o1.getAge()>o2.getAge())return 1;
            else return -1;
        };
        TreeSet<Human> ts3 = new TreeSet(comperator2);
        ts3.add(h1);
        ts3.add(h2);
        for(Human human:ts3){
            human.Print();
        }
    }
}