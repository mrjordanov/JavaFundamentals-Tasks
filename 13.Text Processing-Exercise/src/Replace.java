import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder output=new StringBuilder();
        for (int i = 0; i <input.length()-1 ; i++) {
            char cur=input.charAt(i);
            char next=input.charAt(i+1);

            if(cur!=next){
                output.append(cur);
            }
        }
        System.out.println(output.append(input.charAt(input.length()-1)));
    }
}
