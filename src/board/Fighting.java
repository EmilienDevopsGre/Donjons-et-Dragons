package board;

import java.util.Scanner;

public interface Fighting {
    Scanner scanner = new Scanner(System.in);
    default void fight(int life, int attack){
        life = life - attack;
    }


}

