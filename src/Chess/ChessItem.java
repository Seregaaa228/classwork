package Chess;

public abstract class ChessItem  {

    String name = getClass().getName();
    public ChessItem(int x, int y){
        this.x = x;
        this.y = y;


    }


    public int x,y;

    @Override
    public String toString() {
        return  name +"(" + x + "; " + y + ")";
    }
}
