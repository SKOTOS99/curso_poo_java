package com.poo.modificadores.constants;

import lombok.Getter;

@Getter
public enum Marcas {
	KMT("kmt"),
	SUZUKI("suzuki"),
	HONDA("Honda"),
	CF("Cf"),
	CHAGER("Chager"),
	FERRARI("Ferrari");
	
	private final String nombre;
	
	private Marcas(String nombre) {
		this.nombre = nombre;
	}
	

}
