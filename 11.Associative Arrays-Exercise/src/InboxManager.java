import java.util.*;

public class InboxManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<String>> users = new TreeMap<>();
        List<String> countOfUsers = new ArrayList<>();

        while (!input.equals("Statistics")) {
            String[] command = input.split("->");
            String name = command[1];
            if (command[0].equals("Add")) {
                if (users.containsKey(name)) {
                    System.out.printf("%s is already registered", name).println();
                } else {
                    users.put(name, new ArrayList<>());
                    countOfUsers.add(name);
                }
            }
            if (command[0].equals("Send")) {
                String email = command[2];
                users.putIfAbsent(name, new ArrayList<>());
                users.get(name).add(email);
            }
            if (command[0].equals("Delete")) {
                if (users.containsKey(name)) {
                    users.remove(name);
                    countOfUsers.remove(name);
                } else {
                    System.out.printf("%s not found!", name).println();
                }
            }
            input = scanner.nextLine();
        }

        System.out.printf("Users count: %d", countOfUsers.size()).println();
        ///потребителите са сортирани по низходящ ред спрямо броя на имейлите
        users.entrySet().stream().sorted((r1, r2) -> Integer.compare(r2.getValue().size(), r1.getValue().size()))
                .forEach(entry -> {
                    /// принтираме user-a, като те се подреждат по азбучем ред, защото имаме TreeMap, който ше ги запише по азбучен ред
                    System.out.println(String.format("%s", entry.getKey()));
                    /// даваме да принтира стойностите за всеки user имейлите по реда по който са добавяни:
                    entry.getValue()
                            .forEach(s -> System.out.println(String.format("-%s", s)));
                });

    }
}