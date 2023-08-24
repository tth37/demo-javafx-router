package demo.router.router;


import javafx.collections.ObservableMap;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.util.ArrayList;

public abstract class Router extends AnchorPane {

    ArrayList<String> endpoints;

    public Router() {
        this.endpoints = new ArrayList<String>();
        this.setRouterEndpoints();

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(this.endpoints.get(0)));
        try {
            this.getChildren().add(loader.load());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public boolean contains(String endpoint) {
        return this.endpoints.contains(endpoint);
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

}