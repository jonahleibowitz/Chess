public class Knight extends Piece implements Chess{

    public Knight(int row, int column, boolean isWhite){
        super(row, column, "Knight", isWhite);
    }

    @Override
    public boolean canMove(int row, int col) {
        if(row > 9 || col > 9){
            return false;
        }
        int myRow = this.getRow();
        int myColumn = this.getColumn();
        if((Math.abs(row - myRow) == 2 && Math.abs(col - myColumn) == 1) ||
                (Math.abs(row - myRow) == 1 && Math.abs(col - myColumn) == 2)){
            return true;
        }else{
            return false;
        }
    }

}