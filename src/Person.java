public class Person {
    String name;
    int age;
    double weight;

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
