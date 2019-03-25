package refreshcomponent;

public class Image extends Component {
    @Override
    public void refresh() {
        System.out.println("Image is refreshing");
        this.components.forEach(Component::refresh);
    }
}

