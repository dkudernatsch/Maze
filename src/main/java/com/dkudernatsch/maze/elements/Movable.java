package com.dkudernatsch.maze.elements;

import com.dkudernatsch.entities.movingStrategy.MovingStrategy;

/**
 * Created by dkude on 21/08/2016.
 */
public interface Movable {
    MovingStrategy getMovingStrategy();
    default boolean isMovable(){return false;}
}
