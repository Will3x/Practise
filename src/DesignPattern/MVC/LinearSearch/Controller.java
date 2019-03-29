package DesignPattern.MVC.LinearSearch;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

class Controller implements EventHandler<ActionEvent> {

    private View view;
    private Model model;

    Controller(View view, Model model) {
        this.view = view;
        this.model = model;

        View.setController(this);
        model.setController(this);
    }

    @Override
    public void handle(ActionEvent event) {
        System.out.println("hey!");
    }
}
