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
public class Auditorio extends Edificio{
	
	private  int capacidad;

	public Auditorio(String nombre, String ubicacion, int capacidad, int baños, String codigo) {
        this.capacidad = capacidad;
        this.setNombre(nombre);
        this.setUbicación(ubicacion);
        this.setBaños(baños);
        this.setCódigo(codigo);
    }

 @Override
    public String toString() {
        String printAuditorio = "Nombre: " + this.getNombre()+ "\n"+ "Ubicacion: " + this.getUbicación() + 
                "\n"+ "Capacidad: " + this.getCapacidad()+ "\n"+ 
                "Numero de Baños: " + this.getBaños() + "\n" + "Codigo: " 
                + this.getCódigo() + "\n";
        return printAuditorio; 
    }



	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public boolean abierto() {
		// TODO Auto-generated method stub
		return false;
	}
}
