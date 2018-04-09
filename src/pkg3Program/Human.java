package pkg3Program;

public class Human implements Comparable<Human> {
    String name = "";
    String secondName = "";
    int age = 0;
    
    public void setName(String _name){
        this.name = _name;
    }
    public String getName(){
        return this.name;
    }
    
    public void setSecondName(String _name){
        this.name = _name;
    }
    public String getSecondName(){
        return this.secondName;
    }
    
    public void setAge(int _age){
        this.age = _age;
    }
    public int getAge(){
        return this.age;
    }
    
    public Human(String _name, String _secondName, int _age){
        name = _name;
        secondName = _secondName;
        age = _age;
    }
    
    public void Print(){
        System.out.println(this.name + " " + this.secondName + " " + this.age);
    }
    
    @Override
    public int compareTo(Human o) {
        int rez;
        if (this.equals(o)) return 0;
        rez = name.compareToIgnoreCase(o.getName());
        if (rez != 0) return rez;
        rez = secondName.compareToIgnoreCase(o.getSecondName());
        if (rez != 0) return rez;
        else return (age - o.getAge());
    }
    
}
