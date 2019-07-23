/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author Lau
 */
import java.sql.Date;

public abstract class Actividad implements Universidad {
 private String tipoActivdad;
 private String horario;
 private String nombre;
 
 
 
 
public String getTipoActivdad() {
	return tipoActivdad;
}
public void setTipoActivdad(String tipoActivdad) {
	this.tipoActivdad = tipoActivdad;
}
public String getHorario() {
	return horario;
}
public void setHorario(String horario) {
	this.horario = horario;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
 
 
}

