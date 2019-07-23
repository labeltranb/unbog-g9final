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
public class EdificioFacultad extends Edificio implements Serializable{

	private int numeroPisos;
	private boolean ascensor;
	
	
	public EdificioFacultad(String nombre,String ubicación, int numeroPisos,
                boolean ascensor, int baños,String código) {
		this.setNombre(nombre);
		this.setUbicación(ubicación);
		this.numeroPisos = numeroPisos;
		this.ascensor = ascensor;
		this.setCódigo(código);
		this.setBaños(baños);
	}

@Override
    public String toString() {
         String ascensor1;
        if (this.ascensor=true){
            ascensor1="Tiene ascensor";
        }else{
            ascensor1= "No tiene ascensor";
        }
        String printEdificio = "Nombre: " + this.getNombre()+ "\n"+ "Ubicacion: " + this.getUbicación() + 
                "\n"+ "Numero de Pisos: " + this.getNumeroPisos() + "\n"+
                "Numero de Baños: " + this.getBaños() + "\n" + "Codigo: " 
                + this.getCódigo() + "\n";
        return printEdificio; 
    }

	public int getNumeroPisos() {
		return numeroPisos;
	}
	public void setNumeroPisos(int numeroPisos) {
		this.numeroPisos = numeroPisos;
	}
	public boolean isAscensor() {
		return ascensor;
	}
	public void setAscensor(boolean ascensor) {
		this.ascensor = ascensor;
	}

	

	@Override
	public boolean abierto() {
		// TODO Auto-generated method stub
		return false;
	}
	

}