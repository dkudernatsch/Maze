package com.dkudernatsch.entities.movingStrategy;

import com.dkudernatsch.entities.Entity;
import com.dkudernatsch.maze.Maze;
import com.dkudernatsch.maze.elements.Floor;

/**
 * Created by dkude on 21/08/2016.
 */
public class FollowingMovingStrategy implements MovingStrategy{

    public FollowingMovingStrategy(Entity toFollow, Entity following, Maze maze){

    }

    @Override
    public boolean move(int deltaX, int deltaY) {
        return false;
    }
}
