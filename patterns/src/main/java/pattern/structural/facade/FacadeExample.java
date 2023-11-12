package pattern.structural.facade;

/**
 * El cliente no necesita saber nada sobre la implementación del subsistema,
 * excepto la inicialización de la clase controladora para la base de datos requerida.
 * El cliente simplemente interactúa con las interfaces de la fachada en lugar de clases
 * específicas de la base de datos.
 * DriverManager actúa como una fachada para el subsistema subyacente.
 * <p>
 * Entre los ejemplos más conocidos tenemos JDBC y SLF4J.
 */
public class FacadeExample {

    public static void main(String[] args) throws Exception {
        Class.forName("pattern.structural.facade.oracle.OracleJDBCDriver");
        Connection connection = DriverManager.getConnection("oracle");
        Statement statement = connection.createStatement();
        statement.executeQuery("select * from employee");

        Class.forName("pattern.structural.facade.mysql.MySQLJDBCDriver");
        connection = DriverManager.getConnection("mysql");
        statement = connection.createStatement();
        statement.executeQuery("select * from employee");
    }

}
