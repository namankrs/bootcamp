package refreshcomponent;

public class Main {
    public static void main(String[] args) {
        Body body = new Body();
        SidePanel sidePanel = new SidePanel();
        BottomPanel bottomPanel = new BottomPanel();
        Content content = new Content();
        Image image = new Image();
        Text text = new Text();
        body.add(sidePanel);
        body.add(content);
        body.add(bottomPanel);
        content.add(image);
        content.add(text);
        body.refresh();
        sidePanel.refresh();
    }
}
