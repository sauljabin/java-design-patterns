package pattern.structural.facade.mysql;

import pattern.structural.facade.DriverManager;
import pattern.structural.facade.Connection;
import pattern.structural.facade.JDBCDriver;

public class MySQLJDBCDriver implements JDBCDriver {

    /**
     * Registra el driver en el DriverManager de la Facade.
     */
    static {
        DriverManager.registerDriver(new MySQLJDBCDriver());
    }

    @Override
    public Connection getConnection() {
        return new MySQLConnection();
    }

    @Override
    public String getDBVendor() {
        return "mysql";
    }
}
