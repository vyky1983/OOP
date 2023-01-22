public class Task2_Box {
    double length;
    double width;
    double height;

    double getVolume(){
        return length*width*height;
    }
    void showBox(){
        System.out.println(getVolume());
    }
//
}
