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

public class Eventos extends Actividad {

	private String fecha;
	
public Eventos(String fecha, String tipoActivdad,String horario ,String nombre) {
        this.fecha = fecha;
        this.setTipoActivdad(tipoActivdad);
        this.setHorario(horario);
        this.setNombre(nombre);
        
    }
@Override
    public String toString() {
      
   String printEvento = "Nombre: " + this.getNombre()+ "\n" +"Tipo de Actividad: " 
           + this.getTipoActivdad()+ "\n"+ "Horario: " + this.getHorario()+ 
                "\n"+ "Dias a la semana: " + this.getFecha() + "\n";
        return printEvento; 
    }
	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public boolean abierto() {
		// TODO Auto-generated method stub
		return false;
	}

}