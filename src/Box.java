public class Box {
    double length;
    double width;
    double height;

    void setDim(double length, double height, double width) {
        this.height = height;
        this.length = length;
        this.width = width;
        System.out.println();

    }

    double getVolume() {
//        double volume = length*width*height;
//        return volume;
        return length * width * height;

    }

    void showBox() {
        System.out.println(getVolume());


    }

}
