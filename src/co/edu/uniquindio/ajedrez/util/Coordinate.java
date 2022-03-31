package co.edu.uniquindio.ajedrez.util;

public class Coordinate {

    private int row = 0;
    private int col = 0;

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public static Coordinate parseCoordinate(String value) {
        char[] rows = "87654321".toCharArray();
        char[] cols = "abcdefgh".toCharArray();

        for (int row = 0; row < 8; row++) {
            for (int columm = 0; columm < 8; columm++) {
                if (("" + cols[columm] + rows[row]).equals(value.toLowerCase())) {
                    Coordinate coordinate = new Coordinate();
                    coordinate.setRow(row);
                    coordinate.setCol(columm);
                    return coordinate;
                }
            }
        }

        return null;
    }

    public String toString() {
        char[] rows = "87654321".toCharArray();
        char[] cols = "abcdefgh".toCharArray();

        return "" + cols[col] + rows[row];
    }
}
