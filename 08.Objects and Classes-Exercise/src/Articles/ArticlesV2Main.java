package Articles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArticlesV2Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<ArticlesV2> books=new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] articleData = scanner.nextLine().split(", ");
            String initialTitle = articleData[0];
            String initialContent = articleData[1];
            String initialAuthor = articleData[2];

            ArticlesV2 article = new ArticlesV2(initialTitle, initialContent, initialAuthor);

            books.add(article);
        }
          String last= scanner.nextLine();

        if(last.equals("title")){
            books.stream().sorted((p1,p2)->p1.getTitle().compareTo(p2.getTitle()))
                    .forEach(p-> System.out.println(p.getTitle()+" - "+p.getContent()+": "+p.getAuthor()));

        }
        if (last.equals("content")){
            books.stream().sorted((p1,p2)->p1.getContent().compareTo(p2.getContent()))
                    .forEach(p-> System.out.println(p.getTitle()+" - "+p.getContent()+": "+p.getAuthor()));
        }
        if (last.equals("author")){
            books.stream().sorted((p1,p2)->p1.getAuthor().compareTo(p2.getAuthor()))
                    .forEach(p-> System.out.println(p.getTitle()+" - "+p.getContent()+": "+p.getAuthor()));
        }




    }
}
