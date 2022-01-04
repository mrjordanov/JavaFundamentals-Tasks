import java.util.Scanner;

public class CharMultiplayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int result = sumOfCharacters(input);
        System.out.println(result);


    }

    private static int sumOfCharacters(String input) {
        String[] arr = input.split(" ");
        String first = arr[0];
        String second = arr[1];

        int multiply = 0;
        int sumSecond=0;

        if (first.length()>second.length()){
            String temp=second;
            second=first;
            first=temp;
        }
        for (int i = 0; i < first.length(); i++) {
            for (int j = i; j <= i; j++) {
                multiply += first.charAt(i) * second.charAt(j);
                if (j==first.length()-1){
                    for (int k = first.length(); k <second.length() ; k++) {
                        sumSecond+=second.charAt(k);
                    }
                    multiply+=sumSecond;
                }
            }
        }
        return  multiply;
    }
}
