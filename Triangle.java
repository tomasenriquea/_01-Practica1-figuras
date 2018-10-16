package uF4.practicas._01_10_10_2018._01;

import java.util.Scanner;

public class Triangle extends Shape {

	private double base, altura;
	private Point point2, point3;
	
	

	// CONSTRUCTOR
	public Triangle(double base, double altura, Color color, Point point, Point point2, Point point3) {
		super(color, point);
		this.point2 = point2;
		this.point3 = point3;
		this.base = base;
		this.altura = altura;
	}

	// GETTERS
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

	// SETTERS
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

	// METODOS SOBREESCRITOS
	@Override
	public double area() {
		return (base * altura) / 2;
	}

	@Override
	public double perimetro() { // triangulo equilatero
		return base * 3;
	}

	@Override
	public void dibujarFigura() {
		// Aqui se obtendra el color de relleno del triangulo
		getPapplet().fill(getColor().getRed(), getColor().getGreen(), getColor().getBlue());
		getPapplet().stroke(getColor().getRed(), getColor().getGreen(), getColor().getBlue());

		// Aqui se dara la posicion en la pantalla.
		getPapplet().triangle((float) getPoint().getX(), (float) getPoint().getY(), 
				              (float) getPoint2().getX(), (float) getPoint2().getY(), 
				              (float) getPoint3().getY(), (float) getPoint3().getY());
	}

	// ----------------------------------------------------------------------------------------------------------------
	// ----------------------------------------------------------------------------------------------------------------

	@SuppressWarnings("resource")
	public static void triangulo() {
		Scanner sc = new Scanner(System.in);

		System.out.println("\nColor del triangulo.");
		System.out.print("Rojo: ");
		float red = sc.nextFloat();

		System.out.print("Verde: ");
		float green = sc.nextFloat();

		System.out.print("Blue: ");
		float blue = sc.nextFloat();

		Color color = new Color(red, green, blue); // Combinación de colores principales para un color.

		// ----------------------------------------------------------------------------------------------
		System.out.println("\nUbicacion del triangulo.");
		System.out.println("\nPrimer punto.");
		System.out.print("Coordenada X1: ");
		float x = sc.nextFloat();

		System.out.print("Coordenada Y1: ");
		float y = sc.nextFloat();

		Point point = new Point(x, y);

		// ------------------------------
		System.out.println("\nSegundo punto.");
		System.out.print("Coordenada X2: ");
		float x2 = sc.nextFloat();

		System.out.print("Coordenada Y2: ");
		float y2 = sc.nextFloat();

		Point point2 = new Point(x2, y2);

		// ------------------------------
		System.out.println("\nTercer punto.");
		System.out.print("Coordenada X3: ");
		float x3 = sc.nextFloat();

		System.out.print("Coordenada Y3: ");
		float y3 = sc.nextFloat();

		Point point3 = new Point(x3, y3);

		// ----------------------------------------------------------------------------------------------
		System.out.print("\nBase del triangulo: ");
		double base = sc.nextDouble();

		System.out.print("Altura del triangulo: ");
		double altura = sc.nextDouble();

		// ----------------------------------------------------------------------------------------------
		// Se crea el triangulo.
		Triangle triangulo = new Triangle(base, altura, color, point, point2, point3);
		triangulo.dibujarFigura();

		System.out.println("\n#######################################################");
		System.out.println("El triangulo a crear tiene los siguientes detalles:\n");

		System.out.println("Perimetro: " + triangulo.perimetro() + // se muestra el calculo del perimetro
				"\nArea: " + triangulo.area()); // se muestra el calculo del area

		System.out.println("\nTriangulo creado!!!");
		System.out.println("#######################################################");
	}

	public static void trianguloAutomatico() {
		// Colores del circulo
		float red = (float) (Math.random() * COLORES);
		float green = (float) (Math.random() * COLORES);
		float blue = (float) (Math.random() * COLORES);
		Color color = new Color(red, green, blue);

		// ----------------------------------------------------------------------------------------------
		double base = (float) (Math.random() * TAMANYO_PANTALLA); // Base del triangulo
		double altura = (float) (Math.random() * TAMANYO_PANTALLA); // Altura del triangulo

		// ----------------------------------------------------------------------------------------------
		
		// Ubicacion del triangulo.
		// Primer punto.
		float x1 = (float) altura;
		float y1 = (float) (Math.random() * TAMANYO_PANTALLA);
		Point point = new Point(x1, y1);

		// ------------------------------
		// Segundo punto.
		float x2 = (float) (Math.random() * TAMANYO_PANTALLA);
		float y2 = (float) base / 2;
		Point point2 = new Point(x2, y2);

		// ------------------------------
		// Tercer punto.
		float x3 = (float) (Math.random() * TAMANYO_PANTALLA);
		float y3 = (float) base / 2;
		Point point3 = new Point(x3, y3);

		
		// Se crea el triangulo.
		Triangle triangulo = new Triangle(base, altura, color, point, point2, point3);
		triangulo.dibujarFigura();
	}
		

}
