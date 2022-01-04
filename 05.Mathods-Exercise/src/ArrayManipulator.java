
import java.util.Scanner;

public class ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] str = input.split(" ");

        int[] arr = new int[str.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        String command = scanner.nextLine();
        while (!command.equals("END")) {
            String[] tokens=command.split(" ");
            String task=tokens[0];

            if (task.equals("max even")) {
                maxEvenIndex(arr);
            }
            if (command.equals("max odd")) {
                 maxOddIndex(arr);
                  }
            if (command.equals("min even")) {
                minEvenIndex(arr);

            }
            if (command.equals("min odd")) {
                minOddIndex(arr);
            }


                command = scanner.nextLine();
            }

        }

    private static void maxEvenIndex(int[] arr) {
        int maxEven = Integer.MIN_VALUE;
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                if (arr[i] >= maxEven) {
                    maxEven = arr[i];
                    index = i;
                }
            }
        }
        if (maxEven==Integer.MIN_VALUE) {
            System.out.println("No matches");
        }
        else {
            System.out.println(index);
        }

    }

    private static void maxOddIndex(int[] arr) {
        int maxOdd = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                if (arr[i] >= maxOdd) {
                    maxOdd = arr[i];
                    index = i;
                }
            }
        }
        if (maxOdd == Integer.MIN_VALUE) {
            System.out.println("No matches");
        }
        else {
            System.out.println(index);
        }

    }

    private static void minEvenIndex(int[] arr) {
        int minEven = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                if (arr[i] <= minEven) {
                    minEven = arr[i];
                    index = i;
                }
            }
        }
            if (minEven==Integer.MAX_VALUE) {
                System.out.println("No matches");
            }
            else {
                System.out.println(index);
            }
    }

    private static void minOddIndex(int[] arr) {
        int minOdd = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                if (arr[i] <= minOdd) {
                    minOdd = arr[i];
                    index = i;
                }
            }
        }
        if (minOdd==Integer.MAX_VALUE) {
            System.out.println("No matches");
        }
        else {
            System.out.println(index);
        }
    }


}



