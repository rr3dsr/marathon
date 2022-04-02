package day17;

public class Task1 {
    public static void main(String[] args) {
ChessPiece whitePawn=ChessPiece.PAWN_WHITE;
        ChessPiece blackRook=ChessPiece.ROOK_BLACK;

        ChessPiece[]chess={whitePawn,whitePawn,whitePawn,whitePawn,blackRook,blackRook,blackRook,blackRook};
       for(ChessPiece figure:chess){
           System.out.println(figure.name()+" "+figure.getTranslation());
       }

    }
}