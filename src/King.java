public class King extends Piece implements Chess {

    public King(int row, int column, boolean isWhite) {
        super(row, column, "King", isWhite);
    }

    @Override
    public boolean canMove(int row, int col) {
        if (row > 9 || col > 9) {
            return false;
        }
        int myRow = this.getRow();
        int myColumn = this.getColumn();
        return Math.abs(row - myRow) <= 1 || Math.abs(col - myColumn) <= 1;
    }

}