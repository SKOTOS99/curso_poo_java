package com.poo.modificadores;
import java.util.Date;

import com.poo.modificadores.constants.Colores;
import com.poo.modificadores.constants.TipoAuto;
import com.poo.modificadores.models.automovil.Automovil;

public class EjemploAutomovilEnum {

	public static void main(String[] args) {
		
		Automovil auto = new Automovil();
		 auto.setColor(Colores.AZUL);
		 auto.setFabricante("yamaha");
		 auto.setCilindrada(1200);
		 auto.setModelo("2024");
		 auto.setTipo(TipoAuto.SEDAN);
		 
		 System.out.println(auto.detalle());

		 /**
		  * Iterar sobre enums.
		  */
		 TipoAuto[] tipos =  TipoAuto.values();
		 
		 for(TipoAuto a: tipos) {
			 System.out.println(a.getNombre());
		 }


	}

}
 