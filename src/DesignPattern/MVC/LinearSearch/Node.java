package DesignPattern.MVC.LinearSearch;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

class Node {

    private Rectangle rectangle;
    private int number;

    Node(int number) {
        this.rectangle = new Rectangle(200, 200, Color.LIGHTGRAY);
        this.number = number;
    }


}
