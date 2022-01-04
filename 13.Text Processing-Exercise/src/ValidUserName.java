import java.util.Scanner;

public class ValidUserName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] arr = input.split(", ");

        for (int i = 0; i < arr.length; i++) {
            String name = arr[i];
            boolean isValid=false;
            if ((name.length() >= 3 && name.length() <= 16)) {
                for (int j = 0; j < name.length(); j++) {
                    char cur = name.charAt(j);
                    if (Character.isAlphabetic(cur) | Character.isDigit(cur) | cur == '-' | cur == '_') {
                        isValid=true;
                    }
                    else {
                        isValid=false;
                        break;
                    }
                }

                if (isValid){
                    System.out.println(name);
                }
            }
        }


    }
}
