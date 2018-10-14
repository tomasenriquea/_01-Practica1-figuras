package uF4.practicas._01_10_10_2018._01;

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
		// aqui se pondra el tama�o de la pantalla.
		size(Shape.TAMANYO_PANTALLA,Shape.TAMANYO_PANTALLA);
		Shape.setPapplet(this);
	}  
	
	
	@Override
	public void setup(){
		// el color de fondo
		background(255);
	}
	
	
	public void draw(){
	
		Shape.figurasAleatorias();
		frameRate(10);	
		
		/*
		int opcion = Shape.menu();
		
			switch (opcion) {
			case 0: 
				exit();
				break;
			case 1:
				Shape.circulo();						
				break;
			
			case 2:
				Shape.rectangulo();
				break;
				
			case 3:
				Shape.triangulo();
				break;

			case 4:
				Shape.figurasAleatorias();
				frameRate(10);	
				break;	
			} 
		*/
	}  
	
}


/*
2.1. Figuras en processing
Dise�ar una aplicaci�n que dibuje figuras (rect�ngulos, c�rculos y tri�ngulos) de tama�o, color y posici�n aleatoria utilizando Processing.

indicaciones:
[]1) A la estructura: Shape, Rect�ngulo y Circle que hicisteis servir en un ejercicio anterior a�ada Tri�ngulo.  
     Recordemos que Shape guarda el Color y un punto (Point). Este punto lo puede interpretar como le vaya mejor. Puede ser el punto central 
     de la figura (C�rculo) o el centro o el extremo superior (Rect�ngulo, Tri�ngulo).

[]2) Shape tambi�n debe tener el PApplet donde se dibujan todas las figuras,

[]3) La aplicaci�n, que extender� el PApplet de processing, se encargar� de crear las figuras e ir dibujando. En la aplicaci�n no se pueden 
     generar los valores aleatorios correspondientes a las posiciones y los colores de las figuras.
*/
