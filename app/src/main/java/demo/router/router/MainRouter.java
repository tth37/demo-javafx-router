package demo.router.router;

import java.util.ArrayList;

public class MainRouter extends Router {
    @Override
    public void setRouterEndpoints() {
        this.endpoints.add("/Hello.fxml");
        this.endpoints.add("/World.fxml");
    }
}
