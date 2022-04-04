
import java.util.*;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<Animal>> map = new LinkedHashMap<>();

        while (!input.equals("EndDay")) {
            String[] arg = input.split(": ");
            String[] token = arg[1].split("-");

            String animalName = token[0];
            int foodToEat = Integer.parseInt(token[1]);

            if (arg[0].equals("Add")) {
                String area = token[2];

                Animal animal = new Animal(animalName, foodToEat, area);
                map.putIfAbsent(area, new ArrayList<>());

                if (map.get(area).stream().anyMatch(a -> a.getName().equals(animalName) && a.getArea().equals(area))) {
                    map.get(area).stream().filter(a -> a.getName().equals(animalName) && a.getArea().equals(area))
                            .forEach(a -> a.setFood(a.getFood() + foodToEat));
                } else {
                    map.get(area).add(animal);
                }
            }

            if (arg[0].equals("Feed")) {
                for (Map.Entry<String, List<Animal>> entry : map.entrySet()) {

                    List<Animal> animalList = entry.getValue();
                    Animal animalToRemove = null;

                    for (Animal animal : animalList) {
                        if (animal.getName().equals(animalName)) {
                            animal.feed(foodToEat);
                            if (animal.getFood() <= 0) {
                                animalToRemove = animal;
                                System.out.printf("%s was successfully fed", animalName).println();
                                break;
                            }
                        }
                    }

                    if (animalToRemove != null) {
                        animalList.remove(animalToRemove);
                    }
                }

            }

            input = scanner.nextLine();
        }

        System.out.println("Animals:");
        for (Map.Entry<String, List<Animal>> entry : map.entrySet()) {
            List<Animal> animalList = entry.getValue();
            animalList.forEach(a -> System.out.printf(" %s -> %dg", a.getName(), a.getFood()).println());
        }

        System.out.println("Areas with hungry animals:");
        for (Map.Entry<String, List<Animal>> entry : map.entrySet()) {
            if (entry.getValue().size() > 0) {
                System.out.printf("%s: %d", entry.getKey(), entry.getValue().size()).println();
            }
        }

    }
}

