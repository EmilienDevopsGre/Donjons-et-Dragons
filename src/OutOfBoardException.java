public class OutOfBoardException extends Exception{
    public OutOfBoardException(){
        super("vous avez dépassé le nombre de cases du plateau");
    }
}
