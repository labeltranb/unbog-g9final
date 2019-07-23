
package Data;

import java.io.Serializable;

public abstract class Lugar implements Universidad,Serializable{
	private String nombre;
	private String ubicación;
	private String imagen;

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicación() {
		return ubicación;
	}
	public void setUbicación(String ubicación) {
		this.ubicación = ubicación;
	}
	
	
}
