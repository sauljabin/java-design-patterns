package pattern.structural.facade;

import java.util.HashMap;
import java.util.Map;

/**
 * Facade. Proporciona acceso a la funcionalidad particular del subsistema.
 */
public class DriverManager {

    private static Map<String, JDBCDriver> driverMap = new HashMap<>();

    private DriverManager() {
    }

    public static void registerDriver(JDBCDriver driver) {
        driverMap.put(driver.getDBVendor(), driver);
    }

    public static Connection getConnection(String database) {
        if (driverMap.containsKey(database)) {
            return driverMap.get(database).getConnection();
        }
        throw new IllegalArgumentException("No driver found for database: " + database);
    }
}
