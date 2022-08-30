package board;

import characters.Player;

import java.util.ArrayList;
import java.util.Random;


public class Board {
    ArrayList<Case> board = new ArrayList<Case>();
    private int size = 64;

    int c = 0;

    Random random = new Random();


    public Board() {
    }

    public Board(int size) {
        this.size = size;
    }


    public void initBoard() {
        switch (c) {
            case 6, 10, 13, 18, 22:
                board.add(new Gobelin());
                break;
            case 3, 7, 12, 17, 21:
                board.add(new StandardPotion());
                break;
            case 4, 8, 14, 20:
                board.add(new Dragon());
                break;
            default:
                board.add(null);
                System.out.println("RAS, relancez le dé");

        }
    }

        public void interactWith(Player player, int caseNumber){
//            board.get(caseNumber).
        }

//        for (int i = 0; i <= size; i++) {
//            int randomCase = random.nextInt(size);
//            if (randomCase
//            board.add(new Gobelin());
//
//        }
    }


