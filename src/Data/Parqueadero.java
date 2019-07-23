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
public class Parqueadero extends Lugar{
 
	private int cantidad;
	
	
        public Parqueadero(String nombre, String ubicacion, int cantidad) {
        this.cantidad = cantidad;
        this.setNombre(nombre);
        this.setUbicación(ubicacion);
    }
        @Override
    public String toString() {
         String printMuseo = "Nombre: " + this.getNombre()+ "\n"+ "Ubicacion: " + this.getUbicación() + 
                "\n"+ "Cantidad: " + this.getCantidad()+ "\n";
        return printMuseo; 
    }
	
	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public boolean abierto() {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}