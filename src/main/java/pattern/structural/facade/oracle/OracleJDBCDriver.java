package pattern.structural.facade.oracle;

import pattern.structural.facade.DriverManager;
import pattern.structural.facade.Connection;
import pattern.structural.facade.JDBCDriver;

public class OracleJDBCDriver implements JDBCDriver {

    /**
     * Registra el driver en el DriverManager de la Facade.
     */
    static {
        DriverManager.registerDriver(new OracleJDBCDriver());
    }

    @Override
    public Connection getConnection() {
        return new OracleConnection();
    }

    @Override
    public String getDBVendor() {
        return "oracle";
    }
}
