package Chess;

public class Knight extends ChessItem{
    public static int COUNTKNIGHT;
    public Knight(int x, int y) {
        super(x, y);
        COUNTKNIGHT++;
    }
    @Override
    public void draw() {
        System.out.println("Конь создан");
    }
}
