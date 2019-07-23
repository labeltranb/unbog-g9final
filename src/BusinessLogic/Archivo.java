
package BusinessLogic;

import Data.Actividad;
import Data.Edificio;
import Data.Lugar;
import Data.Usuario;
import java.io.*;
import java.util.ArrayList;
 
public class Archivo implements Serializable {
	
    public  static void Escribir(ArrayList<Usuario> listaUsers) throws IOException, ClassNotFoundException{
       File datos= new File("lista");
       FileOutputStream OutDatos = new FileOutputStream (datos);
       ObjectOutputStream ObjDatos = new ObjectOutputStream(OutDatos);
       ObjDatos.writeObject(listaUsers);
       ObjDatos.close();
    }
  	
    public  static ArrayList<Usuario> Leer() throws IOException, ClassNotFoundException{
       File datos= new File("lista");
       FileInputStream InDatos = new FileInputStream (datos);
       ObjectInputStream ObjDatos = new ObjectInputStream(InDatos);
       ArrayList<Usuario> Usuario=( ArrayList<Usuario>)ObjDatos.readObject();
       ObjDatos.close();
       
       return Usuario;
    }
    
    public static void EscribirLugar(Lugar lugar) throws FileNotFoundException, IOException
    {
        File datos= new File("listaEdificios");
        FileOutputStream OutDatos = new FileOutputStream (datos);
        ObjectOutputStream ObjDatos = new ObjectOutputStream(OutDatos);
        ObjDatos.writeObject(lugar);
        ObjDatos.close();       
    }
    
    public  static FileInputStream LeerLugar() throws IOException, ClassNotFoundException
    {
       File datos= new File("listaEdificios");
       FileInputStream InDatos = new FileInputStream (datos);
             
       return InDatos;
    }
     
    public static ByteArrayOutputStream EscribirActividades(ArrayList<Actividad> listaActividad) throws FileNotFoundException, IOException
    {   
        ByteArrayOutputStream byteArray = new ByteArrayOutputStream();
        ObjectOutputStream ObjDatos = new ObjectOutputStream(byteArray);
        ObjDatos.writeObject(listaActividad);
        
        return byteArray;
    }
    
    public  static ArrayList<Actividad> LeerActividad() throws IOException, ClassNotFoundException
    {
        File datos= new File("listaActividades");
       FileInputStream InDatos = new FileInputStream (datos);
       ObjectInputStream ObjDatos = new ObjectInputStream(InDatos);
       ArrayList<Actividad> actividad=( ArrayList<Actividad>)ObjDatos.readObject();
       ObjDatos.close();
       
       return actividad;
    }
}