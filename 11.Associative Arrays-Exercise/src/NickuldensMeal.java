import java.util.*;

public class NickuldensMeal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<String>> quests = new TreeMap<>();
        List <String> unliked= new ArrayList<>();

        while (!input.equals("Stop")) {
            String[] command = input.split("-");
            String name = command[1];
            String meal = command[2];
            if (command[0].equals("Like")) {
                if (quests.containsKey(name)){
                    if (quests.get(name).contains(meal)){
                        input= scanner.nextLine();
                        continue;
                    }
                    else {
                        quests.get(name).add(meal);
                    }
                }
                else {
                    quests.putIfAbsent(name,new ArrayList<>());
                    quests.get(name).add(meal);
                }
            }

            if (command[0].equals("Unlike")) {
                if (quests.containsKey(name)){
                    if (quests.get(name).contains(meal)){
                        quests.get(name).remove(meal);
                        unliked.add(meal);
                        System.out.printf("%s doesn't like the %s.",name,meal).println();
                    }
                    else {
                        System.out.printf("%s doesn't have the %s in his/her collection.",name,meal).println();
                    }
                }
                else {
                    System.out.printf("%s is not at the party.",name).println();
                }
            }

            input = scanner.nextLine();
        }

            quests.entrySet()
                    .stream()
                    .sorted((c1,c2)-> Integer.compare(c2.getValue().size(),c1.getValue().size()))
                    .forEach(entry->
                        System.out.println(entry.getKey()+":"+entry.getValue().toString().replaceAll("[\\[\\]]"," ")));

            System.out.printf("Unliked meals: %d",unliked.size());
    }


}
