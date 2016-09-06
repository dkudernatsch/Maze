package com.dkudernatsch.maze.loader;

import com.dkudernatsch.maze.Maze;
import com.dkudernatsch.maze.elements.DefaultMazeElementFactory;
import com.dkudernatsch.maze.elements.MazeElement;
import com.dkudernatsch.maze.elements.MazeElementFactory;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * Created by dkude on 19/08/2016.
 */
public class DefaultDataToElementMapper implements DataToMazeElementMapper{

    private final Maze maze;
    private MazeElementFactory factory;

    public DefaultDataToElementMapper(Maze maze){
        this.maze = maze;
        factory = new DefaultMazeElementFactory(maze);
    }

    @Override
    public ArrayList<ArrayList<MazeElement>> map(MazeData data) {
        ArrayList<ArrayList<MazeElement>> list = new ArrayList<>();

        data.getData().forEach(
                (s) -> list.add(
                        (ArrayList<MazeElement>)s.chars()
                                .mapToObj(value -> factory.getMazeElement(value))
                                .collect(Collectors.toList())
                        )
        );

        return list;
    }
}
