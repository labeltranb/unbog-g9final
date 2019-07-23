/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.Date;

/**
 *
 * @author Lau
 */
public class Cursos extends Actividad {
  
	private String diaSemana;
	private long código;
	
	 public Cursos(String tipoActivdad,String horario ,String nombre,String diaSemana, long codigo) {
        this.diaSemana = diaSemana;
        this.código = codigo;
        this.setHorario(horario);
        this.setTipoActivdad(tipoActivdad);
        this.setNombre(nombre);
    }
@Override
    public String toString() {
       String printCursos = "Nombre: " + this.getNombre()+ "\n" +
               "Tipo de Actividad: " + this.getTipoActivdad()+ "\n"+ "Horario: "
               + this.getHorario()+ 
                "\n"+ "Dias a la semana: " + diaSemana + "\n"+ "Codigo" 
                + this.getCódigo() + "\n";
       
        return printCursos; 
    }

	
	public String getDiaSemana() {
		return diaSemana;
	}

	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}

	public long getCódigo() {
		return código;
	}

	public void setCódigo(long código) {
		this.código = código;
	}

	

	@Override
	public boolean abierto() {
		// TODO Auto-generated method stub
		return false;
	}
}