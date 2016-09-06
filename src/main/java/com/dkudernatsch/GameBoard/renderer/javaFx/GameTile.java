package com.dkudernatsch.GameBoard.renderer.javaFx;

import com.dkudernatsch.maze.elements.MazeElement;
import javafx.geometry.VPos;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;

import java.util.Random;

/**
 * Created by dkude on 21/08/2016.
 */
public class GameTile {

    private double posX, posY;
    private double width, height;

    public GameTile(){}

    public GameTile(double posX, double posY, double width, double heigth){
        this.height = heigth;
        this.width = width;
        this.posX = posX;
        this.posY = posY;
    }

    public void render(JavaFxRenderable m, GraphicsContext gc){
        gc.setFill(m.getBackgroundColor());
        gc.fillRect(posX, posY, width, height);
        gc.setFill(m.getForeGroundColor());
        gc.setTextAlign(TextAlignment.CENTER);
        gc.setTextBaseline(VPos.CENTER);
        gc.setFont(new Font("Console",height*.9));
        gc.fillText(""+m.getSymbol(), posX+width/2, posY+height/2);
    }

    public void setPos(double xPos, double yPos, double width, double height){
        this.height = height;
        this.width = width;
        this.posX = xPos;
        this.posY = yPos;
    }
}
