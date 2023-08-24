package demo.router.controllers;

import demo.router.router.RouterButton;
import javafx.fxml.FXML;

public class HelloController {

    @FXML
    private RouterButton btnToWorld;

    @FXML
    public void toWorld() {
        this.btnToWorld.route("/World.fxml");
    }
}
