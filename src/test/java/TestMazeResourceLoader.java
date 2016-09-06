import com.dkudernatsch.maze.loader.MazeData;
import com.dkudernatsch.maze.loader.MazeResourceLoader;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

/**
 * Created by dkude on 19/08/2016.
 */
public class TestMazeResourceLoader {

    @Test
    public void testMazeLoading(){
        try {
            MazeData mazeData = new MazeResourceLoader().loadResource("/maze.txt");
            assertEquals("#####################################\n" +
                    "# #       #       #     #         # #\n" +
                    "# # ##### # ### ##### ### ### ### # #\n" +
                    "#       #   # #     #     # # #   # #\n" +
                    "##### # ##### ##### ### # # # ##### #\n" +
                    "#   # #       #     # # # # #     # #\n" +
                    "# # ####### # # ##### ### # ##### # #\n" +
                    "# #       # # #   #     #     #   # #\n" +
                    "# ####### ### ### # ### ##### # ### #\n" +
                    "#     #   # #   # #   #     # #     #\n" +
                    "# ### ### # ### # ##### # # # #######\n" +
                    "#   #   # # #   #   #   # # #   #   #\n" +
                    "####### # # # ##### # ### # ### ### #\n" +
                    "#     # #     #   # #   # #   #     #\n" +
                    "# ### # ##### ### # ### ### ####### #\n" +
                    "# #   #     #     #   # # #       # #\n" +
                    "# # ##### # ### ##### # # ####### # #\n" +
                    "# #     # # # # #     #       # #   #\n" +
                    "# ##### # # # ### ##### ##### # #####\n" +
                    "# #   # # #     #     # #   #       #\n" +
                    "# # ### ### ### ##### ### # ##### # #\n" +
                    "# #         #     #       #       # #\n" +
                    "#X###################################",mazeData.toString());
        }catch (IOException e){
            e.printStackTrace();
        }
        Exception e = null;
        try {
            MazeData md = new MazeResourceLoader().loadResource("/failMaze.txt");
        }catch (IOException e1){
            e = e1;
        }
        assertEquals(e != null, true);
    }


}
