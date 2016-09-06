package com.dkudernatsch.maze.elements;

import com.dkudernatsch.maze.Maze;

import java.util.function.Supplier;

/**
 * Created by dkude on 19/08/2016.
 */
public class DefaultMazeElementFactory implements MazeElementFactory{

    private Maze maze;

    public DefaultMazeElementFactory(Maze maze){
        this.maze = maze;
    }

    @Override
    public MazeElement getMazeElement(char character) {
        switch (character){
            case '#':
                return new Wall(maze, '#');
            case ' ':
                return new Floor(maze, ' ');
            case 'X':
                return new Goal(maze, 'X');
            default:
                return null;
        }
    }

}
