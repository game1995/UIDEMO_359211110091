package dbutil;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class dbConnection {
    private static final String SQCON = "jdbc:school.sqlite";

    public static Connection getConnection(){
        try {
            Class.forName("org.sqlite.JDBC");
            return DriverManager.getConnection(SQCON);
        }catch (ClassNotFoundException ex){
                ex.printStacktrace();
        }
         return null;
        }


    }
}
