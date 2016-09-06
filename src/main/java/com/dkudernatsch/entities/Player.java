package com.dkudernatsch.entities;


import com.dkudernatsch.entities.movingStrategy.PlayerMovingStrategy;
import com.dkudernatsch.maze.Maze;
import com.dkudernatsch.util.Direction;
import javafx.scene.paint.Color;

/**
 * Created by dkude on 20/08/2016.
 */
public class Player extends Entity{

    private char[] dirs = new char[]{'^','>','v','<'};

    private Color bColor = Color.CHOCOLATE;
    private Color fColor = Color.CHOCOLATE.brighter().brighter();

    private char symbol;

    private Direction dir;

    public Player(Maze maze){
        if(maze != null){
            this.maze = maze;
            movingStrategy  = new PlayerMovingStrategy(this ,maze);
        }
    }

    @Override
    public String toString() {
        return ""+symbol;
    }

    @Override
    public char getSymbol() {
        return symbol;
    }

    @Override
    public Color getBackgroundColor() {
        return bColor;
    }

    @Override
    public Color getForeGroundColor() {
        return fColor;
    }

    public void setFacing(Direction dir){
        this.dir = dir;
        symbol = dirs[dir.getDirectionCode()];
    }

    public Direction getFacing(){
        return dir;
    }
}
