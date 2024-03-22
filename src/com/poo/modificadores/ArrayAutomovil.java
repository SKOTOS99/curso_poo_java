package com.poo.modificadores;

import java.util.Arrays;

import com.poo.modificadores.constants.Colores;
import com.poo.modificadores.constants.Constants;
import com.poo.modificadores.constants.Marcas;
import com.poo.modificadores.constants.TipoAuto;
import com.poo.modificadores.constants.TipoMotor;
import com.poo.modificadores.models.automovil.Automovil;
import com.poo.modificadores.models.automovil.Motor;
import com.poo.modificadores.models.automovil.Persona;
import com.poo.modificadores.models.automovil.Rueda;
import com.poo.modificadores.models.automovil.Tanque;

public class ArrayAutomovil {
	
	public static void main(String[] args) {
		Automovil camaro = new Automovil();
		Rueda[] ruedasCamaro = new Rueda[4];
		for (int i = 0; i < ruedasCamaro.length; i++) {
			ruedasCamaro[i] = new Rueda(Constants.FABRICANTE_LLANTE, 16, 24.5);
		}
		Motor motorCamaro = new Motor(250, TipoMotor.MAGNA);
		Tanque tanqueCamaro = new Tanque(30);
		Persona conductorCamaro = new Persona("Jesus", "Mendoza");
		
		camaro.setColor(Colores.AZUL);
		camaro.setFabricante(Marcas.CHAGER.getNombre());
		camaro.setConductor(conductorCamaro);
		camaro.setMotor(motorCamaro);
		camaro.setCantidadTanque(tanqueCamaro);
		camaro.setRuedas(ruedasCamaro);
		camaro.setModelo("2024");
		camaro.setTipo(TipoAuto.SEDAN);
		
		Automovil lanser = new Automovil();
		Rueda[] ruedasLanser = new Rueda[4];
		for (int i = 0; i < ruedasLanser.length; i++) {
			ruedasLanser[i] = new Rueda(Constants.FABRICANTE_LLANTE, 16, 24.5);
		}
		Motor motorlanser = new Motor(250, TipoMotor.MAGNA);
		Tanque tanquelanser = new Tanque(30);
		Persona conductorlanser = new Persona("Nancy", "Mendoza");
		
		lanser.setColor(Colores.ROJO);
		lanser.setFabricante(Marcas.HONDA.getNombre());
		lanser.setConductor(conductorlanser);
		lanser.setMotor(motorlanser);
		lanser.setCantidadTanque(tanquelanser);
		lanser.setRuedas(ruedasLanser);
		lanser.setModelo("2024");
		lanser.setTipo(TipoAuto.SEDAN);	
		
		Automovil porche = new Automovil();
		Rueda[] ruedasporche = new Rueda[4];
		for (int i = 0; i < ruedasporche.length; i++) {
			ruedasporche[i] = new Rueda(Constants.FABRICANTE_LLANTE, 16, 24.5);
		}
		Motor motorporche = new Motor(250, TipoMotor.MAGNA);
		Tanque tanqueporche = new Tanque(30);
		Persona conductorporche = new Persona("Juan", "Mendoza");
		
		porche.setColor(Colores.NARANJA);
		porche.setFabricante(Marcas.CF.getNombre());
		porche.setConductor(conductorporche);
		porche.setMotor(motorporche);
		porche.setCantidadTanque(tanqueporche);
		porche.setRuedas(ruedasporche);
		porche.setModelo("2024");
		porche.setTipo(TipoAuto.SEDAN);	
		
		Automovil[] autos = new Automovil[3];
		autos[0] = lanser;
		autos[1] = camaro;
		autos[2] = porche;
	Arrays.sort(autos);
	for (Automovil auto : autos) {
		System.out.println(auto);
	}
		
		
	}

}
