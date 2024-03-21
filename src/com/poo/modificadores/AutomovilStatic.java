package com.poo.modificadores;
import com.poo.modificadores.constants.Colores;
import com.poo.modificadores.constants.TipoAuto;
import com.poo.modificadores.models.automovil.Automovil;
import com.poo.modificadores.models.automovil.Motor;
import com.poo.modificadores.models.automovil.Rueda;
import com.poo.modificadores.models.automovil.Tanque;

public class AutomovilStatic {
	
	public static void main(String[] args) {
		Automovil auto = new Automovil();
		Rueda[] ruedas = {new Rueda("Micheline", 16, 24.5),new Rueda("Micheline", 16, 24.5),new Rueda("Micheline", 16, 24.5),new Rueda("Micheline", 16, 24.5)};
	

		 auto.setColor(Colores.AZUL);
		 auto.setFabricante("yamaha");
		 auto.setMotor(new Motor());
		 auto.setCantidadTanque(new Tanque());
		 auto.setRuedas(ruedas);
		 auto.setModelo("2024");
		 auto.setTipo(TipoAuto.SEDAN);
		System.out.println(auto.calcularConsumoStatic(30, 70));
	
	}

}
