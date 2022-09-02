package board;

import players.Player;

import java.util.ArrayList;
import java.util.Random;


public class Board {
    private ArrayList<Case> cases = new ArrayList<Case>();
    private int size = 64;

    int c;

    Random random = new Random();


    public Board() {
    }

    public Board(int size) {
        this.size = size;
    }


    public void initBoard() {
        do {
            switch (c) {
                case 3, 6, 9, 12, 15, 18, 21, 24, 27, 30:
                    System.out.println(this.c + "gobelin");
                    cases.add(new EnemyCase(new Gobelin()));
                    break;
                case 10, 20, 25, 32, 35, 36, 37, 40, 44, 47:
                    cases.add(new EnemyCase(new Sorcier()) {
                    });
                    System.out.println(this.c + "sorcier");
                    break;
                case 45, 52, 56, 62:
                    cases.add(new EnemyCase(new Dragon()));
                    System.out.println(this.c + "dragon");
                    break;
                case 7, 13, 31, 33, 39, 43:
                    cases.add(new SurpriseCase(new StandardPotion()));
                    System.out.println(this.c + "standard potion");
                    break;
                case 28, 41:
                    cases.add(new SurpriseCase(new BigPotion()));
                    System.out.println(this.c + "big potion");
                    break;
                case 48, 49:
                    cases.add(new SurpriseCase(new BoulesDeFeu()));
                    System.out.println(this.c + "boule de feu");
                    break;
                case 1, 4, 8, 17, 23:
                    cases.add(new SurpriseCase(new Eclairs()));
                    System.out.println(this.c + "éclair");
                    break;
                case 19, 26, 42, 53:
                    cases.add(new SurpriseCase(new Epees()));
                    System.out.println(this.c + "épée");
                    break;
                default:
                    cases.add(new EmptyCase());
//                System.out.println("RAS, relancez le dé");
            }
//            System.out.println(this.board.get(c));
            c++;
        } while (this.c <= 64);
    }

    public Case getCase(int posCase) {
        return cases.get(posCase);

    }

    private static Case[] push(Case[] array, Case push) {
        Case[] longer = new Case[array.length + 1];
        for (int i = 0; i < array.length; i++)
            longer[i] = array[i];
        longer[array.length] = push;
        return longer;
    }


    public Case[] getCasesArray() {
//        int[] casesArray = cases.get(5);
//        Case[] caseArray = new Case[cases.size()];
        Case caseArray[] = new Case [cases.size()];
//        Case[]caseArray = cases.toArray(new Case[0]);
        for (int i = 0; i < cases.size(); i++) {
//        for (Case i : caseArray)
//            push(int[] caseArray, cases.get(i));
            caseArray[i]= cases.get(i);
        }
        System.out.println(caseArray);
//        System.out.println(caseArray + "youhouuuuuuuuuuuuuu");
//        for (int i = 0; i < caseArray.length; i++){
//            System.out.println(cases.indexOf(i));
//        }
        return caseArray;

    }

    public void interactWith(Player player, int caseNumber) {
//            board.get(caseNumber).
    }

//        for (int i = 0; i <= size; i++) {
//            int randomCase = random.nextInt(size);
//            if (randomCase
//            board.add(new Gobelin());
//
//        }
}


