import java.util.Scanner;


public class Ejercicio5{

public static void main(String [] args){

	// variables
	int opcionAvanzar = 6;
	int f=0,m=0, mayorF=0, mayorM=0, menorF=0, menorM=0;

	//definir el scanner

	Scanner scanner = new Scanner(System.in);

	//Solicitar las edades



	while (opcionAvanzar != 5) {

		System.out.println("\nIngresa 1 si eres mujer o 2 si eres hombre");
		int sexo = scanner.nextInt();


			if (sexo==1) {

				 f++;

				System.out.println("Ingresa tu edad");
				int edad = scanner.nextInt();

					if (edad > 17) {

						mayorF = mayorF+1;

						System.out.println("Ingresaras otro dato?, marca 5 si no ingresaras otro dato y 0 si sí");
						int opcionn = scanner.nextInt();


					}

					else{

						 menorF = menorF +1;

						System.out.println("Ingresaras otro dato?, marca 5 si no ingresaras otro dato y 0 si sí");
						int opcionn = scanner.nextInt();

					}

				
			}


			else{


				 m = m +1;

				System.out.println("Ingresa tu edad");
				int edad = scanner.nextInt();

					if (edad > 17) {

						 mayorM = mayorM +1;

						System.out.println("Ingresaras otro dato?, marca 5 si no ingresaras otro dato y 0 si sí");
						int opcionn = scanner.nextInt();


					}

					else{

						menorM = menorM +1;

						System.out.println("Ingresaras otro dato?, marca 5 si no ingresaras otro dato y 0 si sí");
						int opcionn = scanner.nextInt();

					}




			}


	}

	System.out.println ("La cantidad de mujeres mayores de edad es"+ mayorF+ " y la cantidad de hombres menores de edad es " +menorM);


  }

}
