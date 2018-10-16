package uF4.practicas._01_10_10_2018._01;

import processing.core.PApplet;

public class Main extends PApplet{

	public static void main(String[] args) {
		String[] mainArgs = {"Figuras"};
		Main main = new Main();  // se llama a la clase principal Main
		PApplet.runSketch(mainArgs, main);
	}
	
	
	@Override
	public void settings(){
		// aqui se pondra el tama�o de la pantalla.
		size(Shape.TAMANYO_PANTALLA,Shape.TAMANYO_PANTALLA);
		Shape.setPapplet(this);  // sirve para que las figuras se dibujen aqui
	}  
	
	
	@Override
	public void setup(){
		background(255);  // el color de fondo
	}
	
	
	@Override
	public void draw(){
		Shape.figurasAleatorias();  // llama a los metodos estaticos que crean las figuras de forma automatica.
		frameRate(20);  // realentiza la la velocidad de las apariciones de las figuras.
		/*
		// Esta opcion permite crear de forma manual las figuras y una ultima opcion de forma automatica 
		int opcion = Shape.menu();
		
			switch (opcion) {
			case 0: 
				exit();
				break;
			case 1:
				Circle.circulo();						
				break;
			
			case 2:
				Rectangle.rectangulo();
				break;
				
			case 3:
				Triangle.triangulo();
				break;

			case 4:
				Shape.figurasAleatorias();
				frameRate(10);	
				break;	
			}   */
	}  
	
}


/*
2.1. Figuras en processing
Dise�ar una aplicaci�n que dibuje figuras (rect�ngulos, c�rculos y tri�ngulos) de tama�o, color y posici�n aleatoria utilizando Processing.

indicaciones:
[x]1) A la estructura: Shape, Rect�ngulo y Circle que hicisteis servir en un ejercicio anterior a�ada Tri�ngulo.  
     Recordemos que Shape guarda el Color y un punto (Point). Este punto lo puede interpretar como le vaya mejor. Puede ser el punto central 
     de la figura (C�rculo) o el centro o el extremo superior (Rect�ngulo, Tri�ngulo).

[x]2) Shape tambi�n debe tener el PApplet donde se dibujan todas las figuras,

[x]3) La aplicaci�n, que extender� el PApplet de processing, se encargar� de crear las figuras e ir dibujando. En la aplicaci�n no se pueden 
     generar los valores aleatorios correspondientes a las posiciones y los colores de las figuras.
*/
