package day17;

public enum ChessPiece {
    KING_WHITE(100,"белый"),
    KING_BLACK(100,"черный"),
    QUEEN_WHITE(9,"белая"),
    QUEEN_BLACK(9,"черная"),
    ROOK_WHITE(5,"белая"),
    ROOK_BLACK(5,"черная"),
    BISHOP_WHITE(3.5f,"белый"),
    BISHOP_BLACK(3.5f,"черный"),
    KNIGHT_WHITE(3,"белый"),
    KNIGHT_BLACK(3,"черный"),
    PAWN_WHITE(1,"белая"),
    PAWN_BLACK(1,"черная"),
    EMPTY(-1,"_");


  private float valuationF;


    private int valuationI;
   private String translation;
   ChessPiece(int valuationI,String translation){
       this.valuationI=valuationI;
       this.translation=translation;
   }

   ChessPiece(float valuationF,String translation){
       this.valuationF=valuationF;
       this.translation=translation;
   }


    public float getValuationF() {
        return valuationF;
    }

    public int getValuationI() {
        return valuationI;
    }

    public String getTranslation() {
        return translation;
    }
}
