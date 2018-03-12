package coleccion;

public class Direccion {

	private String calle;
	private int numero;
	private int cp;
	private String provincia;
	
	//Constructores
	public Direccion(String calle, int numero, int cp, String provincia) {
		this.calle = calle;
		this.numero = numero;
		this.cp = cp;
		this.provincia = provincia;
	}
	
	//M�todos
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}

	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	public String toString() {
		return "\nCalle: " + getCalle()	+ "\nN�mero: " + getNumero() + "\nCP: " + getCp()	+ "\nProvincia: " + getProvincia() + "\n";
	}
	
	
}
