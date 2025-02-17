package Descuento;

import java.util.Scanner;

public class Cajero {

	public static void main(String[] args) {
		//colocar un lector
				Scanner scanner = new Scanner(System.in);
				//pedir la cantidad del producto
				System.out.print("Ingresa la cantidad de productos: ");
				int n = scanner.nextInt();
				//Declarar enteros
				int precios = 0;
				int preciosConDescuento = 0;
				//manera de pedir el precio de cada producto escrito con anterioridad
				for (int i = 0; i < n; i++) {
					System.out.print("Ingresa el precio del producto " + (i + 1) + ": ");
					precios = scanner.nextInt();
				}
				//proceso para saber el descuento y como quedara el precio final
				for (int i = 0; i < n; i++) {
					if (precios > 50000) {
						preciosConDescuento = (int) (precios * 0.10);
					} else {
						preciosConDescuento = (int) (precios * 0.05);
					}
				}
				//resultado de cuanto es con el descuento y cuanto debera pagar
				System.out.println("\nPrecios con descuento:");
				for (int i = 0; i < n; i++) {
					System.out.println("Producto " + (i + 1) + ": Precio original = " + precios + ", Precio con descuento = "
							+ preciosConDescuento);
				}
			}
		}