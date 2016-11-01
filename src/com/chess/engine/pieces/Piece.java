/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.chess.engine.pieces;

import com.chess.engine.Alliance;
import com.chess.engine.board.Board;
import com.chess.engine.board.Move;
import java.util.List;

public abstract class Piece {
  
    protected final int piecePos;
    protected final Alliance pieceAlliance;
    
    Piece(final int piecePos, final Alliance pieceAlliance) {
        this.piecePos = piecePos;
        this.pieceAlliance = pieceAlliance; 
    }
    
    public abstract List<Move> calculateLegalMoves(final Board board); 
    
}
