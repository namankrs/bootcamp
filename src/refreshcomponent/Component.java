package refreshcomponent;

import java.util.ArrayList;
import java.util.List;

abstract class Component {
    protected List<Component> components = new ArrayList<>();

    void refresh() {
    }

    void add(Component component) {
        this.components.add(component);
    }
}
