package taller3.televisores;

public class Control {
	
	TV tv;
	
	public void turnOn() {
		tv.turnOn();
	}
	public void turnOff() {
		tv.turnOff();
	}
	public void canalUp() {
		if (tv.estado==true &&(tv.canal<120)) {
			tv.canalUp();
		}
		
	}
	public void canalDown() {
		if (tv.estado==true && tv.canal>1) {
			tv.canalDown();
		}
		
	}
	public void volumenUp() {
		if (tv.estado==true && tv.volumen<7) {
			tv.volumenUp();
		}
		
	}
	public void vulumenDown() {
		if (tv.estado==true && tv.volumen>1) {
			tv.volumenDown();
		}
		
	}
	public void setCanal(int canal) {
		if (tv.estado==true && (canal>0 && canal<=120)) {
			tv.setCanal(canal);
		}
		
	}
	
	public void enlazar(TV tv) {
		this.tv = tv;
		tv.setControl(this);
	}
	
	public TV getTv() {
		return tv;
	}
	public void setTv(TV tv) {
		this.tv = tv;
	}
}
