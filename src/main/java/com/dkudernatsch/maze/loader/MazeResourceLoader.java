package com.dkudernatsch.maze.loader;

import java.io.IOException;

/**
 * Created by dkude on 19/08/2016.
 */
public class MazeResourceLoader implements ResourceLoader<MazeData>{
    @Override
    public MazeData loadResource(String fileName)throws IOException{
        return new MazeData(this.getClass().getResourceAsStream(fileName));
    }
}
