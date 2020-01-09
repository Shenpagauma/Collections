package section1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class SortScores {

    public static void main(String[] args) {
        ArrayList<Integer> teamList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int runs = sc.nextInt();
            teamList.add(runs);
        }
        Collections.sort(teamList);
        Iterator<Integer> i = teamList.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        sc.close();

    }

}
