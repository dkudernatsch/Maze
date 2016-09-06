package com.dkudernatsch.GameBoard;

import com.dkudernatsch.GameBoard.renderer.javaFx.JavaFXGameBoardApplication;
import com.dkudernatsch.GameBoard.renderer.javaFx.JavaFXGameBoardRenderer;
import com.dkudernatsch.GameBoard.renderer.javaFx.JavaFxRenderable;
import com.dkudernatsch.entities.Entity;
import com.dkudernatsch.entities.Player;
import com.dkudernatsch.maze.Maze;
import com.dkudernatsch.util.Direction;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by dkude on 20/08/2016.
 */
public class GameBoard{

    static GameBoard board;

    public static GameBoard getBoard(){
        return board;
    }

    private Player player;
    private ArrayList<Entity> entities = new ArrayList<>();
    private Maze maze;
    private GameBoardRenderer renderer;

    public GameBoard(){
        try {
            if(board != null){
                throw new IllegalStateException();
            }
            GameBoard.board = this;
            this.maze = new Maze("/maze.txt");
            this.player = new Player(maze);
            entities.add(player);
            setPlayerOnMaze(player, maze);
            Thread t = new Thread();
            t.setDaemon(true);
            renderer = new JavaFXGameBoardRenderer();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public void render(){
        renderer.render(this);
    }
    public JavaFxRenderable getAtPos(int x, int y){

        return  entities.stream()
                .filter(entity -> entity.getPosX() == x && entity.getPosY() == y).findFirst()
                .map(entity -> (JavaFxRenderable)entity)
                .orElse(maze.getAtPos(x,y));

    }
    private void setPlayerOnMaze(Player player, Maze maze){
        Random rnd = new Random();
        boolean set = false;
        int rndX, rndY;
        while (!set){
            rndX = rnd.nextInt(maze.getXSize());
            rndY = rnd.nextInt(maze.getYSize());

            if(!maze.getAtPos(rndX, rndY).isCollidable()){
                player.setPoSX(rndX);
                player.setPosY(rndY);
                player.setFacing(Direction.getDirection(rnd.nextInt(4)));
                set = true;
            }
        }

    }
    public Player getPlayer() {
        return player;
    }
    public void setPlayer(Player player) {
        this.player = player;
    }
    public Maze getMaze() {
        return maze;
    }
    public void setMaze(Maze maze) {
        this.maze = maze;
    }
    public void handle(KeyEvent e){
        KeyCode code = e.getCode();
        switch (code){
            case W:
                player.move(0,-1);
                break;
            case A:
                player.move(-1,0);
                break;
            case S:
                player.move(0,1);
                break;
            case D:
                player.move(1,0);
                break;
        }
    }

}
