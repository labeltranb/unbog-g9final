/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Usuario extends Persona implements Serializable{

    
    
    private String programaAcadémico;
    private ArrayList<Lugar> listaLugares;
    private ArrayList<Actividad> listaActividades;
    

    @Override
    public String toString() {
        return "Nombre: "+nombre +"\n"+" Apellido: " +
                apellido + "\n"+" Usuario: " +
                usuario + "\n" +"Programa Acadéico: "+ programaAcadémico +"\n"+
                        " cédula: " +cédula +"\n" ;
    }

    public ArrayList<Lugar> getListaLugares() {
        return listaLugares;
    }

    public void setListaLugares(ArrayList<Lugar> listaLugares) {
        this.listaLugares = listaLugares;
    }

    public ArrayList<Actividad> getListaActividades() {
        return listaActividades;
    }

    public void setListaActividades(ArrayList<Actividad> listaActividades) {
        this.listaActividades = listaActividades;
    }

    public Usuario(String programaAcadémico, String nombre, String apellido,
            int cédula, String correo, String contraseña, String usuario,
            ArrayList<Actividad> listaActividades, ArrayList<Lugar> listaLugares) {

        this.nombre= nombre;
        this.apellido= apellido;
        this.correo= correo;
        this.contraseña=contraseña;
        this.cédula=cédula;
    
        this.usuario=usuario;
       
        this.listaActividades = listaActividades;
        this.listaLugares = listaLugares;
        this.programaAcadémico = programaAcadémico;
    }

    public Usuario() {
        // TODO Auto-generated constructor stub
    }

    public String crearNombreUsuario(String correo)
    {
        String sSubCadena = "usuario";
        int contador = 0;
        for (int n = 0; n < correo.length(); n++) {
            char c = correo.charAt(n);

            if (c == '@') {
                int i = n;
                String us = correo.substring(0, i);
                contador++;
                sSubCadena = us;
                break;
            }
        }
        System.out.println("Su nombre de usuario será: ");
        super.usuario = sSubCadena;
        System.out.println(super.usuario);
        if (contador != 1) {
            System.out.println("error");
        }
        
        return super.usuario;

    }

    public String getProgramaAcadémico() {
        return programaAcadémico;
    }

    public void setProgramaAcadémico(String programaAcadémico) {
        this.programaAcadémico = programaAcadémico;
    }

    public Usuario modificarUsuario(Usuario usuario) {
        boolean rep = false;
        Scanner reader = new Scanner(System.in);
        while (rep == false) {
            System.out.println("¿Qué desea modificar?");
            System.out.println("Ingrese 1 para modificar su nombre");
            System.out.println("Ingrese 2 para modificar su apellido");
            System.out.println("Ingrese 3 para modificar su contraseña");
            System.out.println("Ingrese 4 para modificar su programa académico");

            System.out.println("Ingrese 5 para salir");
            int num = reader.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Has elegido modificar tu nombre");
                    System.out.println("El nombre actual es: " + usuario.getNombre());
                    System.out.println("Escribe el nombre al cual quieras cambiar");
                    String nombre = reader.next();
                    usuario.setNombre(nombre);
                    System.out.println("El nombre ahora es: " + usuario.getNombre());
                    break;
                case 2:
                    System.out.println("Has elegido modificar tu apellido");
                    System.out.println("El apellido actual es: " + usuario.getApellido());
                    System.out.println("Escribe el apellido al cual quieras cambiar");
                    String apellido = reader.next();
                    usuario.setApellido(apellido);
                    System.out.println("El apellido ahora es: " + usuario.getApellido());
                    break;
                case 3:
                    System.out.println("Has elegido modificar tu contraseña");
                    System.out.println("La contraseña actual es: " + usuario.getContraseña());
                    System.out.println("Escribe la contraseÒa a la cual quieras cambiar");
                    String contraseña = reader.next();
                    usuario.setContraseña(contraseña);
                    System.out.println("La contraseña ahora es: " + usuario.getContraseña());
                    break;

                case 4: System.out.println("Has elegido modificar tu programa académico");
                    System.out.println("El programa actual es: " + usuario.programaAcadémico);
                    System.out.println("Escribe el programa al cual quieras cambiar");
                    String programaAcadémico = reader.next();
                    usuario.setProgramaAcadémico(programaAcadémico);
                    System.out.println("Su programa académico ahora es: " + usuario.getContraseña());
                    break;
                
                case 5:
                    rep = true;
                    break;
                default:
                    System.out.println("Ingreso una opción incorrecta, por favor vuelva a intentar");

            }
        }
       return usuario;

    }

    public void eliminarUsuario(ArrayList<Usuario> lista, Usuario usuario) {
        lista.remove(usuario);
    }
}
