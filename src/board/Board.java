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
            case 3, 6, 9, 12, 15, 18, 21, 24, 27, 30:
                board.add(new Gobelin());
                break;
            case 10, 20, 25, 32, 35, 36, 37, 40, 44, 47:
                board.add(new Sorcier());
                break;
            case 45, 52, 56, 62:
                board.add(new Dragon());
                break;
            case 7, 13, 31, 33, 39, 43:
                board.add(new StandardPotion());
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


