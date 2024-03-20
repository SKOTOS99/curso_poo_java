package com.poo.modificadores.constants;

import lombok.Getter;

@Getter
public enum TipoAuto {
	
	SEDAN("Sedan", "Auto normal", 4),
	STATION_WAGON("Wagon", "Auto grande", 4),
	COUPE("Coupe", "Auto chico", 2),
	FURGON("Furgon","Camioneta", 3);
	
	private final String nombre;
	private final int numeroPuertas;
	private final String descripcion;
	
	private TipoAuto(String nombre,  String descripcion, int numeroPuertas) {
		this.nombre = nombre;
		this.numeroPuertas = numeroPuertas;
		this.descripcion = descripcion;
	}
	
	
	
	
	

}
