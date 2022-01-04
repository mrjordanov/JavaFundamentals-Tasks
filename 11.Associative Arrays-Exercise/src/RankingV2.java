import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class RankingV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, String> contests = new LinkedHashMap<>();
        Map<String, Map<String, Integer>> users = new LinkedHashMap<>();
        Map<String, Integer> userPoints = new LinkedHashMap<>();

        while (!input.equals("end of contests")) {
            String[] comm = input.split(":");
            String course = comm[0];
            String password = comm[1];

            contests.putIfAbsent(course, password);
            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!input.equals("end of submissions")) {
            String[] arg = input.split("=>");
            String course = arg[0];
            String password = arg[1];
            String name = arg[2];
            int points = Integer.parseInt(arg[3]);

            if (contests.containsKey(course) && contests.get(course).equals(password)) {

                users.putIfAbsent(name, new LinkedHashMap<>());
                Map<String, Integer> userCourses = users.get(name);
                userCourses.putIfAbsent(course, points);
                Integer currentPoints = userCourses.get(course);
                if (currentPoints < points) {
                    userCourses.putIfAbsent(course, points);
                }


               // userPoints.putIfAbsent(name,0);
               // int totalPoints= userPoints.get(name)+points;
               // userPoints.put(name,totalPoints);


            }
            input = scanner.nextLine();

        }




    }
}