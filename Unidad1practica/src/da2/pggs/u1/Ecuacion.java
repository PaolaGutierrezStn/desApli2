package da2.pggs.u1;

import java.io.Serializable;

public class Ecuacion implements Serializable {
	private double valorX;
	private double valorY;
	private double resulEcu;
	
	public void setValorX(double valorX) {
		this.valorX = valorX;
	}
	
	public void setValorY(double valorY) {
		this.valorY = valorY;
	}
	
	public void setResulEcu(double resulEcu) {
		this.resulEcu = resulEcu;
	}
	
	public double getValorX() {
		return valorX;
	}
	
	public double getValorY() {
		return valorY;
	}
	
	public double getResulEcu() {
			
		return (5*valorX-2)*(2*valorY-5);
	}

	public Ecuacion(double valorX, double valorY, double resulEcu) {
		super();
		this.valorX = valorX;
		this.valorY = valorY;
		this.resulEcu = resulEcu;
	}

	public Ecuacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Ecuacion [valorX=" + valorX + ", valorY=" + valorY + ", resulEcu=" + resulEcu + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
