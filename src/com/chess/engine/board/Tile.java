package com.chess.engine.board;

import com.chess.engine.pieces.Piece;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;

public abstract class Tile {
    
    protected final int tileCoord;
    
    private static final Map<Integer, EmptyTile> EMPTY_TILES_CACHE = createAllPossibleEmptyTiles();
    
    private static Map<Integer, EmptyTile> createAllPossibleEmptyTiles() {
        
        final Map<Integer, EmptyTile> emptyTileMap = new HashMap<>();
        
        for(int i = 0; i < 64; i++) {
            emptyTileMap.put(i, new EmptyTile(i));
        }
        
        return ImmutableMap.copyOf(emptyTileMap);
    }
    
    public static Tile createTile(final int tileCoord, final Piece piece) {
        return piece == null ? EMPTY_TILES_CACHE.get(tileCoord) : new OccupiedTile(tileCoord, piece);
    }
    
    private Tile(int tileCoord) {
        this.tileCoord = tileCoord;
    }
    
    public abstract boolean isTileOccupied();
    
    public abstract Piece getPiece();
    
    public static final class EmptyTile extends Tile {
        
        private EmptyTile(final int coord) {
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
        
        private final Piece pieceOnTile;
        
        private OccupiedTile(int tileCoord, Piece piece) {
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
