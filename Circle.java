package uF4.practicas._01_10_10_2018._01;

import java.util.Scanner;

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
		getPapplet().stroke(getColor().getRed(), getColor().getGreen(), getColor().getBlue());
		//Aqui se dara la posicion en la pantalla.
		getPapplet().ellipse((float)getPoint().getX(), (float)getPoint().getY(), (float)radio * 2, (float)radio * 2);
	}
	
	//----------------------------------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------------------------------
	
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
	

}
