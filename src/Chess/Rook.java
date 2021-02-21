package Chess;

public class Rook extends ChessItem {
    public static int COUNTROOK;
    public Rook(int x, int y) {
        super(x, y);
        COUNTROOK++;
    }

    @Override
    public void draw() {
        System.out.println("Ладья создана");
    }
}
