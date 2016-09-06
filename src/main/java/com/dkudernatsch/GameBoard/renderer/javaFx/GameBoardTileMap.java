package com.dkudernatsch.GameBoard.renderer.javaFx;

import com.dkudernatsch.GameBoard.GameBoard;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * Created by dkude on 21/08/2016.
 */
public class GameBoardTileMap {

    private GameBoard gameBoard;
    private int widthTiles, heightTiles;
    private double width, height;
    private GameTile[][] tiles;

    public GameBoardTileMap(GameBoard gameBoard, double width, double height){
        this.gameBoard = gameBoard;
        widthTiles = gameBoard.getMaze().getXSize();
        heightTiles = gameBoard.getMaze().getYSize();
        tiles = new GameTile[heightTiles][widthTiles];

        for (int y = 0; y < heightTiles; y++){
            for (int x = 0; x < widthTiles; x++){
                tiles[y][x] = new GameTile();
            }
        }
        updateLayout(width, height);
    }

    public void render(double width, double height ,GraphicsContext gc){
        updateLayout(width, height);
        gc.setFill(new Color(.2,.2,.2,1));
        gc.fillRect(0,0,width, height);
        for (int y = 0; y < heightTiles; y++){
            for (int x = 0; x < widthTiles; x++) {

                tiles[y][x].render(gameBoard.getAtPos(x,y), gc);
            }
        }
    }

    private void updateLayout(double width, double height){
        this.height = height;
        this.width = width;

        double tileWidth = width / widthTiles;
        double tileHeight = height / heightTiles;

        for (int y = 0; y < heightTiles; y++){
            for (int x = 0; x < widthTiles; x++){
                tiles[y][x].setPos(x*tileWidth, y*tileHeight, tileWidth, tileHeight);
            }
        }
    }

}
