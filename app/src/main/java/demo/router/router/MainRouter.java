package demo.router.router;

/**
 * For each custom router, create a class that extends Router.
 * Override the setRouterEndpoints() method and call the addRouterEndpoint() method,
 * passing in the .fxml endpoint as a String.
 * <p>
 * The addRouterEndpoint() method will add the endpoint to Router.endpoints ArrayList,
 * and register the endpoint in the Router.registry map.
 * <p>
 * For example: The MainRouter class will have 2 endpoints:
 * <p>
 *   1. /Hello.fxml
 *   2. /World.fxml
 */
public class MainRouter extends Router {
    @Override
    public void setRouterEndpoints() {
        addRouterEndpoint("/Hello.fxml");
        addRouterEndpoint("/World.fxml");
    }
}
