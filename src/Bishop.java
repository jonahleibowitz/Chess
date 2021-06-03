public class Bishop extends Piece implements Chess{

    public Bishop(int row, int column, boolean isWhite){
        super(row, column, "Bishop", isWhite);
    }

    @Override
    public boolean canMove(int row, int col) {
        if(row > 9 || col > 9){
            return false;
        }
        int myRow = this.getRow();
        int myColumn = this.getColumn();

        if(Math.abs(myRow-row) == Math.abs(myColumn - col)){
            return true;
        }else{
            return false;
        }
    }
}
