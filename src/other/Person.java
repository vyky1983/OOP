package other;

public class Person {
    String name;
    int age;
    double weight;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    Person(String name, int age, double weight){
        this.name=name;
        this.age=age;
        this.weight=weight;
    }

    String getPerson(){
        return "Name --> "+name+"\nAge --> "+age+"\nWeight --> "+weight+" "+"Kg.";
    }

    void showPerson(){
        System.out.println(getPerson());
    }

}
