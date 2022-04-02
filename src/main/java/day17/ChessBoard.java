package day17;

public class ChessBoard {
    ChessPiece[][] chess;

    public ChessBoard(ChessPiece[][] chess) {
        this.chess = chess;
    }

    public void print() {
        int countLine = 0;
        while (countLine < 8) {
            for (int countColumn = 0; countColumn < 8; countColumn++) {
                if (chess[countLine][countColumn] == null) {
                    chess[countLine][countColumn] = ChessPiece.EMPTY;
                    System.out.print(chess[countLine][countColumn].getTranslation());
                } else {
                    System.out.print("("+chess[countLine][countColumn].name()+")");
                }
            }
            countLine++;
            System.out.print("\n");
        }
    }
}
