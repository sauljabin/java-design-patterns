package pattern.behavioral.observer;

public class Observer {
    public static void main(String[] args) {
        Button button = new Button();
        button.addListener(new SaveFileListener());
        button.addListener(new ShowMessageListener());
        button.click();
    }
}
