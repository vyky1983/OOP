public class main {
    public static void main(String[] args) {
        Box box = new Box();
        box.length = 10;
        box.height = 10;
        box.width = 10;
        double volume = box.height* box.width* box.length;

        Box box1=new Box();
        box1.width=20;
        box1.height=20;
        box1.length=20;


        System.out.println(volume);
        System.out.println(box1.height* box1.length* box1.width);


    }
}
