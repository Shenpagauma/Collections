package section1;

import java.util.ArrayList;

public class PlayerBO {
    public void displayAllPlayerDetails(ArrayList<Player> list) {
        System.out.println("Player Details\n");

        for (Player player : list) {
            System.out.println(player);
        }
    }

}
