import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(nums));

        List<String> name=new ArrayList<>();

        System.out.println(name.size());

        name.add("Marin");
        name.add("Sotir");
        name.add("Hui");

        System.out.println(name.size());
        System.out.println(name.get(2));
        name.remove(1);
        name.remove("Marin");
        System.out.println(name.size());
        System.out.println(name.get(0));

        name.set(0,"Gosho");
        System.out.print(name.get(0));


    }
}
