package Chess;

public class Bishop extends ChessItem {
    public static int COUNTBISHOP;
    public Bishop(int x, int y) {
        super(x, y);
        COUNTBISHOP++;
    }


    @Override
    public void draw() {
        System.out.println("Слон создан");
    }
}