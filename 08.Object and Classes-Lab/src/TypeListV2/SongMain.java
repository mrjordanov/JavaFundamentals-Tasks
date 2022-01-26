package TypeListV2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SongMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfSongs = Integer.parseInt(scanner.nextLine());
        List<Song> album=new ArrayList<>();

        for (int i = 0; i < numberOfSongs; i++) {
            String[] information = scanner.nextLine().split("_");
            String typeList = information[0];
            String nameOfSong = information[1];
            String duration = information[2];

            Song songs = new Song(typeList, nameOfSong, duration);
            album.add(songs);
        }
        String lastInput= scanner.nextLine();

        for (Song s:album) {
            if(lastInput.equals(s.getTypeList())){
                System.out.printf("%s",s.getNameOfSong());
                System.out.println();
            }
            if(lastInput.equals("all")){
                System.out.printf("%s",s.getNameOfSong());
                System.out.println();
            }
        }

    }

}
