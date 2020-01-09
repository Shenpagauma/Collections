package section2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxScored {

    public static void main(String[] args) {
        Map<String, Long> hm = new HashMap<String, Long>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of players ");
        String playerName = null;
        Long runs = null;
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the details of player " + (i + 1));
            playerName = sc.nextLine();
            runs = sc.nextLong();
            sc.nextLine();
            hm.put(playerName, runs);
        }
        LinkedHashMap<String, Long> linked = new LinkedHashMap<String, Long>();
        linked.putAll(hm);
        ArrayList<String> key = new ArrayList<String>();
        ArrayList<Long> value = new ArrayList<Long>();
        for (Map.Entry<String, Long> map : hm.entrySet()) {
            key.add(map.getKey());
            value.add(map.getValue());
        }
        Long maxValue = Collections.max(value);
        int index = -1;
        
        for (int i = 0; i < value.size(); i++) {
            if (maxValue == value.get(i)) {
                index = i;
                break;
            }
        }
        System.out.println(key.get(index));
        sc.close();
    }

}
