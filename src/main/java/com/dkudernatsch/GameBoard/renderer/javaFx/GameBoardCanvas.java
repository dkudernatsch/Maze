package com.dkudernatsch.GameBoard.renderer.javaFx;

import com.dkudernatsch.GameBoard.GameBoard;
import javafx.scene.canvas.Canvas;

/**
 * Created by dkude on 21/08/2016.
 */
public class GameBoardCanvas extends Canvas{

    private GameBoard board;
    private GameBoardTileMap tileMap;

    public GameBoardCanvas(double width, double height, GameBoard board) {
        super(width, height);

        widthProperty().addListener(evt -> render());
        heightProperty().addListener(evt -> render());

        tileMap = new GameBoardTileMap(board, getWidth(), getHeight());
        render();
    }

    public void render(){
        tileMap.render(getWidth(), getHeight() ,getGraphicsContext2D());
    }


    @Override
    public boolean isResizable() {
        return true;
    }

    @Override
    public double prefWidth(double height) {
        return getWidth();
    }

    @Override
    public double prefHeight(double width) {
        return getHeight();
    }
}
