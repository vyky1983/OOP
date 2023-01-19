public class Dog {
String name;
String breed;
double weight;
int speed;

String getDog(){
//    String inf= "Name Dog --> "+ name+"\nBreed dog --> "+breed+"\nWeight Dog --> "+weight+"kg.";
//    return inf;
    return "Name Dog --> "+ name+"\nBreed dog --> "+breed+"\nWeight Dog --> "+weight+"kg.";
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

