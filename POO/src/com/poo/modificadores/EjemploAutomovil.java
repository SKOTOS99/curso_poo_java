package com.poo.modificadores;
import java.util.Date;

import com.poo.modificadores.constants.Colores;
import com.poo.modificadores.models.automovil.Automovil;

public class EjemploAutomovil {

	public static void main(String[] args) {
		
		Automovil auto = new Automovil();
		 auto.setColor(Colores.AZUL);
		 auto.setFabricante("yamaha");
		 auto.setCilindrada(1200);
		 auto.setModelo("2024");
		 
		 System.out.println(auto.detalle());



	}

}
 