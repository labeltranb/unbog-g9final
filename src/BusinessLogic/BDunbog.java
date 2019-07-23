

package BusinessLogic;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class BDunbog 
{
    public Connection CrearBD()
    {
        Connection con;
        String barra = File.separator;
        String unbogBD= System.getProperty("user.dir")+barra+"src"+barra+
                "Data"+barra+"registros";
        File url =  new File(unbogBD);                

        if(url.exists())
        {
            System.out.println("BD ya existe");
        }else
        {
            try {
                Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
                String db = "jdbc:derby:"+unbogBD+";create=true";
                con = DriverManager.getConnection(db);
                
                String tabla = "CREATE TABLE Usuarios("
                             + " id INT NOT NULL, "
                             + " Nombre VARCHAR(50) NOT NULL,"     
                             + " Apellidos VARCHAR(50) NOT NULL, "
                             + " Usuario VARCHAR(30) NOT NULL,"
                             + " Programa VARCHAR(50) NOT NULL, "
                             + " Correo VARCHAR(50) PRIMARY KEY,"
                             + " Contraseña VARCHAR(20) NOT NULL,"
                             + " Edificio BLOB(16K),"
                             + " Actividades BLOB(16K))";
                
                PreparedStatement ps = con.prepareStatement(tabla);
                
                ps.execute();
                ps.close();
                
                System.out.println("BD creada");
                
            } catch (ClassNotFoundException | SQLException ex) {
                System.out.println("Error: crear"+ex);
            }
        }
        return null;
    }
    
    public Connection conectarBD()
    {
        Connection con;
        String barra = File.separator;
        
        String unbogBD  = System.getProperty("user.dir")+barra+"src"+barra+
                "Data"+barra+"registros";
        
        try 
        {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            
            String db = "jdbc:derby:"+unbogBD;
            con=DriverManager.getConnection(db);
            
            System.out.println("BD cargada");
            return con;
        } catch (ClassNotFoundException | SQLException ex) 
        {
            System.out.println("ERROR: " + ex);
        }    
        return null;
    }
    
}
