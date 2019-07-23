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
public  class Porteria extends Lugar  {

	private String dirección;
	private String tipo;
	
	
	public Porteria(String nombre, String ubicacion, String dirección, String tipo) {
        this.dirección = dirección;
        this.tipo = tipo;
       
        this.setNombre(nombre);
        this.setUbicación(ubicacion);
    }
	@Override
    public String toString() {
        String printMuseo = "Nombre: " + this.getNombre()+ "\n"+ "Ubicacion: " + this.getUbicación() + 
                "\n"+ "Direccion: " + this.getDirección()+ "\n"+ "tipo: " + this.getTipo()+ 
                "\n";
         
        
        return printMuseo; 
    }
    
	public String getDirección() {
		return dirección;
	}

	public void setDirección(String dirección) {
		this.dirección = dirección;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	



	@Override
	public boolean abierto() {
		// TODO Auto-generated method stub
		return false;
	}
	
}