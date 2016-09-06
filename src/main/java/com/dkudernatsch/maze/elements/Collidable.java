package com.dkudernatsch.maze.elements;

/**
 * Created by dkude on 20/08/2016.
 */
public interface Collidable {

    boolean isCollidable();

    default void collide(){}

}
