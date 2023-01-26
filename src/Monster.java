public class Monster {
    int eyes;
    int hands;
    int legs;

    Monster(){
        eyes=2;
        hands=2;
        legs=2;
    }

    Monster(int quantity){
        this.eyes=quantity;
        this.hands=quantity;
        this.legs=quantity;
    }

    Monster(int eyes, int hands, int legs){
        this.eyes=eyes;
        this.hands=hands;
        this.legs=legs;
    }

    void voice(){
        System.out.println("Grrrrrr.....");
    }

    void voice(int count){
        for(int i =0; i<count; i++){
            System.out.println("Grrrrrr...");
        }
    }

    void voice(int count, String word){
        for(int i = 0; i<count; i++){
            System.out.println(word);
        }
    }


}
