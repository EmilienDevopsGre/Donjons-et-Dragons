package board.mainBoard;

import players.Player;

public class EmptyCase implements InteractionPlayerBoard {
    @Override
    public void startInteraction(Player player) {

    }

    //        public void jump(){
//        System.out.println("nothing here, roll the dice");
//    }


//    public InteractionPlayerBoard jump(){
//        return EmptyCase::example;
//    }
//    private static void example() {
//        System.out.println("je fais rien");
//    }


    @Override
    public String toString() {
        return "Je suis une case vide";
    }
}
