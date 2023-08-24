package demo.router.router;

import javafx.scene.Node;
import javafx.scene.control.Button;

import java.util.function.Function;

public class RouterButton extends Button {
    public void route(String endpoint) {
        Function<Void, Void> callback = Router.registry.get(endpoint);
        if (callback != null) {
            callback.apply(null);
        }
    }
}