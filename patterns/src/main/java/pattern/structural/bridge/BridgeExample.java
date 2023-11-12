package pattern.structural.bridge;

public class BridgeExample {
    public static void main(String[] args) {
        InfoLogger infoLogger = new InfoLogger(new TerminalLoggerOutput());
        infoLogger.log("message"); // Salida: INFO: message

        ErrorLogger errorLogger = new ErrorLogger(new FileLoggerOutput("error.log"));
        errorLogger.log("message"); // Salida: File: error.log ERROR: message
    }
}
