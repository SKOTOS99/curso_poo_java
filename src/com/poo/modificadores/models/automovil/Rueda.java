package com.poo.modificadores.models.automovil;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Rueda {
	
	private String fabricante;
	private Integer ring;
	private Double ancho;
	
	
	public Rueda(String fabricante, Integer ring, Double ancho) {
		super();
		this.fabricante = fabricante;
		this.ring = ring;
		this.ancho = ancho;
	}


	
	

}
