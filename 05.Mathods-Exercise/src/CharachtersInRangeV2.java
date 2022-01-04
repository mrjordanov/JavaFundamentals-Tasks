import java.util.Scanner;

public class CharachtersInRangeV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char first=scanner.nextLine().charAt(0);
        char second=scanner.nextLine().charAt(0);

        if (first<second) {
            printCharBetweenTwoChars(first,second);
        }
        else {
            printCharBetweenTwoChars(second,first);
        }
    }

    private static void printCharBetweenTwoChars(char first, char second) {
            for (char i = ++first; i <second ; i++) {
                System.out.printf("%c ",i);
            }

        }

    }

