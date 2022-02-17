import java.util.Arrays;
import java.util.Scanner;


public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String line = scanner.nextLine();
        int countOfShootTargets = 0;
        while (!line.equals("End")) {
            int index = Integer.parseInt(line);
            if (index < 0 || index >= array.length) {
                line=scanner.nextLine();
                continue;
            } else {
                int curTarget = array[index];

                if (curTarget == -1) {
                    line= scanner.nextLine();
                    continue;
                }
                for (int i = 0; i < array.length; i++) {
                    if (array[i]==-1){
                        continue;
                    }
                    if (array[i] > curTarget) {
                        array[i] -= curTarget;
                    } else {
                        array[i] += curTarget;
                    }
                }
                countOfShootTargets++;
                array[index] = -1;
            }

            line = scanner.nextLine();
        }

        System.out.print("Shot targets: " + countOfShootTargets + " -> ");
        for (int n : array) {
            System.out.print(n + " ");
        }
    }
}
