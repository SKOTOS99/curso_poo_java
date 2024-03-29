package com.poo.modificadores;

import com.poo.modificadores.constants.Colores;
import com.poo.modificadores.constants.Constants;
import com.poo.modificadores.constants.TipoAuto;
import com.poo.modificadores.constants.TipoMotor;
import com.poo.modificadores.models.automovil.Automovil;
import com.poo.modificadores.models.automovil.Motor;
import com.poo.modificadores.models.automovil.Persona;
import com.poo.modificadores.models.automovil.Rueda;
import com.poo.modificadores.models.automovil.Tanque;

public class RelacionesObjetos {

	public static void main(String[] args) {
		Automovil auto = new Automovil();
		Rueda[] ruedas = new Rueda[4];
		for (int i = 0; i < ruedas.length; i++) {
		    ruedas[i] = new Rueda(Constants.FABRICANTE_LLANTE, 16, 24.5);
		}
		Motor motor = new Motor(250, TipoMotor.MAGNA);
		Tanque tanque = new Tanque(30);
		Persona conductor = new Persona("Jesus", "Mendoza");
		
		 auto.setColor(Colores.AZUL);
		 auto.setFabricante(Constants.YAMAHA);
		 auto.setConductor(conductor);
		 auto.setMotor(motor);
		 auto.setCantidadTanque(tanque);
		 auto.setRuedas(ruedas);
		 auto.setModelo("2024");
		 auto.setTipo(TipoAuto.SEDAN);
		 System.out.println(auto.calcularConsumo(12, 13));
		 
		 System.out.println(auto.detalle());
		
	}
	
	


	



}
