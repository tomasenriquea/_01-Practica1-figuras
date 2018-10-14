package uF4.practicas._01_10_10_2018._01;

public class Triangle extends Shape{
	
	private double base, altura;
	private Point point2, point3;

	
	//CONSTRUCTOR	
	public Triangle(double base, double altura, Color color, Point point, Point point2, Point point3) {
		super(color, point);
		this.point2 = point2;
		this.point3 = point3;
		this.base = base;
		this.altura = altura;
	}


	//GETTERS
	public double getBase() {
		return base;
	}

	public double getAltura() {
		return altura;
	}

	public Point getPoint2() {
		return point2;
	}


	public Point getPoint3() {
		return point3;
	}
	
	//SETTERS
	public void setBase(double base) {
		this.base = base;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void setPoint2(Point point2) {
		this.point2 = point2;
	}


	public void setPoint3(Point point3) {
		this.point3 = point3;
	}


	//METODOS SOBREESCRITOS
	@Override
	public double area() {
		return (base * altura) / 2;
	}

	@Override
	public double perimetro() {  // triangulo equilatero
		return base * 3;
	}

	@Override
	public void dibujarFigura() {
		// Aqui se obtendra el color de relleno del triangulo
		getPapplet().fill(getColor().getRed(), getColor().getGreen(), getColor().getBlue());
		getPapplet().stroke(getColor().getRed(), getColor().getGreen(), getColor().getBlue());
				
		//Aqui se dara la posicion en la pantalla.
		getPapplet().triangle((float)getPoint().getX(), (float)getPoint().getY(), 
							  (float)getPoint2().getX(), (float)getPoint2().getY(), 
							  (float)getPoint3().getX(), (float)getPoint3().getY());	
	}

}
