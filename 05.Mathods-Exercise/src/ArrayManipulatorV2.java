import java.util.Scanner;

public class ArrayManipulatorV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] str = scanner.nextLine().split(" ");

        int[] arr = new int[str.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        String input = scanner.nextLine();
        while (!input.equals("END")) {
            String[] tokens = input.split(" ");
            String command = tokens[0];
            if (command.equals("exchange")) {
                int index = Integer.parseInt(tokens[1]);
                if (index < 0 || index >= tokens.length) {
                    System.out.println("Invalid index");
                } else {
                    //exchange (array, index);

                }
                if (command.equals("min")) {
                    String evenOrOdd = tokens[1];
                    if (evenOrOdd.equals("even")) {
                        //findMinEven(array);
                    } else if (evenOrOdd.equals("odd")) {
                        //findMinOdd(array);
                    }
                }
                if (command.equals("max")){
                    evenOrOdd=tokens[1];
                    if (evenOrOdd.equals("even")) {
                        //findMaxEven(array);
                    } else if (evenOrOdd.equals("odd")) {
                        //findMaxOdd(array);
                    }
                }



                command = scanner.nextLine();
            }


        }
    }
}