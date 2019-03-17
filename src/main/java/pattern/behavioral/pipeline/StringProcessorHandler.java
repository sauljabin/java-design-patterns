package pattern.behavioral.pipeline;

import java.util.LinkedList;
import java.util.List;

/**
 * Clase principal que controla el pipeline. Primero agrega todos los Stage con
 * add, luego ejecuta en orden (como fueron agregados) los Stage con execute. La
 * salida de un Stage es la entrada del siguiente.
 */
public class StringProcessorHandler {
    private List<StringProcessor> stringProcessors;

    public StringProcessorHandler() {
        this.stringProcessors = new LinkedList<>();
    }

    public StringProcessorHandler add(StringProcessor stringProcessor) {
        stringProcessors.add(stringProcessor);
        return this;
    }

    public String execute(String stringToProcess) {
        for (StringProcessor stringProcessor : stringProcessors) {
            stringToProcess = stringProcessor.execute(stringToProcess);
        }
        return stringToProcess;
    }
}
