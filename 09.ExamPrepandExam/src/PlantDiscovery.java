import java.util.*;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> plantsRarity = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] arg = input.split("<->");
            String plant = arg[0];
            int rarity = Integer.parseInt(arg[1]);
            plantsRarity.putIfAbsent(plant,rarity);
            plantsRarity.put(plant,rarity);
        }

        Map<String, List<Double>> plantsRating= new LinkedHashMap<>();

        String line= scanner.nextLine();
        while(!line.equals("Exhibition")){
        String[] command=line.split(": ",2);
        String com=command[0];
        String str=command[1];

            if (com.equals("Rate")){
            String[] arr=str.split(" - ");
            String plant=arr[0];
            double rating=Double.parseDouble(arr[1]);

            if(!plantsRarity.containsKey(plant)){
                System.out.println("error");
            }
            else {
                plantsRating.putIfAbsent(plant,new ArrayList<>());
                plantsRating.get(plant).add(rating);
            }
            }
            if (com.equals("Update")){
                String[] arr=str.split(" - ");
                String plant=arr[0];
                int newRarity=Integer.parseInt(arr[1]);
                if(!plantsRarity.containsKey(plant)){
                    System.out.println("error");
                }
                else {
                    plantsRarity.put(plant,newRarity);
                }
            }
            if (com.equals("Reset")){
                String plant=command[1];
                if(!plantsRarity.containsKey(plant)){
                    System.out.println("error");
                }
                else {
                        plantsRating.get(plant).clear();
                }
            }
            line= scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");
        plantsRarity.entrySet().stream().sorted((r1,r2)-> r2.getValue().compareTo(r1.getValue()))
                .forEach(entry-> {
                    System.out.println(String.format("- %s; Rarity: %d; Rating: ",entry.getKey(),entry.getValue()));
                   // plantsRating.entrySet().stream().sorted((s1,s2)->{
                        //double first=s1.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
                      //  double second=s2.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
                       // return Double.compare(second,first);
                   // })

                   // (s->  System.out.println(String.format("%f",s.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble())));

                });



    }
}
