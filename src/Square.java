public class Square {
    double length;
    double width;

    void   infSquare(double length, double width){
        System.out.println("Длина --> "+length+"\nШирина --> "+width);
    }


    double aria(){
        return length*width;
    }

    void getAria(){
        System.out.println("Aria --> "+aria());
    }
    }


