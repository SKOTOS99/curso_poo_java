package com.poo.modificadores.models.automovil;

import com.poo.modificadores.constants.TipoMotor;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Motor {
	
	private double cilindrada;
	private TipoMotor tipo;
	
	
	public Motor(double cilindrada, TipoMotor tipo) {
		super();
		this.cilindrada = cilindrada;
		this.tipo = tipo;
	}


	public Motor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
