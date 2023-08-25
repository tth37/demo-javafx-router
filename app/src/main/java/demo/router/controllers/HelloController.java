package demo.router.controllers;

import demo.router.router.Router;
import javafx.fxml.FXML;

public class HelloController {


    @FXML
    public void toWorld() {
        Router.route("/World.fxml");
    }
}
