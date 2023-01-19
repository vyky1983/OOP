public class Rect {
    double length;

    double width;

    void getRect(double length, double width) {
        System.out.println(" Длина: " + length + "\n Ширина: " + width);

    }

    double ariaRect() {
        return length * width;
    }

    void getAria(){
        System.out.printf("Aria --> "+ariaRect());
    }
}
