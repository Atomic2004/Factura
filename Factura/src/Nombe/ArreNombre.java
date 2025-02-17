package Nombe;

import java.util.Scanner;

public class ArreNombre {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese la cantidad de nombres: ");
		int cantidad = scanner.nextInt();
		scanner.nextLine();

		String[] nombres = new String[cantidad];

		for (int i = 0; i < cantidad; i++) {
			System.out.print("Ingrese el nombre " + (i + 1) + ": ");
			nombres[i] = scanner.nextLine();
		}

		String nombreConMasCaracteres = "";
		int posicion = -1;
		int maxLongitud = 0;

		for (int i = 0; i < cantidad; i++) {
			if (nombres[i].length() > maxLongitud) {
				maxLongitud = nombres[i].length();
				nombreConMasCaracteres = nombres[i];
				posicion = i;
			}
		}
		System.out.println("El nombre con más caracteres es: " + nombreConMasCaracteres);
		System.out.println("Su posición es: " + posicion);
	}

}

	}

}
