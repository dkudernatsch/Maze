import com.dkudernatsch.maze.Maze;
import com.dkudernatsch.maze.loader.MazeData;
import com.dkudernatsch.maze.loader.MazeResourceLoader;

import java.io.IOException;

/**
 * Created by dkude on 19/08/2016.
 */
public class TestMazeCreation {

    public static void main(String[] arsg){
        try {
            MazeData md = new MazeResourceLoader().loadResource("/testMaze.txt");

            System.out.println();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
