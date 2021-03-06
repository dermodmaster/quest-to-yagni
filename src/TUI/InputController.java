package TUI;

import java.io.*;
import reader.*;
import Player.*;
import Board.*;

public class InputController {
    private Board board;
    private Player p;

    public InputController(int x, int y) {
        board = new Board(x,y);
        int[] start = board.getStartfieldCoordinates();
        p = new Player("Player", start[0], start[1], board);
    }

    public int eingabe() {
        String eingabe = null;
        int[] cordinates = p.getCoordinates();
        //DEBUG
        System.out.println("DEBUG: Player Pos (x: "+cordinates[0]+",y: "+cordinates[1]+")");
        System.out.println("Where do you want to go?(North,South,West,East):");
        //InputStreamReader isr = new InputStreamReader(System.in);
        //BufferedReader br = new BufferedReader(isr);
        try {
            eingabe = InputReader.readString();
        } catch (Exception e) {
            e.printStackTrace();
        } /*finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
        if (eingabe.equalsIgnoreCase("North") || eingabe.equalsIgnoreCase("South") || eingabe.equalsIgnoreCase("West") || eingabe.equalsIgnoreCase("East")) {
            boolean ausgabe = p.move(eingabe);
            if (!ausgabe) {
                System.out.println("Can't move " + eingabe);
            }
            if(board.getField(p.getPosition()).getType().equals("Finishfield")) {
                System.out.println("Huuray! You've reached Yagni, the mighty East Westphalian God! Now let his wisdom rain down on you...");
                return 1;
            }
        } else {
            System.out.println("Wrong input");
        }
        return 0;
    }
}
