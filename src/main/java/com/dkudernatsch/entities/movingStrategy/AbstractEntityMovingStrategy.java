package com.dkudernatsch.entities.movingStrategy;

import com.dkudernatsch.entities.Entity;
import com.dkudernatsch.maze.Maze;

/**
 * Created by dkude on 20/08/2016.
 */
public abstract class AbstractEntityMovingStrategy implements MovingStrategy {

    protected Entity entity;
    protected Maze maze;

    public AbstractEntityMovingStrategy(Entity e, Maze m){
        if(e != null && m!= null){
            this.entity = e;
            this.maze = m;
        }
    }

    @Override
    public abstract boolean move(int deltaX, int deltaY);
}
