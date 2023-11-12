package pattern.structural.facade.mysql;


import pattern.structural.facade.Statement;

public class MySQLStatement implements Statement {

    @Override
    public void executeQuery(String query) {
        System.out.println("MySQL JDBC driver executing query : " + query);
    }

}
