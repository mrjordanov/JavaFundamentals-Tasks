package TypeList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Song> allSongs=new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("_");
            String typeList = input[0];
            String name = input[1];
            String time = input[2];

            Song song= new Song(typeList,name,time);
            allSongs.add(song);

        }

        String last= scanner.nextLine();
        if (!last.equals("all")){
            for (Song song : allSongs) {
                if(song.getTypeList().equals(last)){
                    System.out.println(song.getName());
                }
            }
        }
        else {
            for (Song song : allSongs) {
                System.out.println(song.getName());
            }
        }
    }
}
