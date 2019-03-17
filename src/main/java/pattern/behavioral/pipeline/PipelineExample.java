package pattern.behavioral.pipeline;

public class PipelineExample {
    public static void main(String[] args) {
        StringProcessorHandler stringProcessorHandler = new StringProcessorHandler();

        String processedString = stringProcessorHandler.add(new RemoveSpecialCharProcessor())
                .add(new ToUpperProcessor()).execute("This$ is an uncl@ean+ed phr#aSe");

        System.out.println(processedString); // Salida: THIS IS AN UNCLEANED PHRASE
    }
}
