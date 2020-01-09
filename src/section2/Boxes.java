package section2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Boxes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<Box> set = new HashSet<>();
        System.out.println("Enter the number of boxes");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the details of box %d \n", i + 1);
            System.out.println("Enter length");
            Double length = input.nextDouble();
            System.out.println("Enter Width");
            Double width = input.nextDouble();
            System.out.println("Enter Height");
            Double height = input.nextDouble();
            Box boxObject = new Box(length, width, height);
            boxObject.setVolume();
            set.add(boxObject);
        }
        System.out.println("Unique in the Set are");
        for (Box box : set) {
            System.out.println(box);
        }

        input.close();

    }

}
