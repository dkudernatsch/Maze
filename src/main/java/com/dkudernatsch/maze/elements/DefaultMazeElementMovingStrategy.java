package com.dkudernatsch.maze.elements;

import com.dkudernatsch.entities.movingStrategy.MovingStrategy;
import com.dkudernatsch.maze.Maze;

/**
 * Created by dkude on 21/08/2016.
 */
public class DefaultMazeElementMovingStrategy implements MovingStrategy {

    private Maze maze;
    private MazeElement element;

    public DefaultMazeElementMovingStrategy(Maze maze, MazeElement element){
        this.maze = maze;
        this.element = element;
    }

    @Override
    public boolean move(int deltaX, int deltaY) {
        int fromX = maze.getXposFrom(element);
        int fromY = maze.getYposFrom(element);

        int toX = fromX + deltaX;
        int toY = fromY + deltaY;

        MazeElement moveTo = maze.getAtPos(toX, toY);

        if(!moveTo.isCollidable()){
            maze.setElementAtPos(element, toX, toY);
            maze.setElementAtPos(new Floor(maze, ' '), fromX, fromY);
            return true;
        }
        return false;
    }

}
