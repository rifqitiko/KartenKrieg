package Game;

import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class Connect {
    private static Connection Connect;
    
    public static Connection GetConnection()throws SQLException{
        if (Connect==null){
            new Driver();
            
        Connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/kartenkrieg","root","");
        
        }
        return Connect;
    } 
}
