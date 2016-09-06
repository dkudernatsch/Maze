package com.dkudernatsch.entities;

import com.dkudernatsch.GameBoard.renderer.javaFx.JavaFxRenderable;
import com.dkudernatsch.entities.movingStrategy.MovingStrategy;
import com.dkudernatsch.maze.Maze;

/**
 * Created by dkude on 20/08/2016.
 */
public abstract class Entity implements JavaFxRenderable{

    protected MovingStrategy movingStrategy;
    protected Maze maze;

    private int poSX,posY;

    public boolean move(int deltaX, int deltaY){
        return movingStrategy.move(deltaX, deltaY);
    }

    public int getPosX() {
        return poSX;
    }
    public void setPoSX(int poSX) {
        this.poSX = poSX;
    }
    public int getPosY() {
        return posY;
    }
    public void setPosY(int posY) {
        this.posY = posY;
    }
}
