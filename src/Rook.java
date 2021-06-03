public class Rook extends Piece implements Chess{

    public Rook(int row, int column, boolean isWhite){
        super(row, column, "Rook", isWhite);
    }

    @Override
    public boolean canMove(int row, int col) {
        if(row > 9 || col > 9){
            return false;
        }
        int myRow = this.getRow();
        int myColumn = this.getColumn();
        if(myRow == row || myColumn == col){
            return true;
        }else{
            return false;
        }
    }

}
