/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

public class ZonaComún extends Lugar{
	

        
        public ZonaComún(String nombre, String ubicacion) {
      
        this.setNombre(nombre);
        this.setUbicación(ubicacion);
       
    }
        @Override
    public String toString() {
        String printMuseo = "Nombre: " + this.getNombre()+ "\n"+ "Ubicación: " + this.getUbicación() + 
                "\n";
        return printMuseo; 
    }
	

	@Override
	public boolean abierto() {
		// TODO Auto-generated method stub
		return false;
	}


	
	
}
