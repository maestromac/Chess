package com.chess.engine.pieces;

import com.chess.engine.Alliance;
import com.chess.engine.board.Board;
import com.chess.engine.board.Move;
import java.util.ArrayList;
import java.util.List;

public class Knight extends Piece {
 
    private final static int[] CANDIDATE_MOVE_COORDS = { -17, -15, -10, -6, 6, 10, 15, 17 };
    
    Knight(final int piecePos, final Alliance pieceAlliance) {
        super(piecePos, pieceAlliance);
    }

    @Override
    public List<Move> calculateLegalMoves(Board board) {
        
        int candidateDestinationCoordinate;
        final List<Move> legalMoves = new ArrayList<>();
        
        for (final int currentCandidate : CANDIDATE_MOVE_COORDS) {
            
            candidateDestinationCoordinate  = this.piecePos + currentCandidate;
            
            if (true) {
                
            }
        }
        
        return null;
    }
    
}
