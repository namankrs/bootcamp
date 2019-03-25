package refreshcomponent;

public class Content extends Component {
    @Override
    public void refresh() {
        System.out.println("Content is refreshing");
        this.components.forEach(Component::refresh);
    }
}

