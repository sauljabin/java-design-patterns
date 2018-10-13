package pattern.behavioral.pipeline;

public class RemoveSpecialCharProcessor implements StringProcessor {
    @Override
    public String execute(String input) {
	return input.replaceAll("[^a-zA-Z0-9 ]+", "");
    }
}
