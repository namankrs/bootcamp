package refreshcomponent;

public class SidePanel extends Component {
    @Override
    public void refresh() {
        System.out.println("Side Panel is refreshing");
        this.components.forEach(Component::refresh);
    }

}
