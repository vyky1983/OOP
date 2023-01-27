package task;

public class Task3_Dog {
    String name;
    String breed;
    double weight;
    int speed;

    String getDog(){
        return "Name --> "+name+"\nBreed --> "+breed+"\nWeight --> "+weight+" "+"Kg.";
    }
    void showDog(){
        System.out.println(getDog());
    }

    void ranDog(){
        for (int i=0; i<speed; i++){
            System.out.println("Ran ");
        }
    }
}
