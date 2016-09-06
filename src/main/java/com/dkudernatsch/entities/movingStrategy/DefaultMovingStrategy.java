package com.dkudernatsch.entities.movingStrategy;

import com.dkudernatsch.entities.Entity;
import com.dkudernatsch.maze.Maze;
import com.dkudernatsch.maze.elements.MazeElement;

/**
 * Created by dkude on 20/08/2016.
 */
public class DefaultMovingStrategy extends AbstractEntityMovingStrategy{

    public DefaultMovingStrategy(Entity e, Maze m) {
        super(e, m);
    }

    @Override
    public boolean move(int deltaX, int deltaY) {
        if(Math.abs(deltaX) + Math.abs(deltaY) == 1){

            MazeElement moveTo = maze.getAtPos(entity.getPosX()+deltaX, entity.getPosY()+deltaY);

            if(!moveTo.isCollidable()){
                entity.setPoSX(entity.getPosX()+deltaX);
                entity.setPosY(entity.getPosY()+deltaY);
                moveTo.collide();
                return true;
            }
        }
        return false;
    }

}
