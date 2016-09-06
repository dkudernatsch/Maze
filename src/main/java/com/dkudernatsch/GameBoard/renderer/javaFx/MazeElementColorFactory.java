package com.dkudernatsch.GameBoard.renderer.javaFx;

import com.dkudernatsch.maze.elements.Floor;
import com.dkudernatsch.maze.elements.Goal;
import com.dkudernatsch.maze.elements.MazeElement;
import com.dkudernatsch.maze.elements.Wall;
import javafx.scene.paint.Color;

/**
 * Created by dkude on 21/08/2016.
 */
public class MazeElementColorFactory {
    public static Color getColor(MazeElement m){
        if(m instanceof Floor){
            return new Color(.4,.4,.4,1);
        }else if(m instanceof Wall){
            return new Color(.2,.2,.2,1);
        }else if(m instanceof Goal){
            return new Color(.6, .9, .7, 1);
        }else {
            return new Color(0,0,0,0);
        }
    }
}
