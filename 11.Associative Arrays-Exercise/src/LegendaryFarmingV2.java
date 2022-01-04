import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarmingV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> keyMaterials = new LinkedHashMap<>();
        keyMaterials.put("shards",0);
        keyMaterials.put("fragments",0);
        keyMaterials.put("motes",0);
        Map<String, Integer> junks = new LinkedHashMap<>();

        boolean isObtained=false;
        while(!isObtained){
            String[] line =scanner.nextLine().split(" ");
            for (int i = 0; i < line.length; i += 2) {
                int quantity = Integer.parseInt(line[i]);
                String item = line[i + 1].toLowerCase(Locale.ROOT);

                if (keyMaterials.containsKey(item)) {
                   addToMap(keyMaterials,item,quantity);
                  isObtained=isObtained(keyMaterials,item);
                  if (isObtained){
                      break;
                  }
                }
                else {
                    addToMap(junks,item,quantity);
                }
            }
        }

        keyMaterials.entrySet().stream().sorted((m1,m2)-> {
         int result=  m2.getValue().compareTo(m1.getValue());
            if (result==0){
                 result = m1.getKey().compareTo(m2.getKey());
            }
            return  result;
       }).forEach(m -> System.out.println(String.format("%s: %d",m.getKey(),m.getValue())));

        junks.entrySet().stream().sorted((j1,j2)-> j1.getKey().compareTo(j2.getKey()))
                        .forEach(j -> System.out.println(String.format("%s: %d",j.getKey(),j.getValue())));


        keyMaterials.entrySet().stream().sorted((i1,i2)->{
            int result= i2.getValue().compareTo(i1.getValue());
            if (result==0){
                result=i1.getKey().compareTo(i2.getKey());
            }
            return result;
        }).forEach(i-> System.out.println(String.format("%s: %d",i.getKey(),i.getValue())));

        junks.entrySet().stream().sorted((l,r)->l.getKey().compareTo(r.getKey()))
                .forEach(i-> System.out.println(String.format("%s: %d",i.getKey(),i.getValue())) );
    }


    private static void addToMap(Map<String, Integer> map, String item, int quantity) {
        map.putIfAbsent(item,0);
        int newQuantity=map.get(item)+quantity;
        map.put(item,newQuantity);
    }

    private static boolean isObtained(Map<String, Integer> map, String item) {
        if (map.get(item)>=250) {
            int newQuantity = map.get(item) - 250;
            map.put(item, newQuantity);

            switch (item) {
                case "shards":
                    System.out.println("Shadowmourne obtained!");
                    break;
                case "fragments":
                    System.out.println("Valanyr obtained!");
                    break;
                case "motes":
                    System.out.println("Dragonwrath obtained!");
                    break;
            }
            return true;
        }
        return false;
    }
}
