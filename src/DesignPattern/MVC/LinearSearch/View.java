package DesignPattern.MVC.LinearSearch;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class View extends Application {

    private static Controller controller;

    @Override
    public void start(Stage stage) {
        stage.setTitle("Bar Chart Sample");
        Pane pane = new StackPane();
        GridPane gPane = new GridPane();

        for(int i = 1; i <= 10; i++){
            Rectangle rect = new Rectangle(50, 50, Color.LIGHTGRAY);
            Label num = new Label("50");
            rect.setStroke(Color.GRAY);
            gPane.add(rect, i, 0);
            gPane.add(num, i, 0);
        }
        gPane.setAlignment(Pos.CENTER);
        pane.getChildren().add(gPane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    static void setController(Controller controller){
        View.controller = controller;
    }


}
