import java.util.Scanner;

public class ManOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String one = scanner.nextLine();
        String two = scanner.nextLine();
        int maxHealthCapacity = Integer.parseInt(scanner.nextLine());


        int[] pirateShip= getArray(one);
        int[] warShip=getArray(two);


       // String[] first = one.split(">");
        //int[] pirateShip = new int[first.length];
        //for (int i = 0; i < pirateShip.length; i++) {
         //   pirateShip[i] = Integer.parseInt(first[i]);
       // }

       // String[] second = two.split(">");
       // int[] warShip = new int[second.length];
       // for (int i = 0; i < warShip.length; i++) {
        //    warShip[i] = Integer.parseInt(second[i]);
       // }

        String command = scanner.nextLine();
        while (!command.equals("Retire")) {
            String[] shots = command.split(" ");
            String arg = shots[0];
            switch (arg) {
                case "Fire":
                    int index = Integer.parseInt(shots[1]);
                    int damage = Integer.parseInt(shots[2]);
                    if (index < 0 | index >= warShip.length) {
                        break;
                    } else {
                        warShip[index] = warShip[index] - damage;
                        if (warShip[index] <= 0) {
                            System.out.print("You won! The enemy ship has sunken.");
                            return;
                        }
                    }
                    break;
                case "Defend":
                    int startIndex = Integer.parseInt(shots[1]);
                    int endIndex = Integer.parseInt(shots[2]);
                    int dam = Integer.parseInt(shots[3]);
                    if (startIndex < 0 | endIndex >= pirateShip.length) {
                        break;
                    }
                    for (int i = startIndex; i <= endIndex; i++) {
                        pirateShip[i] = pirateShip[i] - dam;
                        if (pirateShip[i] <= 0) {
                            System.out.print("You lost! The pirate ship has sunken.");
                            return;
                        }
                    }
                    break;
                case "Repair":
                    int repairIndex = Integer.parseInt(shots[1]);
                    int health = Integer.parseInt(shots[2]);
                    if (repairIndex < 0 || repairIndex >= pirateShip.length) {
                        break;
                    }
                    pirateShip[repairIndex]=pirateShip[repairIndex]+health;
                    if (pirateShip[repairIndex]>maxHealthCapacity){
                        pirateShip[repairIndex]=maxHealthCapacity;
                    }
                    break;
                case "Status":
                    int count=0;
                    for (int i = 0; i < pirateShip.length ; i++) {
                        if (pirateShip[i]<0.2*maxHealthCapacity){
                            count++;
                        }
                    }
                    System.out.printf("%d sections need repair.",count).println();
                    break;
            }
            command = scanner.nextLine();
        }

            int sumPirateShip=0;
            for (int i = 0; i < pirateShip.length ; i++) {
                sumPirateShip+=pirateShip[i];
            }
            int sumWarShip=0;
            for (int i = 0; i < warShip.length; i++) {
                sumWarShip+=warShip[i];
            }
            System.out.printf("Pirate ship status: %d",sumPirateShip).println();
            System.out.printf("Warship status: %d",sumWarShip);

    }

    private static int[] getArray(String input) {
        String[] first = input.split(">");
        int[] arr = new int[first.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(first[i]);
        }
        return arr;
    }
}
