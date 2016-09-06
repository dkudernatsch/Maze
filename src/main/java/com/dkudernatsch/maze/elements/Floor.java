package com.dkudernatsch.maze.elements;

import com.dkudernatsch.maze.Maze;
import javafx.scene.paint.Color;

import java.util.function.Supplier;

/**
 * Created by dkude on 19/08/2016.
 */
public class Floor extends MazeElement{

    private Color bColor = new Color(.5,.5,.5,1);
    private Color fColor = new Color(.2,.2,.2,1);

    public Floor(Maze maze, char symbol) {
        super(maze, symbol);
    }

    @Override
    public boolean isCollidable() {
        return false;
    }

    @Override
    public String toString() {
        return getSymbol()+"";
    }

    @Override
    public Color getBackgroundColor() {
        return bColor;
    }

    @Override
    public Color getForeGroundColor() {
        return fColor;
    }

}
