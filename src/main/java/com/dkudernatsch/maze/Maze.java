package com.dkudernatsch.maze;

import com.dkudernatsch.maze.elements.MazeElement;
import com.dkudernatsch.maze.elements.MazeElementFactory;
import com.dkudernatsch.maze.loader.DataToMazeElementMapper;
import com.dkudernatsch.maze.loader.DefaultDataToElementMapper;
import com.dkudernatsch.maze.loader.MazeData;
import com.dkudernatsch.maze.loader.MazeResourceLoader;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by dkude on 19/08/2016.
 */

public class Maze {

    private ArrayList<ArrayList<MazeElement>> maze = new ArrayList<>();

    public Maze(String mazeLocation) throws IOException{
        MazeData data = new MazeResourceLoader().loadResource(mazeLocation);
        DataToMazeElementMapper mapper = new DefaultDataToElementMapper(this);
        maze = mapper.map(data);
    }

    public MazeElement getAtPos(int x, int y){
        if(y < maze.size()){
            ArrayList<MazeElement> list = maze.get(y);
            if(x < list.size()){
                return list.get(x);
            }
        }
        throw new IndexOutOfBoundsException("The position: X= "+x+", Y= "+y+"; is out of the maze's bounds!");
    }

    public boolean moveElement(int fromX, int fromY, int toX, int toY){
        MazeElement toMove = getAtPos(fromX, fromY);
        if(toMove.isMovable()){
            return toMove.getMovingStrategy().move(fromX-toX, fromY-toY);
        }
        return false;
    }

    public void setElementAtPos(MazeElement element, int posX, int posY){
        maze.get(posY).set(posX, element);
    }

    public int getXposFrom(MazeElement m){
       for (int y = 0; y < getYSize(); y++){
          int posX = maze.get(y).indexOf(m);
           if(posX != -1){
               return posX;
           }
       }
       return -1;
    }

    public int getYposFrom(MazeElement m){
        for (int y = 0; y < getYSize(); y++){
            int posX = maze.get(y).indexOf(m);
            if(posX != -1){
                return y;
            }
        }
        return -1;
    }


    public int getXSize(){
        return maze.get(0).size();
    }

    public int getYSize(){
        return maze.size();
    }

}
