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
	
	
	@SuppressWarnings("resource")
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
		
		Color color = new Color(red, green, blue);  // Combinación de colores principales para un color.
		
		//----------------------------------------------------------------------------------------------
		System.out.println("\nUbicacion del triangulo.");
		System.out.println("\nPrimer punto.");
		System.out.print("Coordenada X1: ");
		float x = sc.nextFloat();
		
		System.out.print("Coordenada Y1: ");
		float y = sc.nextFloat();
		
		Point point = new Point(x, y); 
		
		//------------------------------
		System.out.println("\nSegundo punto.");
		System.out.print("Coordenada X2: ");
		float x2 = sc.nextFloat();
		
		System.out.print("Coordenada Y2: ");
		float y2 = sc.nextFloat();
		
		Point point2 = new Point(x2, y2); 
		
		//------------------------------
		System.out.println("\nTercer punto.");
		System.out.print("Coordenada X3: ");
		float x3 = sc.nextFloat();
		
		System.out.print("Coordenada Y3: ");
		float y3 = sc.nextFloat();
		
		Point point3 = new Point(x3, y3); 
		
		//----------------------------------------------------------------------------------------------
		System.out.print("\nBase del triangulo: ");
		double base = sc.nextDouble();
		
		System.out.print("Altura del triangulo: ");
		double altura = sc.nextDouble();
		
		//----------------------------------------------------------------------------------------------
		// Se crea el triangulo.
		Triangle triangulo = new Triangle(base, altura, color, point, point2, point3);
		triangulo.dibujarFigura();
		
		System.out.println("\n#######################################################");
		System.out.println("El triangulo a crear tiene los siguientes detalles:\n");
		
		System.out.println("Perimetro: " + triangulo.perimetro() + // se muestra el calculo del perimetro
		   		           "\nArea: " + triangulo.area());  // se muestra el calculo del area
		
		System.out.println("\nTriangulo creado!!!");
		System.out.println("#######################################################");
	}
	
	
	//----------------------------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------------------------
	
	public static void figurasAleatorias() {
		circuloAutomatico();
		cuadradoAutomatico();
		trianguloAutomatico();
	}
	
	//----------------------------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------------------------
	
	public static void circuloAutomatico() {
		//Colores del circulo
		float red = (float) (Math.random() * COLORES);
		float green = (float) (Math.random() * COLORES);
		float blue = (float) (Math.random() * COLORES);
		Color color = new Color(red, green, blue); 
		//----------------------------------------
			
		//Ubicación del circulo
		float x = (float) (Math.random() * TAMANYO_PANTALLA);
		float y =  (float) (Math.random() * TAMANYO_PANTALLA);
		Point point = new Point(x, y);
		//----------------------------------------
				
		//Radio del circulo
		double radio = Math.random() * RADIO_MAXIMO;
		//----------------------------------------
				
		Circle circulo = new Circle(point, color, radio);
		circulo.dibujarFigura();
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
	
	
	public static void trianguloAutomatico() {
		//Colores del circulo
		float red = (float) (Math.random() * COLORES);
		float green = (float) (Math.random() * COLORES);
		float blue = (float) (Math.random() * COLORES);
		Color color = new Color(red, green, blue); 
		//----------------------------------------
				
		//Ubicacion del triangulo.
		//Primer punto.
		float x1 = (float) (Math.random() * TAMANYO_PANTALLA);
		float y1 = (float) (Math.random() * TAMANYO_PANTALLA);
		Point point = new Point(x1, y1); 
				
		//------------------------------
		//Segundo punto.
		float x2 = (float) (Math.random() * TAMANYO_PANTALLA);
		float y2 = (float) (Math.random() * TAMANYO_PANTALLA);
		Point point2 = new Point(x2, y2); 
				
		//------------------------------
		//Tercer punto.
		float x3 = (float) (Math.random() * TAMANYO_PANTALLA);
		float y3 = (float) (Math.random() * TAMANYO_PANTALLA);
		Point point3 = new Point(x3, y3); 
				
		//----------------------------------------------------------------------------------------------
		double base = (float) (Math.random() * RADIO_MAXIMO); //Base del triangulo
		double altura = (float) (Math.random() * RADIO_MAXIMO);  //Altura del triangulo
				
		//----------------------------------------------------------------------------------------------
		// Se crea el triangulo.
		Triangle triangulo = new Triangle(base, altura, color, point, point2, point3);
		triangulo.dibujarFigura();
	}
	
}  