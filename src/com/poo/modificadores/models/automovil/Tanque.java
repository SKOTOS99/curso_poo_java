package com.poo.modificadores.models.automovil;


import com.poo.modificadores.constants.Constants;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tanque {
	
	private Integer campacidad;

	public Tanque(Integer campacidad) {
		super();
		this.campacidad = campacidad;
	}

	public Tanque() {
		this.campacidad = Constants.FOURT_TEEN;
	}
	

}
