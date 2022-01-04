import java.util.Scanner;

public class HTML {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String article = scanner.nextLine();
        String contentOfArticle = scanner.nextLine();
        String comments = scanner.nextLine();
        StringBuilder sb = new StringBuilder();

        while (!comments.equals("end of comments")) {

            sb.append("<div>\n "+comments+"\n</div>\n");
            comments = scanner.nextLine();
        }

        String format= String.format("<h1>\n %s\n</h1>\n<article>\n %s\n</article>",article,contentOfArticle);
        System.out.println(format);
        System.out.print(sb);
    }
}
