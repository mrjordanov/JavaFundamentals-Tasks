import java.util.Scanner;

public class MaxSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] str = input.split(" ");

        int[] arr=new int[str.length];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=Integer.parseInt(str[i]);
        }

        int longest=0;
        int counterForRepeat = 0;
        int number=0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i]==(arr[i + 1])){
                counterForRepeat++;
                if(counterForRepeat>longest){
                    longest=counterForRepeat;
                    number=arr[i];
                }
            }
            else {
                counterForRepeat=0;
            }

        }
        for (int i = 0; i <longest+1 ; i++) {
            System.out.print(number+" ");
        }

    }
}
