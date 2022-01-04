import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        Map<String,String> register=new LinkedHashMap<>();

        for (int i = 0; i <n ; i++) {
            String command= scanner.nextLine();
            String[] line=command.split(" ");
            String id=line[0];

            if (id.equals("register")){
              String userName=line[1];
              String licensePlate=line[2];
                if(register.containsKey(userName)){
                    if(register.get(userName).equals(licensePlate)){
                        System.out.printf("ERROR: already registered with plate number %s",licensePlate).println();
                    }
                }
                else {
                    register.putIfAbsent(userName,licensePlate);
                    System.out.printf("%s registered %s successfully",userName,licensePlate).println();
                }
            }

            if (id.equals("unregister")){
                String userName=line[1];
                if (register.containsKey(userName)){
                    register.remove(userName);
                    System.out.printf("%s unregistered successfully",userName).println();
                }
                else {
                    System.out.printf("ERROR: user %s not found",userName).println();
                }
            }
        }


       // register.entrySet().stream().sorted((n1,n2)-> n1.getKey().compareTo(n2.getKey()))
        //        .forEach(i-> System.out.println(String.format("%s => %s",i.getValue(),i.getKey())));
       // System.out.println();
        register.entrySet().stream().sorted((n1,n2)->{
            int result=n1.getValue().compareTo(n2.getValue());
            if (result==0){
                result= n1.getKey().compareTo(n2.getKey());
            }
            return  result;
        }).forEach(i-> System.out.println(String.format("%s - %s",i.getKey(),i.getValue())));
        System.out.println();

        register.entrySet().stream().sorted((n1,n2)->{
            int result=n2.getValue().compareTo(n1.getValue());
            if (result==0){
                result= n1.getKey().compareTo(n2.getKey());
            }
            return  result;
        }).forEach(i-> System.out.println(String.format("%s - %s",i.getKey(),i.getValue())));
      //  for (Map.Entry<String, String> entry : register.entrySet()) {
       //     System.out.printf("%s => %s",entry.getKey(),entry.getValue()).println();
      //  }
    }
}
