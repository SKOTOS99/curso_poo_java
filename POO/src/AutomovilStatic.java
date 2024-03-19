
public class AutomovilStatic {
	
	public static void main(String[] args) {
		Automovil auto = new Automovil();
		auto.setFabricante("Nisan");
		auto.setColor(Automovil.COLOR_ROJO);
		auto.setCilindrada(250);
		auto.setModelo("20014");
		auto.setColorPatente("azul");
		System.out.println( auto.detalle());
		
		System.out.println("kilomentros por litro: " + 
		Automovil.calcularConsumoStatic(200, 30));
		
		Automovil camaro = new Automovil();
		camaro.setFabricante("changer");
		camaro.setCantidadTanque(25);
		System.out.println(camaro.detalle());
		System.out.println(Automovil.velocidadMaximaCarretera);
	}

}
