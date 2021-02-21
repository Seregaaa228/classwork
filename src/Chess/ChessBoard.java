package Chess;

public class ChessBoard implements DrawChessBoard {
    public ChessBoard() {
        showChessBoard();
    }

    static Object cell [] = new Object[16];


    @Override
    public void showChessBoard() {
        System.out.println("Доска создана");
    }
}
