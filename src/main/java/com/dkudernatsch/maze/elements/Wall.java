package com.dkudernatsch.maze.elements;

import com.dkudernatsch.maze.Maze;
import com.dkudernatsch.util.Factorizable;
import javafx.scene.paint.Color;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Created by dkude on 19/08/2016.
 */
public class Wall extends MazeElement {

    private Color bColor = new Color(.3,.3,.3,1);
    private Color fColor = new Color(.5,.5,.5,1);


    public Wall(Maze maze, char symbol) {
        super(maze, symbol);
    }

    @Override
    public boolean isCollidable() {
        return true;
    }

    @Override
    public String toString() {
        return "#";
    }

    @Override
    public Color getBackgroundColor() {
        return bColor;
    }

    @Override
    public Color getForeGroundColor() {
        return fColor;
    }

    @Override
    public boolean isMovable() {
        return true;
    }
}
