package section1;

import java.util.ArrayList;
import java.util.Scanner;

public class SumAverage {

    public static void main(String[] args) {
        int total = 0, n;
        double average = 0;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            int score = input.nextInt();
            list.add(score);

        }
        for (Object object : list) {
            total = total + (int) object;

        }
        System.out.print(total + "\n");
        for (int i = 0; i < n; i++) {
            average = total / n;
        }
        System.out.println(average);
        input.close();

    }

}
