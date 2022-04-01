import java.util.Scanner;

public class DigitOther {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder digits=new StringBuilder();
        StringBuilder letters= new StringBuilder();
        StringBuilder specials= new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char cur = input.charAt(i);
            if(Character.isDigit(cur)){
                digits.append(cur);
            }
            else if(Character.isAlphabetic(cur)){
                letters.append(cur);
            }
            else {
                specials.append(cur);
            }
        }

        System.out.println(digits);
        System.out.println(letters);
        System.out.println(specials);

    }
}
