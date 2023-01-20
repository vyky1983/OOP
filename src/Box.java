public class Box {
    double length;
    double width;
    double height;

    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    void setDim(double length, double height, double width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    double getVolume() {
        return length * width * height;

    }

    void showBox() {
        System.out.println(getVolume());


    }

}
