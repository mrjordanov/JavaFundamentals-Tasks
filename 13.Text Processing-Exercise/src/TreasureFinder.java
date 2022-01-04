import java.util.Locale;
import java.util.Scanner;

public class TreasureFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] arr = input.split(" ");
        StringBuilder sb = new StringBuilder();

        int[] key = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            key[i] = Integer.parseInt(arr[i]);
        }

        String line = scanner.nextLine();
        while (!line.equals("find")) {
            for (int i = 0; i < line.length(); i++) {
                if (i == key.length) {
                    line=line.substring(key.length);
                   i=-1;
                    continue;
                }
                int symbol= line.charAt(i)-key[i];
                sb.append(String.format("%c",symbol));

            }
            int startIndexTreasure=sb.indexOf("&");
            int endIndexTreasure=sb.lastIndexOf("&");
            String type="";
            for (int k = startIndexTreasure+1; k <endIndexTreasure ; k++) {
                type+=sb.charAt(k);
            }

            int startIndexOfCoordinates=sb.indexOf("<");
            int endIndexOfCoordinates=sb.indexOf(">");
            String coordinates="";
            for (int l = startIndexOfCoordinates+1; l <endIndexOfCoordinates ; l++) {
                coordinates+=sb.charAt(l);
            }

            System.out.printf("Found %s at %s",type,coordinates).println();
            sb.setLength(0);
            line = scanner.nextLine();
        }


    }
}
