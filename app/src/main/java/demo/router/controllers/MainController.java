package demo.router.controllers;

import demo.router.router.MainRouter;
import demo.router.router.RouterButton;
import javafx.fxml.FXML;

public class MainController {
    @FXML
    private MainRouter mainRouter;

    @FXML
    private RouterButton btnToHello;

    /**
     * There are 2 ways of routing to a specific .fxml endpoint:
     * <p>
     * 1. Using Router Instance
     *   Inject the Router instance (e.g. MainRouter) into the controller
     *   and call the route() method on the instance.
     * <p>
     * 2. Using RouterButton/RouterLink/etc.
     *   Inject the RouterButton instance into the controller
     *   and call the route() method on the instance.
     *   <p>
     *   The route() method will call the callback Router.route() method,
     *   registered in the Router.registry map.
     *   <p>
     *   This is the preferred method.
     */
    @FXML
    public void toWorld() {
        this.mainRouter.route("/World.fxml");
    }

    @FXML
    public void toHello() { this.btnToHello.route("/Hello.fxml"); }
}
