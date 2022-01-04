import java.util.Scanner;

public class StingExplosionV3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();
        StringBuilder sb=new StringBuilder();

        int power=0;
        for (int i = 0; i <input.length() ; i++) {
            char cur=input.charAt(i);
            if (cur=='>'){
               power+=Integer.parseInt(String.valueOf(input.charAt(i+1)));
               sb.append('>');
            }
            else if(power==0){
                sb.append(cur);
            }
            else {
                power--;
            }
        }
        System.out.print(sb);
    }
}
