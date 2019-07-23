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
    public abstract class Edificio extends Lugar {

	private String código;
	private int baños;
	
	
	public String getCódigo() {
		return código;
	}
	public void setCódigo(String código) {
		this.código = código;
	}
	public int getBaños() {
		return baños;
	}
	public void setBaños(int baños) {
		this.baños = baños;
	}
	
	
}


