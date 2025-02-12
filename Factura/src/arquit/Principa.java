package arquit;
import java.util.ArrayList;
import java.util.List;

public class Principa {

	public static void main(String[] args) {
		Factura f= new Factura("ordenador",1000);
		 Factura f2= new Factura("movil",300);
		 Factura f3= new Factura("impresora",200);
		 Factura f4= new Factura("imac",1500);
		 
		 List<Factura> lista= new ArrayList<Factura>();
		 
		 lista.add(f);
		 lista.add(f2);
		 lista.add(f3);
		 lista.add(f4);
		 
		 /*
		  Factura facturaFiltro = 
		  lista.stream()
		  	.filter(elemento -> elemento.getImporte()==300)
		  	.findFirst()
		  	.get();
		  	System.out.println(facturaFiltro.getImporte());
		  */
		 
		 lista.stream()
		 .filter(elemento->elemento.getImporte()>500)
		 .map(elemento->elemento.getNombre())
		 .forEach(System.out::println);;
	}

}
