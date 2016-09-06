package com.dkudernatsch.maze.elements;

/**
 * Created by dkude on 19/08/2016.
 */
public interface MazeElementFactory {

    default MazeElement getMazeElement(int value){
        return getMazeElement((char) value);
    }

    MazeElement getMazeElement(char character);
}
