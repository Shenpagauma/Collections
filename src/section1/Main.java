package section1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Player> list = new ArrayList<Player>();

        System.out.println("Enter the number of players");
        int n = input.nextInt();
        input.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the player name \n");

            String playerName = input.nextLine();
            System.out.println("Enter the country name \n");

            String countryrName = input.nextLine();
            System.out.println("Enter the skill \n");

            String skill = input.nextLine();
            Player p = new Player(playerName, countryrName, skill);
            list.add(p);

        }
        PlayerBO playerBo = new PlayerBO();
        playerBo.displayAllPlayerDetails(list);
        input.close();

    }

}
