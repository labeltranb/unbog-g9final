
package BusinessLogic;

import Data.Actividad;
import Data.Edificio;
import Data.Lugar;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControlBD 
{
    BDunbog conexion = new BDunbog();
    Connection conex2 = conexion.conectarBD();
    
public void completarRegistro(String id, String nombre, String apellido,
                            String nombreUsuario, String programa, String correo,
                            String contraseña)
{
    if(conex2!= null)
    {
        try 
        {
                             
            Statement orden = conex2.createStatement();
             
            String crear = "INSERT INTO Usuarios "
                    + "(id, Nombre, Apellidos, Usuario, Programa, Correo, Contraseña)"
                    + " VALUES ( "+id+" ,'"+nombre+"'"
                    + ",'"+apellido+"','"+nombreUsuario+"'"
                    + ",'"+programa+"','"+correo+"','"+contraseña+"')";
            
            orden.executeUpdate(crear);

            System.out.println("registro creado");

        } catch (SQLException ex) {
            System.out.println("Error en controlBD: "+ ex);
          
        }

    }
}  


public void guardarEdificios(String usuario,Lugar lugar) throws ClassNotFoundException
{
    if(conex2 != null)
    {
        FileInputStream InDatos= null;
        PreparedStatement orden= null;
        try
        {
            ObjectInput oos=null;
            String insertar = "UPDATE Usuarios SET Edificio = (?) WHERE Usuario = '"+usuario+"'";
            orden = conex2.prepareStatement(insertar);
            
            Archivo.EscribirLugar(lugar);
            InDatos=Archivo.LeerLugar();
            
            orden.setBinaryStream(1, InDatos);
            orden.executeUpdate();
            System.out.println("Edificio guardado");
            
        } catch (IOException | SQLException ex) 
        {
            System.out.println("ERROR AL GUARDAR");
        }finally
        {
            try {
                orden.close();
                InDatos.close();
            } catch (IOException | SQLException ex) {
                
            }
        }
        
    }
}

public ArrayList<Lugar> mostrarEdificios (String usuario) throws ClassNotFoundException
{
        try 
        {
            InputStream input = null;
            Statement orden = conex2.createStatement();
            String editar = "SELECT Edificio FROM Usuarios WHERE Usuario='"+usuario+"'";
            
            ResultSet r = orden.executeQuery(editar);
            
            File datos= new File("listaEdificios");
            FileOutputStream OutDatos = new FileOutputStream (datos);
          
            if(r.next())
            {
                input = (FileInputStream)r.getBinaryStream("Edificio");
                ObjectInputStream ois = new ObjectInputStream(input);
                ArrayList<Lugar> lugar =(ArrayList<Lugar>) ois.readObject();
                ois.close();
                
                return lugar;
              
            }            
         
        } catch (IOException | SQLException ex) 
        {
            Logger.getLogger(ControlBD.class.getName()).log(Level.SEVERE, null, ex);
          
        }
         System.out.println("no hay edificios");
        return new ArrayList<Lugar> ();
}

public void guardarActividades(String usuario, ArrayList<Actividad> listaActividades) throws ClassNotFoundException
{
    if(conex2 != null)
    {
        FileInputStream InDatos=null;
        PreparedStatement orden= null;
        try
        {
            String insertar = "UPDATE Usuarios SET Actividades = (?) WHERE Usuario = '"+usuario+"'";
            orden = conex2.prepareStatement(insertar);

            Archivo.EscribirActividades(listaActividades);
            InDatos=Archivo.LeerLugar();

            orden.setBinaryStream(1, InDatos);
            orden.executeUpdate();
        } catch (IOException | SQLException ex) 
        {
            System.out.println("ERROR AL GUARDAR");
        }finally
        {
            try {
                orden.close();
                InDatos.close();
            } catch (IOException | SQLException ex) {

            }
        }

    }
}

public void mostrarActividad(String usuario)
{
    try 
    {
        InputStream input = null;
        Statement orden = conex2.createStatement();
        String editar = "SELECT Edificios FROM Usuarios WHERE Usuario='"+usuario+"'";

        ResultSet r = orden.executeQuery(editar);

       if(r.next())
        {
            input = r.getBinaryStream("Edificios");
        }            

    } catch ( SQLException ex) 
    {
        
    }
}

public String mostrarDatos(int opcion,String nombreUsuario) 
{      
    if(conex2 != null)
    {
        try
        {
            Statement orden = conex2.createStatement();
            ResultSet r = orden.executeQuery("SELECT* FROM Usuarios WHERE Usuario='"+nombreUsuario+"'");
            switch(opcion)
            {
                case 1:
                    if(r.next())
                    {
                       
                        String nombre = r.getString("Nombre");
                         System.out.println(nombre);
                        return nombre;
                    }
                    r.close();
                    orden.close();
                    break;
                case 2:
                    if(r.next())
                    {
                        String apellido = r.getString("Apellidos");
                        return apellido;
                    }
                    r.close();
                    orden.close();
                    break;
                case 3:
                    if(r.next())
                    {
                        String correo = r.getString("Correo");
                        return correo;
                    }
                    r.close();
                    orden.close();
                    break;
                case 4:
                    if(r.next())
                    {
                        String programa = r.getString("Programa");
                        return programa;
                    }
                    r.close();
                    orden.close();
                    break;
                case 5:
                    if(r.next())
                    {
                        String contraseña = r.getString("Contraseña");
                        return contraseña;
                    }
                    r.close();
                    orden.close();
                    break;
                case 6:
                    if(r.next())
                    {
                        String id = r.getString("id");
                        return id;
                    }
                    r.close();
                    orden.close();
                    break;
            }
        }catch(SQLException ex)
        {
            System.out.println("Error: " + ex);
        }

    }
    return null;
}

public void modificarDatos(String nombre,String apellido,String id,String programa,String contraseña)
{       
    if(conex2 != null)
    {
        try 
        {
    
        Statement orden = conex2.createStatement();
        String editar = "UPDATE Usuarios SET Nombre = '"+nombre+"',"
                        + " Apellidos = '"+apellido+"', "
                        + " id = "+id+", Programa = '"+programa+"',"
                        + " Contraseña = '"+contraseña+"' WHERE id="+id;
            orden.executeUpdate(editar);
            orden.close();  // CIERRE NECESARIO PARA EVITAR BLOQUEO DE LA APP
        } catch (SQLException ex) {
            System.out.println("ERROR: " +ex);
        }
    }
}

public void eliminarRegistro(String nombreUsuario)
{
    try
    {
        Statement orden = conex2.createStatement();
        String eliminar = "DELETE FROM Usuarios WHERE Usuario = "+nombreUsuario;
        orden.executeUpdate(eliminar);
        orden.close();
    }catch(SQLException ex)
    {
        System.out.println("Error: "+ex);
    }
}

}


/*
*****************************************
METODO ALTERNO LEER DESDE BD
*****************************************
while(r.next)
{
    Blob blob= r.getBlob("objeto");
    
    //reconstruccion de objeto por objectoutputstream

    ObjectInputStream ois= new ObjectInputStream(blob.getBinaryStream());
    ArrayList<Lugar> listaLugar= (ArrayList<Lugar>) ois.readObject();
}
    

*****************************************
METODO ALTERNO GUARDAR EN BD 
*****************************************
ByteArrayOutputStream byteArray = new ByteArrayOutputStream();
ObjectOutputStream oos = new ObjectOutputStream(byteArray);
oos.writeObject(ArrayList<Lugar> Lugar);

PreparedStatement ps = conex2.prepareStatement(insertar);

//se inserta en bd

ps.setBytes(1,byteArray.toByteArray());
ps.execute();

*/