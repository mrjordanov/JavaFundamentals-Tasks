import java.util.Scanner;

public class ArrayMulti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numb = input.split(" ");

        int[] arr = new int[numb.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(numb[i]);
        }

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String arg[] = command.split(" ");

            if (arg[0].equals("swap")) {
                int indexOne = Integer.parseInt(arg[1]);
                int indexTwo = Integer.parseInt(arg[2]);
                int firstNum=arr[indexOne];
                arr[indexOne]=arr[indexTwo];
                arr[indexTwo]=firstNum;
            }

            if (arg[0].equals("multiply")) {
                int indexOne = Integer.parseInt(arg[1]);
                int indexTwo = Integer.parseInt(arg[2]);
                int num=arr[indexOne];
                arr[indexOne]=num*arr[indexTwo];
            }

            if (arg[0].equals("decrease")) {
                int decrease=1;
                for (int i = 0; i < arr.length ; i++) {
                    arr[i]=arr[i]-1;
                }
            }

            command = scanner.nextLine();
        }

        for (int i = 0; i < arr.length ; i++) {
            if (i== arr.length-1){
                System.out.printf("%d",arr[i]);
            }
            else {
                System.out.printf("%d, ",arr[i]);
            }
        }

    }
}
