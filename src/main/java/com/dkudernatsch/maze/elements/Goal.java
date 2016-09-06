package com.dkudernatsch.maze.elements;

import com.dkudernatsch.maze.Maze;
import javafx.scene.paint.Color;

import java.util.function.Supplier;

/**
 * Created by dkude on 20/08/2016.
 */
public class Goal extends MazeElement{

    public Goal(Maze maze, char symbol) {
        super(maze, symbol);
    }

    private Color bColor = new Color(1,1,1,1);
    private Color fColor = new Color(.2,.2,.2,1);

    @Override
    public boolean isCollidable() {
        return false;
    }

    @Override
    public void collide() {
        //TODO: win game
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
