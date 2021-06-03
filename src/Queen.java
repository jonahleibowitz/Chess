public class Queen extends Piece implements Chess{

    public Queen(int row, int column, boolean isWhite){
        super(row, column, "Queen", isWhite);
    }

    @Override
    public boolean canMove(int row, int col) {
        if(row > 9 || col > 9) {
            return false;
        }
        int myRow = this.getRow();
        int myColumn = this.getColumn();
        if(myRow == row || myColumn == col || (Math.abs(myRow-row) == Math.abs(myColumn - col))){
            return true;
        }else{
            return false;
        }
    }
}
