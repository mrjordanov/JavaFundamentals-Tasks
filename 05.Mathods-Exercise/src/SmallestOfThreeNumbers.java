import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first=Integer.parseInt(scanner.nextLine());
        int second=Integer.parseInt(scanner.nextLine());
        int third=Integer.parseInt(scanner.nextLine());

        int smallest=getSmallestOfThree(first,second,third);
        System.out.print(smallest);
    }

    private static int getSmallestOfThree(int first, int second, int third) {
        int minValue=Integer.MAX_VALUE;
        if (first<minValue){
            minValue=first;
        }
        if (second<minValue){
            minValue=second;
        }
        if (third<minValue){
            minValue=third;
        }

        return minValue;

    }


}
