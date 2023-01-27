package task;

public class Task5_Rectangle {
    double length;
    double width;

    void getRect(double length, double width) {
        this.width = width;
        this.length = length;
        System.out.println("Length --> " + length + "\nWidth --> " + width);
    }

    void area() {
        System.out.println(length * width);
    }
}
