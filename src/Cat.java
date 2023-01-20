public class Cat {
    String name;
    int age;

    Cat(String name, int age){
        this.name=name;
        this.age=age;
    }

    String getCat(){
        return "Name cat --> "+name+"\nAge --> "+age+" лет ";
    }

    void showCat(){
        System.out.println(getCat());
    }


}
