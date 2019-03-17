package pattern.behavioral.pipeline;

public class ToUpperProcessor implements StringProcessor {
    @Override
    public String execute(String input) {
        return input.toUpperCase();
    }
}
