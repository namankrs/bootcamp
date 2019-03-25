package refreshcomponent;

public class Text extends Component {

    @Override
    public void refresh() {
        System.out.println("Text is refreshing");
        this.components.forEach(Component::refresh);
    }

}

