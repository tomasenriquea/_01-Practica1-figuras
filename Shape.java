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
	public abstract double area();
	
	public abstract double perimetro();
	
	public abstract void dibujarFigura();
	
	

	
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
	
	/*
	public static void circulo() {
		

	}
	
	
	public static void rectangulo() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in); 
		
		Rectangle rectangulo = new Rectangle();  // Crea un rectangulo.
		
		//----------------------------------------------------------------------------------------------
		System.out.println("\nIngrese la combinación de color para el rectangulo.");
		System.out.print("Rojo: ");
		float red1 = sc.nextFloat();
		
		System.out.print("Verde: ");
		float green1 = sc.nextFloat();
		
		System.out.print("Blue: ");
		float blue1 = sc.nextFloat();
		
		Color color1 = new Color(red1, green1, blue1);  // Combinación de colores principales para un color.
		rectangulo.setColor(color1);  // Se le asigna un color
		
		//----------------------------------------------------------------------------------------------
		System.out.println("\nIngrese la ubicación de la figura.");
		System.out.print("Coordenada X: ");
		float x1 = sc.nextFloat();
		
		System.out.print("Coordenada Y: ");
		float y1 = sc.nextFloat();
		
		Point point1 = new Point(x1, y1);  // Coordenada establecida de una posicion.
		rectangulo.setPoint(point1);  // Se le asigna una posicion
		
		//----------------------------------------------------------------------------------------------
		System.out.println("\nIngrese el alto y ancho del rectangulo.");
		
		System.out.print("Alto: ");
		double alto = sc.nextDouble();
	
		System.out.print("Ancho: ");
		double Ancho = sc.nextDouble();
		
		rectangulo.setHW(alto, Ancho);  // Se asigna el valor del alto y ancho.
		
		//----------------------------------------------------------------------------------------------
		System.out.println("\n\n#######################################################");
		System.out.println("\nEl rectangulo a crear tiene los siguientes detalles:\n");
		
		System.out.println("Perimetro: " + rectangulo.perimetro() + // se muestra el calculo del perimetro
				   		   "\nArea: " + rectangulo.area());  // se muestra el calculo del area
		
		System.out.println("\nCombinacion de color");
		rectangulo.detalleColor();  //Aqui los detalles del color y de la posicion.
		
		System.out.println("\nUbicacion del rectangulo");
		rectangulo.detalleCoordenada(); //Aqui los detalles de la posicion.
		
		System.out.println("\nRectangulo creado!!!\n");
		System.out.println("#######################################################\n\n");
	}
	
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}  