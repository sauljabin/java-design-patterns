package pattern.structural.facade.oracle;

import pattern.structural.facade.Connection;
import pattern.structural.facade.Statement;

public class OracleConnection implements Connection {

    @Override
    public Statement createStatement() {
        return new OracleStatement();
    }

}
