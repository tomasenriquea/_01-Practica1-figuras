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

		// Aqui se obtendra el color de relleno del rectangulo
		getPapplet().fill(getColor().getRed(), getColor().getGreen(), getColor().getBlue());
		
		//Aqui se dara la posicion en la pantalla.
		getPapplet().rect((float)getPoint().getX(), (float)getPoint().getY(), (float)ancho * 2 , (float)alto * 2);
		
		
		/*
		// Aqui se obtendra el color de relleno del circulo
		getPapplet().fill(getColor().getRed(), getColor().getGreen(), getColor().getBlue());

		//Aqui se dara la posicion en la pantalla.
		getPapplet().ellipse((float)getPoint().getX(), (float)getPoint().getY(), (float)radio * 2, (float)radio * 2);
		*/
	}
	
	
	
	
	
	
}
