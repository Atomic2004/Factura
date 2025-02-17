package LlenarVector;

import java.util.Arrays;
import java.util.Random;

public class Aleatorio {

	public static void main(String[] args) {
		Random random = new Random();
		int tamaño = 0;

		System.out.print("Ingrese el tamaño de los vectores: ");

		int[] vect1 = new int[tamaño];
		int[] vect2 = new int[tamaño];

		for (int i = 0; i < tamaño; i++) {
			vect1[i] = random.nextInt(500) + 1;
			vect2[i] = random.nextInt(500) + 1;
		}

		int paresVector1 = contarPares(vect1);
		int paresVector2 = contarPares(vect2);
		System.out.println("Cantidad de números pares en el primer vector: " + paresVector1);
		System.out.println("Cantidad de números pares en el segundo vector: " + paresVector2);

		int imparesVector1 = tamaño - paresVector1;
		int imparesVector2 = tamaño - paresVector2;
		if (imparesVector1 > imparesVector2) {
			System.out.println("El primer vector tiene más números impares.");
		} else if (imparesVector1 < imparesVector2) {
			System.out.println("El segundo vector tiene más números impares.");
		} else {
			System.out.println("Ambos vectores tienen la misma cantidad de números impares.");
		}
		String vector1Ordenado = ordenarYConvertirEnString(vect1);
		String vector2Ordenado = ordenarYConvertirEnString(vect2);

		System.out.println("Primer vector ordenado ascendentemente: " + vector1Ordenado);
		System.out.println("Segundo vector ordenado ascendentemente: " + vector2Ordenado);
	}

	public static int contarPares(int[] vector) {
		int count = 0;
		for (int num : vector) {
			if (num % 2 == 0) {
				count++;
			}
		}
		return count;
	}

	public static String ordenarYConvertirEnString(int[] vector) {
		Arrays.sort(vector);
		StringBuilder sb = new StringBuilder();
		for (int num : vector) {
			sb.append(num).append(" ");
		}
		return sb.toString().trim();
	}

}
