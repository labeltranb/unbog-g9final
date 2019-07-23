
package Data;
public class Biblioteca extends Edificio{

	private String secciones;

    public Biblioteca(String nombre, String ubicacion, String secciones, int baños, String codigo) {
        this.secciones = secciones;
        this.setBaños(baños);
        this.setCódigo(codigo);
        this.setNombre(nombre);
        this.setUbicación(ubicacion);
    }
@Override
    public String toString() {
        String printBiblioteca = "Nombre" + this.getNombre()+ "\n"+ "Ubicacion: " + this.getUbicación() + 
                "\n"+ "Secciones" + secciones + "\n"+
                "Numero de Baños" + this.getBaños() + "\n" + "Codigo" 
                + this.getCódigo() + "\n";
        return printBiblioteca; 
    }

        
        

	public String getSecciones() {
		return secciones;
	}

	public void setSecciones(String secciones) {
		this.secciones = secciones;
	}


	@Override
	public boolean abierto() {
		// TODO Auto-generated method stub
		return false;
	}

}
