package com.dkudernatsch.entities;

import com.dkudernatsch.maze.Maze;
import javafx.scene.paint.Color;

import java.security.PublicKey;

/**
 * Created by dkude on 21/08/2016.
 */
public class Troll extends Entity{

    private Color bColor = Color.rgb(130, 9, 9);
    private Color fColor = Color.rgb(150, 20, 20);

    private char symbol = 'T';

    public Troll(Maze m){
        this.movingStrategy = new TrollMovingStrategy(Player p, Maze m);
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
}
