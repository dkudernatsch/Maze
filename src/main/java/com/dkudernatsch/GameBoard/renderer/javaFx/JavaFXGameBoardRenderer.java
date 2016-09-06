package com.dkudernatsch.GameBoard.renderer.javaFx;

import com.dkudernatsch.GameBoard.GameBoard;
import com.dkudernatsch.GameBoard.GameBoardRenderer;

/**
 * Created by dkude on 21/08/2016.
 */
public class JavaFXGameBoardRenderer implements GameBoardRenderer{

    public JavaFXGameBoardRenderer(){
        JavaFXGameBoardApplication.launch(JavaFXGameBoardApplication.class);
    }


    @Override
    public void render(GameBoard gameBoard) {

    }
}
