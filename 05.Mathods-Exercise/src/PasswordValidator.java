import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        boolean isValid = validationForChars(input);
        if (!isValid) {
            System.out.println("Password must be between 6 and 10 characters");
        } else {
            isValid = true;
        }

        boolean isOk = validatorForLettersAndDigits(input);
        if (!isOk) {
            System.out.println("Password must consist only of letters and digits");
        } else {
            isOk = true;
        }

        boolean lastCheck = validatorForDigits(input);
        if (!lastCheck) {
            System.out.println("Password must have at least 2 digits");
        } else {
            lastCheck = true;
        }

        if (isValid && isOk && lastCheck) {
            System.out.println("Password is valid");
        }
    }


    private static boolean validationForChars(String chars) {
        boolean isValid = true;

        // if (chars.length() > 5 && chars.length() <= 9) {
        //   isValid = true;
        //  } else {
        //    isValid = false;
        // }
        return isValid = chars.length() > 5 && chars.length() <= 9;
    }

    private static boolean validatorForLettersAndDigits(String lettersAndDigits) {
        boolean isValid = true;
        int counter = 0;
        for (int i = 0; i < lettersAndDigits.length(); i++) {
            char index = lettersAndDigits.charAt(i);
            if ((index >= 97 && index <= 122) || (index >= 65 && index <= 90) || (index >= 48 && index <= 57)) {
                counter++;
            }
        }
        // if (counter == lettersAndDigits.length()) {
        //  isValid = true;
        // } else {
        // isValid = false;
        //  }
        // return isValid;
        return isValid = counter == lettersAndDigits.length();
    }

    private static boolean validatorForDigits(String digits) {
        boolean isValid = true;
        int counter = 0;
        for (int i = 0; i < digits.length(); i++) {
            char c = digits.charAt(i);
            if (c >= 48 && c <= 57) {
                counter++;
            }
        }

        //if (counter >= 2) {
        //    isValid = true;
        // } else {
        //   isValid = false;
        //}
        return isValid = counter >= 2;

    }

}
