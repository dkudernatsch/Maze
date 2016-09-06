package com.dkudernatsch.maze.elements;

import com.dkudernatsch.GameBoard.renderer.javaFx.JavaFxRenderable;
import com.dkudernatsch.entities.movingStrategy.MovingStrategy;
import com.dkudernatsch.maze.Maze;
import com.dkudernatsch.util.Factorizable;
import com.sun.org.glassfish.external.amx.AMX;

/**
 * Created by dkude on 19/08/2016.
 */
public abstract class MazeElement implements Collidable, Movable,JavaFxRenderable{

    private Maze maze;
    private char symbol;

    private int posX, posY;

    public MazeElement(Maze maze ,char symbol){
        setSymbol(symbol);
        this.maze = maze;
    }

    private void setPos(int x, int y){
        this.posX = x;
        this.posY = y;
    }

    @Override
    public MovingStrategy getMovingStrategy() {
        return new DefaultMazeElementMovingStrategy(maze, this);
    }

    public abstract String toString();

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
}
