package com.dkudernatsch.GameBoard.renderer.javaFx;

import com.dkudernatsch.GameBoard.GameBoard;
import com.dkudernatsch.GameBoard.GameBoardRenderer;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * Created by dkude on 20/08/2016.
 */
public class JavaFXGameBoardApplication extends Application{

    private GameBoard board;
    private GameBoardCanvas canvas;

    public JavaFXGameBoardApplication(){}

    @Override
    public void start(Stage primaryStage) throws Exception {
        board = GameBoard.getBoard();
        primaryStage.setTitle("Maze Game");
        canvas = new GameBoardCanvas(800, 800, board);
        BorderPane pane = new BorderPane();
        pane.setCenter(canvas);
        canvas.widthProperty().bind(pane.widthProperty());
        canvas.heightProperty().bind(pane.heightProperty());
        Scene scene = new Scene(pane);
        scene.setOnKeyPressed(e->board.handle(e));
        primaryStage.setScene(scene);
        render();
        Timeline t = new Timeline(
                new KeyFrame(new Duration(16),event -> render())
        );
        t.setCycleCount(Animation.INDEFINITE);
        t.play();
        primaryStage.setWidth(800);
        primaryStage.setHeight(800);
        primaryStage.show();
    }

    public void render(){
        render(this.board);
    }

    public void render(GameBoard gameBoard) {
        canvas.render();
    }
}
