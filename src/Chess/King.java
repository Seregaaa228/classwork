package Chess;

public class King extends ChessItem {
    public static int COUNTKING;

    public King(int x, int y) {
        super(x, y);
        COUNTKING++;
    }
}
