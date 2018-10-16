package uF4.practicas._01_10_10_2018._01;

import java.util.Scanner;

import processing.core.PApplet;

// Forma o figura --- que pasa si se pone final a la clase, se heredad de la clase PApplet
public abstract class Shape extends PApplet{ 
	
	private Color color;
	private Point point;
	private static PApplet papplet;
	public static final int TAMANYO_PANTALLA = 800;  // tamaño de la pantalla
	public static final int COLORES = 256;
	public static final int RADIO_MAXIMO = 100;
	public static final int LIMITE = 200;
	
	
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
						   "4. Crear figuras aleatorias.\n" + 
						   "0. Salir.");
			
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int dato;
		do {
			System.out.print("\nElija un opción: ");  // Controla que solo se ingrese una de las 4 opciones.
			dato = sc.nextInt();
		}while(dato > 4);
		
		return dato;	
	}
	
	//----------------------------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------------------------
	public static void figurasAleatorias() {  // generara las figuras de manera aleatorias.
		int variado = (int) (Math.random() * 3);
		
		switch (variado) {
		case 0:
			Circle.circuloAutomatico();
			break;

		case 1:
			Rectangle.cuadradoAutomatico();
			break;
			
		case 2:
			Triangle.trianguloAutomatico();
			break;
		}
	}
	//----------------------------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------------------------	
	
}  