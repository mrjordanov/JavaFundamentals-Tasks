import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();

        int numberOfVowel=getNumberOfVowel(input);
        System.out.print(numberOfVowel);
    }

    private static int getNumberOfVowel(String input) {
        int counter=0;

        for (int i=0; i <input.length() ; i++) {
            char c=input.charAt(i);
            if (c=='a'||c=='A'){
                counter++;}
            if (c=='e'||c=='E'){
                counter++;}
            if (c=='i'||c=='I'){
                counter++;}
            if (c=='o'||c=='O'){
                counter++;}
            if (c=='u'||c=='U'){
                counter++;}
            if (c=='y'||c=='Y'){
                counter++;}

        }
        return  counter;

    }

}
