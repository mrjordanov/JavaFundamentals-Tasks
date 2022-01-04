import java.util.*;

public class Ranking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, String> contestMap = new LinkedHashMap<>();
        Map<String, Integer> usersMap = new LinkedHashMap<>();
        Map<String, List<String>> userCoursesMap = new LinkedHashMap<>();
        Map<String, Integer> coursePointsMap = new LinkedHashMap<>();


        while (!input.equals("end of contests")) {
            String[] comm = input.split(":");
            String contest = comm[0];
            String password = comm[1];

            contestMap.putIfAbsent(contest, password);
            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        // for (Map.Entry<String, String> entry : contestMap.entrySet()) {
        //  System.out.printf("%s: %s",entry.getKey(),entry.getValue()).println();
        //  }

        while (!input.equals("end of submissions")) {
            String[] arg = input.split("=>");
            String contest = arg[0];
            String password = arg[1];
            String name = arg[2];
            int points = Integer.parseInt(arg[3]);

            if (contestMap.containsKey(contest)) {
                if (contestMap.get(contest).equals(password)) {

                    userCoursesMap.putIfAbsent(name, new ArrayList<>());

                    if (!userCoursesMap.get(name).contains(contest)) {
                        coursePointsMap.put(contest,points);
                        userCoursesMap.get(name).add(contest);
                        usersMap.putIfAbsent(name, 0);
                        int totalPoints = usersMap.get(name) + points;
                        usersMap.put(name, totalPoints);
                    }
                }
            }

            //  if (contestMap.containsKey(contest)){
            //   if (users.containsKey(name)){
            //     if (users.get(name)<points){
            //       users.put(name,points);
            //   }
            //}
            // }
            input = scanner.nextLine();
        }

        usersMap.entrySet().stream().sorted((l, r) -> r.getValue().compareTo(l.getValue())).limit(1)
                .forEach(n -> System.out.printf("Best candidate is %s with total %d points.", n.getKey(), n.getValue()).println());
        System.out.println("Ranking:");


    }
}
