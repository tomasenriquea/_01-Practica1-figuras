package uF4.practicas._01_10_10_2018._01;

import java.util.Scanner;
import processing.core.PApplet;

public class Main extends PApplet{

	public static void main(String[] args) {
		
		String[] mainArgs = {"Figuras"};
		Main main = new Main();  // se llama a la clase principal Main
		PApplet.runSketch(mainArgs, main);
		//PApplet.main("uF4.practicas._01_10_10_2018._01.Main"); 
			

	}
	
	
	@Override
	public void settings(){
		// aqui se pondra el tamaño de la pantalla.
		size(800,800);
		Shape.setPapplet(this);
	}  
	
	
	@Override
	public void setup(){
		// el color de fondo
		background(255);
	
	}
	
	
	public void draw(){
		
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
	
	
	
	
}


/*

2.1. Figuras en processing
Diseñar una aplicación que dibuje figuras (rectángulos, círculos y triángulos) de tamaño, color y posición aleatoria utilizando Processing.

indicaciones:
[]1) A la estructura: Shape, Rectángulo y Circle que hicisteis servir en un ejercicio anterior añada Triángulo.  
     Recordemos que Shape guarda el Color y un punto (Point). Este punto lo puede interpretar como le vaya mejor. Puede ser el punto central 
     de la figura (Círculo) o el centro o el extremo superior (Rectángulo, Triángulo).

[]2) Shape también debe tener el PApplet donde se dibujan todas las figuras,

[]3) La aplicación, que extenderá el PApplet de processing, se encargará de crear las figuras e ir dibujando. En la aplicación no se pueden 
     generar los valores aleatorios correspondientes a las posiciones y los colores de las figuras.





*/














