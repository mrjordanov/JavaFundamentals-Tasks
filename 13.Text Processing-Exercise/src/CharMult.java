import java.util.Scanner;

public class CharMult {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");

        int result = getTheSumOfChars(arr[0], arr[1]);
        System.out.println(result);
    }

    private static int getTheSumOfChars(String first, String second) {
        int sum = 0;
       String one=first;
       String two=second;

        if(first.length()>second.length()) {
            one = second;
            two = first;
        }

        for (int i = 0; i < one.length(); i++) {
            char curA = one.charAt(i);
            for (int j = i; j < two.length();) {
                char curB = two.charAt(j);
                sum+=curA*curB;

                if(i==one.length()-1){
                    for (int k = i+1; k <two.length() ; k++) {
                        char add=two.charAt(k);
                        sum+=add;
                    }
                }
                break;
            }
        }


        return sum;
    }
}
