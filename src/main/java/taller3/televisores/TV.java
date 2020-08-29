package taller3.televisores;

public class TV {
	
	Marca marca;
	int canal = 1;
	int precio = 500;
	boolean estado;
	int volumen = 1;
	Control control;
	static int numTV;
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		numTV++;
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public void setControl(Control control) {
		this.control = control;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public void setVolumen(int volumen) {
		if (volumen<8) {
			this.volumen = volumen;
		}
	}
	public void setCanal(int canal) {
		if (canal>0 && canal<121) {
			this.canal = canal;
		}
	}
	
	public Marca getMarca() {
		return marca;
	}
	public Control getControl() {
		return control;
	}
	public int getPrecio() {
		return precio;
	}
	public int getVolumen() {
		return volumen;
	}
	public int getCanal() {
		return canal;
	}
	
	public int getNumTV() {
		return numTV;
	}
	
	public static void setNumTV(int numTVa) {
		numTV = numTVa;
	}
	
	public void turnOn() {
		this.estado = true;
	}
	public void turnOff() {
		this.estado = false;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void canalUp() {
		if (estado=true && canal>0 && canal<120) {
			canal++;	
		}
	}
	public void canalDown() {
		if (estado=true && canal>0 && canal<120) {
			canal--;	
		}
	}
	
	public void volumenUp() {
		if (estado=true && volumen>0 && volumen<7) {
			volumen++;	
		}
	}
	public void volumenDown() {
		if (estado=true && volumen>0 && volumen<7) {
			volumen--;	
		}
	}
}