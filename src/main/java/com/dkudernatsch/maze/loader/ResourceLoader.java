package com.dkudernatsch.maze.loader;

import java.io.File;
import java.io.IOException;

/**
 * Created by dkude on 19/08/2016.
 */
public interface ResourceLoader<T> {

    default T loadResource(File f) throws IOException{
        return loadResource(f.getPath());
    }

    T loadResource(String location) throws IOException;
}
