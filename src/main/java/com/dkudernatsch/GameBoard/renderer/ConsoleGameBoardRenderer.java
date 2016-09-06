package com.dkudernatsch.GameBoard.renderer;

import com.dkudernatsch.GameBoard.GameBoard;
import com.dkudernatsch.GameBoard.GameBoardRenderer;

/**
 * Created by dkude on 20/08/2016.
 */
public class ConsoleGameBoardRenderer implements GameBoardRenderer {


    @Override
    public void render(GameBoard gameBoard) {
        int xPlayerPos = gameBoard.getPlayer().getPosX();
        int yPlayerPos = gameBoard.getPlayer().getPosY();

        int xSize = gameBoard.getMaze().getXSize();
        int ySize = gameBoard.getMaze().getYSize();

        String s = "";
        for(int y = 0; y < ySize; y++){
            s+= "\n";
            for(int x = 0; x < xSize; x++){
                if(x == xPlayerPos && y == yPlayerPos){
                    s+= gameBoard.getPlayer();
                }else {
                    s+= gameBoard.getMaze().getAtPos(x, y);
                }
            }
        }
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println(s);
    }

}
