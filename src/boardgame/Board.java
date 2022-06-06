package boardgame;

public class Board {

    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        //matriz de peças vai ser instanciada na quantidade de linhas e colunas informadas
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public Board setRows(int rows) {
        this.rows = rows;
        return this;
    }

    public int getColumns() {
        return columns;
    }

    public Board setColumns(int columns) {
        this.columns = columns;
        return this;
    }
}
