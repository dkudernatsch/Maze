package com.dkudernatsch.entities.movingStrategy;

import com.dkudernatsch.entities.Entity;
import com.dkudernatsch.entities.Player;
import com.dkudernatsch.maze.Maze;
import com.dkudernatsch.maze.elements.MazeElement;
import com.dkudernatsch.util.Direction;
import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.ParameterList;

/**
 * Created by dkude on 21/08/2016.
 */
public class PlayerMovingStrategy extends AbstractEntityMovingStrategy{

    public PlayerMovingStrategy(Player e, Maze m) {
        super(e, m);
    }

    @Override
    public boolean move(int deltaX, int deltaY) {
        if(Math.abs(deltaX) + Math.abs(deltaY) == 1){

            Direction movingDir = Direction.getDirection(deltaX, deltaY);
            if(((Player)entity).getFacing() == movingDir){
                MazeElement moveTo = maze.getAtPos(entity.getPosX()+deltaX, entity.getPosY()+deltaY);
                if(!moveTo.isCollidable()) {
                    entity.setPoSX(entity.getPosX()+deltaX);
                    entity.setPosY(entity.getPosY()+deltaY);
                    moveTo.collide();
                    return true;
                }else if(moveTo.isMovable()){
                    if(moveTo.getMovingStrategy().move(deltaX, deltaY)){
                        entity.setPoSX(entity.getPosX()+deltaX);
                        entity.setPosY(entity.getPosY()+deltaY);
                        moveTo.collide();
                        return true;
                    }
                }
            }else {
                ((Player)entity).setFacing(movingDir);
            }

        }
        return false;
    }

}
