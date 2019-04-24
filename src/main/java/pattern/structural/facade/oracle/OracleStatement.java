package pattern.structural.facade.oracle;

import pattern.structural.facade.Statement;

public class OracleStatement implements Statement {

    @Override
    public void executeQuery(String query) {
        System.out.println("Oracle JDBC driver executing query : " + query);
    }

}
