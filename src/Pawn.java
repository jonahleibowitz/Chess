public class Pawn extends Piece implements Chess{
    public Pawn(int row, int column, boolean isWhite){
        super(row, column, "Pawn", isWhite);
    }

    @Override
    public boolean canMove(int row, int col) {
        if(row > 9 || col > 9){
            return false;
        }
        int myRow = this.getRow();
        int myColumn = this.getColumn();

        if(myRow == row - 1 && myColumn == col){
            if(row == 8){
            }
            return true;

        }
        return false;
    }

}