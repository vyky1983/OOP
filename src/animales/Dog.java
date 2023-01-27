package animales;

public class Dog {
String name;
String breed;
double weight;
int speed;

    Dog(String name, String breed, double weight, int speed){
        this.name=name;
        this.breed=breed;
        this.weight=weight;
        this.speed=speed;
    }

String getDog(){
    return "Name animales.Dog --> "+ name+"\nBreed dog --> "+breed+"\nWeight animales.Dog --> "+weight+"kg.";
}
void showDog(){
    System.out.println(getDog());
}

void ranDog(){
    for(int i =0; i<speed; i++) {
        System.out.println("Ran ");
    }
}
}

