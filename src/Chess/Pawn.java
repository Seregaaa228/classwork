package Chess;

public class Pawn extends ChessItem {
    public static int COUNTPAWN;
    public Pawn(int x, int y) {
        super(x, y);
        COUNTPAWN++;
    }
}
