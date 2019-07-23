/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

public class ZonaDeRecreación extends Edificio{
	private String tipoDeporte;

  
        
    public ZonaDeRecreación(String nombre, String ubicacion, String tipoDeporte, int baños, String codigo) {
        this.tipoDeporte = tipoDeporte;
        this.setNombre(nombre);
        this.setUbicación(ubicacion);
        this.setBaños(baños);
        this.setCódigo(codigo);
        
    }
@Override
    public String toString() {
        String printZonaRe = "Nombre" + this.getNombre()+ "\n"+ "Ubicacion: " + this.getUbicación() + 
                "\n"+ "Tipos de Deporte" + tipoDeporte + "\n"+
                "Numero de Baños" + this.getBaños() + "\n" + "Codigo" 
                + this.getCódigo() + "\n";
        return printZonaRe; 
    }
    public String getTipoDeporte() {
        return tipoDeporte;
    }

    public void setTipoDeporte(String tipoDeporte) {
        this.tipoDeporte = tipoDeporte;
    }
        
        @Override
	public boolean abierto() {
		// TODO Auto-generated method stub
		return false;
	}
}