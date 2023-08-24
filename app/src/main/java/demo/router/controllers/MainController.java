package demo.router.controllers;

import demo.router.router.MainRouter;
import demo.router.router.Router;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class MainController {
    @FXML
    private MainRouter mainRouter;

    @FXML
    public void toWorld() {
        this.mainRouter.route("/World.fxml");
    }

    @FXML
    public void toHello() {
        this.mainRouter.route("/Hello.fxml");
    }
}
