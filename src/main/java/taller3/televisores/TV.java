package taller3.televisores;

public class TV {
	
	Marca marca;
	int canal = 1;
	int precio = 500;
	boolean estado;
	int volumen = 1;
	Control control;
	static int numTV=0;
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		numTV++;
	}
	//setters
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
		if (estado==true && volumen>0 && volumen<=7) {
			this.volumen = volumen;
		}
	}
	public void setCanal(int canal) {
		if (estado==true && canal>=1 && canal<=120) {
			this.canal = canal;
		}
	}
	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	}
	//getters
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
	public static int getNumTV() {
		return numTV;
	}
	public boolean getEstado() {
		return estado;
	}	

	
	public void turnOn() {
		this.estado = true;
	}
	public void turnOff() {
		this.estado = false;
	}
	public void canalUp() {
		if (estado==true && (canal>=1 && canal<120)) {
			canal++;	
		}
	}
	public void canalDown() {
		if (estado==true && (canal>1 && canal<=120)) {
			canal--;	
		}
	}
	
	public void volumenUp() {
		if (estado==true && (volumen>=1 && volumen<7)) {
			volumen++;	
		}
	}
	public void volumenDown() {
		if (estado==true && volumen>1 && volumen<=7) {
			volumen--;	
		}
	}
}