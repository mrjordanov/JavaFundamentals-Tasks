import java.util.*;


public class Zoo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> animalMap = new LinkedHashMap<>();
        Map<String, String> anArea = new LinkedHashMap<>();
        Map<String, Set<String>> areasMap = new LinkedHashMap<>();

        while (!input.equals("EndDay")) {
            String[] arg = input.split(": ");
            String[] token = arg[1].split("-");

            if (arg[0].equals("Add")) {
                String animalName = token[0];
                int foodToEat = Integer.parseInt(token[1]);
                String area = token[2];

                animalMap.putIfAbsent(animalName, 0);
                int curFood = animalMap.get(animalName);
                animalMap.put(animalName, curFood + foodToEat);

                anArea.putIfAbsent(animalName, area);

                areasMap.putIfAbsent(area, new LinkedHashSet<>());
                areasMap.get(area).add(animalName);

            }

            if (arg[0].equals("Feed")) {
                String animalName = token[0];
                int foodToEat = Integer.parseInt(token[1]);

                if (!animalMap.containsKey(animalName)) {
                    input = scanner.nextLine();
                    continue;
                }
                int curAnimalFood = animalMap.get(animalName);
                int food = curAnimalFood - foodToEat;
                if (food <= 0) {
                    animalMap.remove(animalName);
                    String area = anArea.get(animalName);

                    areasMap.get(area).remove(animalName);

                    System.out.printf("%s was successfully fed", animalName).println();
                } else {
                    animalMap.put(animalName, food);
                }

            }

            input = scanner.nextLine();
        }
        System.out.println("Animals:");
        animalMap.forEach((key, value) -> System.out.printf(" %s -> %dg", key, value).println());
        System.out.println("Areas with hungry animals:");

        areasMap.entrySet().stream().filter(a -> a.getValue().size() > 0).forEach(a -> System.out.printf("%s: %d", a.getKey(), a.getValue().size()).println());


    }
}
