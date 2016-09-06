package com.dkudernatsch.maze.loader;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by dkude on 19/08/2016.
 */
public class MazeData {

    private int width = -1;
    private int height = -1;

    private ArrayList<String> data = new ArrayList<>();

    public MazeData(InputStream in) throws IOException{
        LineNumberReader lnr = new LineNumberReader(new InputStreamReader(in, "utf-8"));
        String line;
        while ((line = lnr.readLine()) != null){
            if(width == -1 && height == -1){
                width = line.length();
                height++;
            }else{
                if(line.length() == width){
                    height ++;
                }else{
                    throw new IOException("Maze file could not be read: Unequal Line length in line: "+lnr.getLineNumber());
                }
            }
            data.add(line);
        }
    }

    public ArrayList<String> getData(){
        return data;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return data.stream().reduce((s1, s2) -> s1+"\n"+s2).orElseGet(()->"");
    }

}
