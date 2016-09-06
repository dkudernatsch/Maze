package com.dkudernatsch.maze.loader;
import com.dkudernatsch.maze.elements.MazeElement;

import java.util.ArrayList;

/**
 * Created by dkude on 19/08/2016.
 */
public interface DataToMazeElementMapper {

    ArrayList<ArrayList<MazeElement>> map(MazeData data);

}
