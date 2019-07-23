/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;
public class ZonaDeComida extends Lugar {
	
	private String tipoComida;
 public ZonaDeComida(String nombre, String ubicacion, String tipoComida) {
        this.tipoComida = tipoComida;
        this.setNombre(nombre);
        this.setUbicación(ubicacion);
        
    }
 @Override
    public String toString() {
       String printMuseo = "Nombre: " + this.getNombre()+ "\n"+ "Ubicacion: " + this.getUbicación() + 
                "\n"+ "Tipo de Comida: " + this.getTipoComida()+ "\n";
        return printMuseo; 
    }
	
	public String getTipoComida() {
		return tipoComida;
	}

	public void setTipoComida(String tipoComida) {
		this.tipoComida = tipoComida;
	}

	@Override
	public boolean abierto() {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	
}

