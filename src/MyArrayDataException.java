public class MyArrayDataException extends RuntimeException {

    private int row;
    private int col;

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public MyArrayDataException(String s, int row, int col) {
        this.row = row;
        this.col = col;
    }
}
