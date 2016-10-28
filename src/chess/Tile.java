/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

/**
 *
 * @author Mac
 */
public abstract class Tile {
    
    int tileCoord;
    
    Tile(int tileCoord) {
        this.tileCoord = tileCoord;
    }
    
    public abstract boolean isTileOccupied();
    
    public abstract Piece getPiece();
    
    public static final class EmptyTile extends Tile {
        
        EmptyTile(int coord) {
            super(coord);
        }
        
        @Override
        public boolean isTileOccupied() {
            return false;
        }
        
        @Override        
        public Piece getPiece() {
            return null;
        }
    }
    
    public static final class OccupiedTile extends Tile {
        
        Piece pieceOnTile;
        
        OccupiedTile(int tileCoord, Piece piece) {
            super(tileCoord);
            this.pieceOnTile = piece;
        }
        
        @Override
        public boolean isTileOccupied() {
            return true;
        }
        
        @Override
        public Piece getPiece() {
            return this.pieceOnTile;
        }
    }
    
    
}
