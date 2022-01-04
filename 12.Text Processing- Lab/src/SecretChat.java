import java.util.Scanner;

public class SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first= scanner.nextLine();
        String command= scanner.nextLine();
        StringBuilder result=new StringBuilder(first);

        while(!command.equals("Reveal")){
            String[] arr=command.split(":\\|:");
            String comm=arr[0];

            if (comm.equals("InsertSpace")){
                int index= Integer.parseInt(arr[1]);
                result.insert(index," ");
            }

            if (comm.equals("Reverse")){
                String optional=arr[1];
                int indexOfSearch=result.indexOf(optional);
                if(indexOfSearch>=0){
                    result.delete(indexOfSearch,indexOfSearch+optional.length());
                    String reversed = new StringBuilder(optional).reverse().toString();
                    result.append(reversed);
                }
                else {
                    System.out.println("error");
                    command= scanner.nextLine();
                    continue;
                }
            }

            if (comm.equals("ChangeAll")){
                String substring=arr[1];
                String replacement=arr[2];
                String replaced= result.toString().replace(substring,replacement);
                result.setLength(0);
                result.append(replaced);
            }
            System.out.println(result);
            command= scanner.nextLine();
        }


        System.out.printf("You have a new text message: %s",result).println();
    }
}
