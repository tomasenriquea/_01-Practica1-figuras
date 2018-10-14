package uF4.practicas._01_10_10_2018._01;

public class Rectangle extends Shape{  // Resctangulo

	private double alto, ancho;
	
	//CONSTRUCTOR

	
	public Rectangle(double alto, double ancho, Point point, Color color) {
		super(color, point);
		this.alto = alto;
		this.ancho = ancho;
	}

	//GETTERS
	public double getAlto() {
		return alto;
	}

	public double getAncho() {
		return ancho;
	}

	
	//SETTER
	public void setHW(double alto, double ancho) {
		this.alto = alto;
		this.ancho = ancho;
	}


	//METODOS SOBREESCRITOS
	@Override
	public double area() {
		return alto * ancho;
	}
	
	@Override
	public double perimetro() {
		return 2 * (alto + ancho);
	}

	@Override
	public void dibujarFigura() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
}
