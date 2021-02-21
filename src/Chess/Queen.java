package Chess;

public class Queen extends ChessItem {
    public static int COUNTQUEEN;

    public Queen(int x, int y) {
        super(x, y);
        COUNTQUEEN++;

    }


    @Override
    public void draw() {
        System.out.println("Королева создана");
    }
}
