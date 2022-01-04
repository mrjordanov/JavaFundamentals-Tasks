import java.util.Scanner;

public class StringExplosionV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();
        StringBuilder sb= new StringBuilder(input);


        String result="";
            while (input.contains(">")){
                int indexOfExplosion=input.indexOf(">");
                if (Character.isDigit(input.charAt(indexOfExplosion+1))){
                    int power=Integer.parseInt(String.valueOf(sb.charAt(indexOfExplosion+1)));

                    for (int i = 0; i <=indexOfExplosion ; i++) {
                        result+=String.valueOf(input.charAt(i));
                    }
                    sb.delete(0,indexOfExplosion+1+power);
                    input=sb.toString();
                }
               // if (Character.isAlphabetic(input.charAt(indexOfExplosion+1))){
//
               // }
            }


        System.out.println(result+input);


    }
}
