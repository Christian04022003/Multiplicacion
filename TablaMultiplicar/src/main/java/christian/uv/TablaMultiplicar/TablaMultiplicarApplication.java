package christian.uv.TablaMultiplicar;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TablaMultiplicarApplication {


	public static void main(String[] args) {
		Scanner txtIn = new Scanner(System.in);
		System.out.println("Hola como te llamas: ");
		String nombre = txtIn.nextLine();
	
		monstrarUI(nombre);
	  }
	
	  public static void multiplicador(int numero) {
		System.out.println("___________________");
		for (int index = 0; index < 10; index++) {
		  System.out.println(numero + " x " + (index + 1) + " = " + (numero * (index + 1)));
	
		}
	
	  }
	
	  public static void monstrarUI(String nombre) {
		Scanner in = new Scanner(System.in);
		System.out.println("--------------------");
		System.out.println("Hola " + nombre);
		System.out.println("1 - Mostrar una tabla");
		System.out.println("2 - Mostrar del 2 al 5");
		System.out.println("3 - Salir");
		System.out.println("--------------------");
		int numero = in.nextInt();
	
		switch (numero) {
		  case 1:
	
			System.out.println("Ingresa el número de la tabla que quieres: ");
			int numeroTabla = in.nextInt();
	
			multiplicador(numeroTabla);
	
			break;
	
		  case 2:
			for (int index = 2; index <= 5; index++) {
			  multiplicador(index);
			}
	
			break;
	
		  case 3:
	
			System.out.println("Gracias, Adios");
	
			break;
		}
	  }
}
