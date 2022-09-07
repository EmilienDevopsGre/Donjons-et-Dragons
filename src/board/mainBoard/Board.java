package board.mainBoard;

import board.enemies.Dragon;
import board.enemies.EnemyCase;
import board.enemies.Gobelin;
import board.enemies.Sorcier;
import board.loot.SurpriseCase;
import board.loot.attack.BoulesDeFeu;
import board.loot.attack.Eclairs;
import board.loot.attack.Epees;
import board.loot.potion.BigPotion;
import board.loot.potion.StandardPotion;
import players.Player;

import java.util.ArrayList;
import java.util.Random;


public class Board {
    public ArrayList<InteractionPlayerBoard> cases = new ArrayList<>();
    private int size = 64;
    Player player;

    public Board(Player player) {
        this.player = player;
    }
    public void initBoard() {
        if (cases.size() > 0){
            cases.clear();
        }
        for (int i = 0; i < size; i++) {
            switch (i) {
                case 3, 6, 9, 12, 15, 18, 21, 24, 27, 30 -> cases.add(new EnemyCase(new Gobelin()));
                case 10, 20, 25, 32, 35, 36, 37, 40, 44, 47 -> cases.add(new EnemyCase(new Sorcier()));
                case 45, 52, 56, 62 -> cases.add(new EnemyCase(new Dragon()));
                case 7, 13, 31, 33, 39, 43 -> cases.add(new SurpriseCase(new StandardPotion()));
                case 28, 41 -> cases.add(new SurpriseCase(new BigPotion()));
                case 48, 49 -> cases.add(new SurpriseCase(new BoulesDeFeu()));
                case 1, 4, 8, 17, 23 -> cases.add(new SurpriseCase(new Eclairs()));
                case 19, 26, 42, 53 -> cases.add(new SurpriseCase(new Epees()));
                default -> cases.add(new EmptyCase());
            }
        }
    }

    public void show() {
        for (InteractionPlayerBoard cell: cases) {
            System.out.println(cell.toString());
        }
    }

    public InteractionPlayerBoard getCase(int posCase) {
        return cases.get(posCase);
    }

    // getters setters
    public ArrayList<InteractionPlayerBoard> getCases() {
        return cases;
    }

    public void setCases(InteractionPlayerBoard slot, int i) {
        this.cases.set(i, slot);
    }
}






























//    private static Case[] push(Case[] array, Case push) {
//        Case[] longer = new Case[array.length + 1];
//        for (int i = 0; i < array.length; i++)
//            longer[i] = array[i];
//        longer[array.length] = push;
//        return longer;
//    }


//    public Case[] getCasesArray() {
////        int[] casesArray = cases.get(5);
////        Case[] caseArray = new Case[cases.size()];
//        Case caseArray[] = new Case[cases.size()];
////        Case[]caseArray = cases.toArray(new Case[0]);
//        for (int i = 0; i < cases.size(); i++) {
////        for (Case i : caseArray)
////            push(int[] caseArray, cases.get(i));
//            caseArray[i] = cases.get(i);
//        }
//        System.out.println(caseArray);
////        System.out.println(caseArray + "youhouuuuuuuuuuuuuu");
////        for (int i = 0; i < caseArray.length; i++){
////            System.out.println(cases.indexOf(i));
////        }
//        return caseArray;
//
//    }


//    public void interactWith(Player player, int caseNumber) {
//            board.get(caseNumber).


//        for (int i = 0; i <= size; i++) {
//            int randomCase = random.nextInt(size);
//            if (randomCase
//            board.add(new Gobelin());
//
//        }

