package refreshcomponent;

public class Body extends Component {

    @Override
    public void refresh() {
        System.out.println("Body is refreshing");
        components.forEach(Component::refresh);
    }
}
