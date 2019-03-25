package refreshcomponent;

public class BottomPanel extends Component {

    @Override
    public void refresh() {
        System.out.println("Bottom Panel is refreshing");
        this.components.forEach(Component::refresh);
    }

}
