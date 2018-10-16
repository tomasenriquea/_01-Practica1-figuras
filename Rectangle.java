package uF4.practicas._01_10_10_2018._01;

import java.util.Scanner;

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
		getPapplet().stroke(getColor().getRed(), getColor().getGreen(), getColor().getBlue());
		
		//Aqui se dara la posicion en la pantalla.
		getPapplet().rect((float)getPoint().getX(), (float)getPoint().getY(), (float)ancho * 2 , (float)alto * 2);
	}
	
	
	//----------------------------------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------------------------------
	
	@SuppressWarnings("resource")
	public static void rectangulo() {
		Scanner sc = new Scanner(System.in); 
		
		//----------------------------------------------------------------------------------------------
		System.out.println("\nIngrese color del rectangulo.");
		System.out.print("Rojo: ");
		float red = sc.nextFloat();
		
		System.out.print("Verde: ");
		float green = sc.nextFloat();
		
		System.out.print("Blue: ");
		float blue = sc.nextFloat();
		
		Color color = new Color(red, green, blue);  // Combinación de colores principales para un color.
	
		//----------------------------------------------------------------------------------------------
		System.out.println("\nIngrese la ubicación de la figura.");
		System.out.print("Coordenada X: ");
		float x = sc.nextFloat();
		
		System.out.print("Coordenada Y: ");
		float y = sc.nextFloat();
		
		Point point = new Point(x, y);  // Coordenada establecida de una posicion.

		//----------------------------------------------------------------------------------------------
		System.out.println("\nIngrese el alto y ancho del rectangulo.");
		
		System.out.print("Alto: ");
		double alto = sc.nextDouble();
	
		System.out.print("Ancho: ");
		double ancho = sc.nextDouble();
		
		Rectangle rectangulo = new Rectangle(alto, ancho, point, color);
		rectangulo.dibujarFigura();
		
		//----------------------------------------------------------------------------------------------
		System.out.println("\n#######################################################");
		System.out.println("El rectangulo a crear tiene los siguientes detalles:\n");
		
		System.out.println("Perimetro: " + rectangulo.perimetro() + // se muestra el calculo del perimetro
				   		   "\nArea: " + rectangulo.area());  // se muestra el calculo del area
		
		System.out.println("\nRectangulo creado!!!");
		System.out.println("#######################################################");
	}
	
	
	public static void cuadradoAutomatico() {
		//Colores del cuadrado
		float red = (float) (Math.random() * COLORES);
		float green = (float) (Math.random() * COLORES);
		float blue = (float) (Math.random() * COLORES);
		Color color = new Color(red, green, blue); 
		//----------------------------------------
							
		//Ubicación del cuadrado
		float x = (float) (Math.random() * TAMANYO_PANTALLA);
		float y =  (float) (Math.random() * TAMANYO_PANTALLA);
		Point point = new Point(x, y);
		//----------------------------------------
				
		//Tamaño del cuadrado
		double alto = Math.random() * RADIO_MAXIMO;  // alto del cuadrado
		double ancho = Math.random() * LIMITE;  // Ancho del cuadrado
					
		Rectangle rectangulo = new Rectangle(alto, ancho, point, color);
		rectangulo.dibujarFigura();	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
