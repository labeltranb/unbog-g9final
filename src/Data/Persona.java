/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.Serializable;

/**
 *
 * @author Lau
 */
public abstract class Persona implements Serializable{
	 protected String nombre;
	 protected String apellido;
	 protected int cédula;
	 protected String correo;
	 protected String contraseña;
	 protected String usuario;
	 
	 public void VerActividad(Actividad act) {
	
		 
	 }
	 public void VerLugar(Actividad act) {
	
		 
	 }
	 
	 
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getCédula() {
		return cédula;
	}
	public void setCédula(int cédula) {
		this.cédula = cédula;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	 
	 
}

