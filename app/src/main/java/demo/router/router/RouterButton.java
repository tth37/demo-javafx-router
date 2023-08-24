package demo.router.router;

import javafx.scene.Node;
import javafx.scene.control.Button;

public class RouterButton extends Button {
    public void route(String endpoint) {
        Node node = (Node) this.getParent();
        while (node.getParent() != null) {
            if (node instanceof Router router) {
                if (router.contains(endpoint)) {
                    router.route(endpoint);
                    break;
                }
            }
            node = node.getParent();
        }
    }
}