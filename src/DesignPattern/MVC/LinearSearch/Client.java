package DesignPattern.MVC.LinearSearch;

import javafx.application.Application;

public class Client {

    public static void main(String[] args){
        View view = new View();
        Model model = new Model();
        Controller controller = new Controller(view, model);

        Application.launch(view.getClass(), args);
    }
}
