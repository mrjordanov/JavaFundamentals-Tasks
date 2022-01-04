import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Dice dice = new Dice(20);
        Dice d2= new Dice(20);
        System.out.println(dice.roll());
       // System.out.println(dice.getSides());
       // dice.setSides(6);//System.out.println(dice.getSides());


        System.out.println(dice.getSides());
        //dice.setSides(20);
       // d2.setSides(10);

    }
}
