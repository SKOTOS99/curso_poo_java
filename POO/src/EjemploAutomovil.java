import java.util.Date;

public class EjemploAutomovil {

	public static void main(String[] args) {
		
		Automovil auto = new Automovil();
		 auto.setFabricante("Nisan");
		 auto.setColor(Colores.AZUL);
		 auto.setCilindrada(250);
		 auto.setModelo("20014");
		 
		System.out.println( auto.detalle());
		System.out.println(auto.acelerar(6000));
		System.out.println(auto.frenar());
		System.out.println(auto.acelerarFrenar(7999));
		
		System.out.println("Kilometros por litro: "+ auto.calcularConsumo(5, 0.56f));
		System.out.println("Kilometros por litro: "+ auto.calcularConsumo(5, 56));
		
		Automovil auto2 = new Automovil();
		 auto2.setFabricante("Nisan");
		 auto2.setColor(Colores.AZUL);
		 auto2.setCilindrada(250);
		 auto2.setModelo("20014");
		 
		System.out.println( auto2.detalle());
		System.out.println(auto2.acelerar(6000));
		System.out.println(auto2.frenar());
		System.out.println(auto2.acelerarFrenar(7999));
		
		System.out.println("Kilometros por litro: "+ auto2.calcularConsumo(5, 0.56f));
		System.out.println("Kilometros por litro: "+ auto2.calcularConsumo(5, 56));
		
		
		System.out.println(auto.equals(auto2));
		
		Automovil auto3 = new Automovil();
		System.out.println(auto.equals(auto3));
		System.out.println(auto.equals(new Date()));
		
		System.out.println(auto.toString());



	}

}
 