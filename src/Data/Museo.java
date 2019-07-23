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
public class Museo extends Edificio{

	private String temática;
	private String exposición;
	
	
	public Museo(String nombre, String ubicacion, String tematica, String exposiciÛn, int baños, String codigo) {
        this.temática = tematica;
        this.exposición = exposiciÛn;
        this.setNombre(nombre);
        this.setUbicación(ubicacion);
        this.setBaños(baños);
        this.setCódigo(codigo);
    }
        @Override
    public String toString() {
       String printMuseo = "Nombre: " + this.getNombre()+ "\n"+ "Ubicacion: " + this.getUbicación() + 
                "\n"+ "Tematica: " + this.getTemática() + "\n"+ "Exposición: " + this.getExposición()+ "\n"+
                "Numero de Baños: " + this.getBaños() + "\n" + "Codigo: " 
                + this.getCódigo() + "\n";
        return printMuseo; 
    }
	
	public String getTemática() {
		return temática;
	}
	public void setTemática(String temática) {
		this.temática = temática;
	}
	public String getExposición() {
		return exposición;
	}
	public void setExposición(String exposición) {
		this.exposición = exposición;
	}
	
	@Override
	public boolean abierto() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
