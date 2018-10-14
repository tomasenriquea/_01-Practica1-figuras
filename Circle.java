package uF4.practicas._01_10_10_2018._01;

public class Circle extends Shape{  // Circulo
	
	private double radio;
	
	
	//CONSTRUCTOR	
	
	public Circle(Point point, Color color, double radio) {
		super(color, point);
		this.radio = radio;
	}

	
	//GETTER
	public double getRadio() {
		return radio;
	}


	//SETTER
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	//-----------------------------------------------------------------------------
	//-----------------------------------------------------------------------------
	
	
	
	
	
	
	
	//-----------------------------------------------------------------------------
	//-----------------------------------------------------------------------------
	
	
	// METODOS SOBRESCRITOS
	@Override
	public double area() {
		return Math.PI * (radio * radio);
	}

	
	@Override
	public double perimetro() {
		return 2 * Math.PI * radio;
	}



	@Override
	public void dibujarFigura() {
		// Aqui se obtendra el color de relleno del circulo
		getPapplet().fill(getColor().getRed(), getColor().getGreen(), getColor().getBlue());

		//Aqui se dara la posicion en la pantalla.
		getPapplet().ellipse((float)getPoint().getX(), (float)getPoint().getY(), (float)radio * 2, (float)radio * 2);
	
		
		
		/*
		stroke(23, 102, 0);  // Esto es la linea externa
		fill(204, 102, 0);
		ellipse(300, 500, 55, 55);
		*/
	
	
	
	
	}
	
	
	
	
}
