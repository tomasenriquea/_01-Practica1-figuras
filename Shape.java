package uF4.practicas._01_10_10_2018._01;

import java.util.Scanner;

import processing.core.PApplet;

// Forma o figura --- que pasa si se pone final a la clase, se heredad de la clase PApplet
public abstract class Shape extends PApplet{ 
	
	private Color color;
	private Point point;
	private static PApplet papplet;
	
	
	//CONSTRUCTORES
	// Constructor con modificado protegido, funciona con normalidad
	protected Shape(Color color, Point point) {
		this.color = color;
		this.point = point;
	}
	
	
	//GETTERS
	public Color getColor() {
		return color;
	}

	public Point getPoint() {
		return point;
	}

	public static PApplet getPapplet() {
		return papplet;
	}


	//SETTERS
	public void setColor(Color color) {
		this.color = color;
	}

	public void setPoint(Point point) {
		this.point = point;
	}
	
	public static void setPapplet(PApplet papplet) {
		Shape.papplet = papplet;
	}
	
	
	//METODOS DE CALCULOS
	public abstract double area();  // area de la figura
	
	public abstract double perimetro();  // perimetro de la figura
	
	public abstract void dibujarFigura();  // crearala la figura en la pantalla.
	
	
	//DETALLES 
	public void detalleCoordenada() {
		System.out.println("Posicion X: " + point.getX() + 
						   "\nPosicion Y: " + point.getY());
	} 
		

	public void detalleColor() {
		System.out.println("Rojo: " + color.getRed() + 
						   "\nVerde: " + color.getGreen() + 
						   "\nAzul: " + color.getBlue());
	}
	
	

	

	//----------------------------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------------------------
	
	// Esto es para mostrar el menú de opciones.
	public static int menu() {
		
		System.out.println("\n\n\n");
		System.out.println("||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("||||||||||||||||||||FIGURAS|||||||||||||||||||");
		System.out.println();
		System.out.println("1. Crear un circulo.\n" + 
						   "2. Crear un rectangulo.\n" + 
						   "3. Crear un triangulo.\n" + 
						   "0. Salir.");
			
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int dato;
		do {
			System.out.print("\nElija un opción: ");  // Controla que solo se ingrese una de las 4 opciones.
			dato = sc.nextInt();
		}while(dato > 3);
		
		return dato;	
	}
	
	//----------------------------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------------------------
	
	
	public static void circulo() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nColor del circulo.");
		System.out.print("Rojo: ");
		float red = sc.nextFloat();
		
		System.out.print("Verde: ");
		float green = sc.nextFloat();
		
		System.out.print("Blue: ");
		float blue = sc.nextFloat();
		
		Color color = new Color(red, green, blue);  // Combinación de colores principales para un color.
		
		//----------------------------------------------------------------------------------------------
		System.out.println("\nUbicación de la figura.");
		System.out.print("Coordenada X: ");
		float x = sc.nextFloat();
		
		System.out.print("Coordenada Y: ");
		float y = sc.nextFloat();
		
		Point point = new Point(x, y);  // Coordenada establecida de una posicion.
		
		//----------------------------------------------------------------------------------------------
		System.out.print("\nRadio del circulo: ");
		double radio = sc.nextDouble();
		
		//----------------------------------------------------------------------------------------------
		// Se crea el circulo.
		Circle circulo = new Circle(point, color, radio);
		circulo.dibujarFigura();
		
		System.out.println("\n#######################################################");
		System.out.println("El circulo a crear tiene los siguientes detalles:\n");
		
		System.out.println("Perimetro: " + circulo.perimetro() + // se muestra el calculo del perimetro
		   		           "\nArea: " + circulo.area());  // se muestra el calculo del area
		
		System.out.println("\nCirculo creado!!!");
		System.out.println("#######################################################");
	}
	
	
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
	
	
	public static void triangulo() {
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}  