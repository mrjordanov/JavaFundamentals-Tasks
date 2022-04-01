import java.util.Scanner;

public class BombTheShit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int index = input.indexOf(">");

        StringBuilder sb = new StringBuilder();
        while (index >= 0) {
            int powerOfBomb = Integer.parseInt(input.substring(index + 1, index + 2));

            for (int i = 0; i < index +1; i++) {
                sb.append(input.charAt(i));
            }
            input = input.substring(index + 1);


            for (int i = 0; i < input.length(); i++) {
                char cur = input.charAt(i);
                if (cur != '>') {
                    powerOfBomb--;
                    if (powerOfBomb == 0) {
                        break;
                    }
                } else {
                    powerOfBomb += Integer.parseInt(input.substring(i + 1, i + 2));
                }

            }


            index = input.indexOf(">");
        }

    }
}
