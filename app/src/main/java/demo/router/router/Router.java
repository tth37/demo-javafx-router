package demo.router.router;


import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public abstract class Router extends AnchorPane {

    static Map<String, Function<Void, Void>> registry = new HashMap<>();

    private final ArrayList<String> endpoints;

    private static void register(String endpoint, Function<Void, Void> callback) {
        System.out.println("Registering " + endpoint);
        Router.registry.put(endpoint, callback);
    }

    public Router() {
        this.endpoints = new ArrayList<>();
        this.setRouterEndpoints();

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(this.endpoints.get(0)));
        try {
            this.getChildren().add(loader.load());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void route(String endpoint) {
        if (this.endpoints.contains(endpoint)) {
            this.getChildren().clear();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource(endpoint));
            try {
                this.getChildren().add(loader.load());
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public abstract void setRouterEndpoints();

    public void addRouterEndpoint(String endpoint) {
        this.endpoints.add(endpoint);
        register(endpoint, (Void) -> {
            this.route(endpoint);
            return null;
        });
    }

}