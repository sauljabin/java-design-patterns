package pattern.structural.facade.mysql;

import pattern.structural.facade.Connection;
import pattern.structural.facade.Statement;

public class MySQLConnection implements Connection {

    @Override
    public Statement createStatement() {
        return new MySQLStatement();
    }

}
