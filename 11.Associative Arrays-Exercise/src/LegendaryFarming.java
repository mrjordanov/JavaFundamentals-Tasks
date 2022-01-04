import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Integer> materials = new LinkedHashMap<>();
        Map<String,Integer> junks= new LinkedHashMap<>();

        boolean isObtained=false;
        while(isObtained){
            String[] line = input.split(" ");
            for (int i = 0; i < line.length; i += 2) {
                int mark = Integer.parseInt(line[i]);
                String token = line[i + 1].toLowerCase(Locale.ROOT);

                if (token.equals("shards") || token.equals("fragments") || token.equals("motes")) {
                    materials.put(token, 0);
                    int newCount = materials.get(token) + mark;
                    materials.put(token, newCount);
                    if (materials.get(token) >= 250) {
                        int lastCount = newCount - 250;
                        materials.put(token, lastCount);
                        if (token.equals("shards")) {
                            System.out.println("Shadowmourne obtained!");
                        }
                        if (token.equals("fragments")) {
                            System.out.println("Valanyr obtained!");
                        }
                        if (token.equals("motes")) {
                            System.out.println("Dragonwrath obtained!");
                        }
                        isObtained = true;
                        break;
                    }
                }
                else {
                    junks.putIfAbsent(token, 0);
                    int newCount = junks.get(token.toLowerCase(Locale.ROOT)) + mark;
                    junks.put(token.toLowerCase(Locale.ROOT), newCount);
                }
            }
    }

    materials.entrySet().stream().sorted((l,r)->{
        int result= r.getValue().compareTo(l.getValue());
                if (result==0){
                 result=l.getKey().compareTo(r.getKey());
                }
        return result;
          }).forEach(i-> System.out.printf("%s: %d",i.getKey(),i.getValue()).println());

    junks.entrySet().stream().sorted((l,r)->l.getKey().compareTo(r.getKey()))
            .forEach(i-> System.out.printf("%s: %d",i.getKey(),i.getValue()).println());

    }
}
