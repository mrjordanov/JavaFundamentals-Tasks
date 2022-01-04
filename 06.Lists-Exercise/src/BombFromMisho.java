import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombFromMisho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String bomb = scanner.nextLine();
        String[] bomber = bomb.split(" ");

        List<String> str = Arrays.stream(input.split(" ")).collect(Collectors.toList());
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < str.size(); i++) {
            numbers.add(Integer.parseInt(str.get(i)));
        }


        int specialNumber = Integer.parseInt(bomber[0]);
        int power = Integer.parseInt(bomber[1]);

        //В този масив ще пазим числата които не са детонирани
        Integer[] stack = new Integer[numbers.size()];
        //Показва в кой елемент на stack можем да добавим число
        int currentIndex = 0;
        //Показва детонация, детонацията започва от силата(power) и стига до 0
        int detonated = 0;


        for (int i = 0; i < numbers.size(); i++) {
            //Първо провереяваме за специално число, за да детонираме елементите
            if (numbers.get(i) == specialNumber) {
                //Тук трием елементите които вече са вкарани
                //Като връщам до позцията в която трябва да вкарам елемент
                currentIndex = Integer.max(0, currentIndex - power);
                //Слагам колко елемента са детонирани напред
                detonated = power;
            } else {
                if (detonated != 0) {
                    //Ако сме детониран елемент не го добавям и намалявам детонираните с 1
                    detonated--;
                } else {
                    // Ако не сме детонирани записвам в stack масива сегашният елемент
                    stack[currentIndex] = numbers.get(i);
                    //Покачвам коя ни е свободната позиция в stack масива
                    currentIndex++;
                }
            }
        }
        int sum = 0;
        //Изцикляме stack масива до позицията до която сме записали
        for (int j = 0; j < currentIndex; j++) {
            sum += stack[j];
        }
        System.out.print(sum);
    }
}