public class Dog {
String name;
String breed;
double weight;

String getDog(){
//    String inf= "Name Dog --> "+ name+"\nBreed dog --> "+breed+"\nWeight Dog --> "+weight+"kg.";
//    return inf;
    return "Name Dog --> "+ name+"\nBreed dog --> "+breed+"\nWeight Dog --> "+weight+"kg.";
}

void showDog(){
    System.out.println(getDog());
}
}

