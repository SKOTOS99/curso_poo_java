package com.poo.modificadores.models.automovil;

import java.util.Arrays;
import java.util.Optional;

import com.poo.modificadores.constants.Colores;
import com.poo.modificadores.constants.TipoAuto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Automovil {

	private int id;
	private String fabricante;
	private String modelo;
	private Colores color;
	private Tanque cantidadTanque;
	private Motor motor;
	private Rueda[] ruedas;
	private TipoAuto tipo;
	private Persona conductor;
	
	private static String colorPatente = Colores.AMARILLO.getColor();
	private static int cantidadTanqueStatic = 50;
	private static int ultimoId;
	public static final Integer velocidadMaximaCarretera = 120;
	public static final Integer velociadaCiudad = 60;

	/**
	 * Imprime la configuracion del objeto creado en formato string.
	 *
	 * @return String
	 */
	public String detalle() {
	    return new StringBuilder("Fabricante: " + this.fabricante)
	            .append("\nid " + Optional.ofNullable(this.id).orElse(1))
	            .append("\nConductor: " + Optional.ofNullable(this.conductor).map(Persona::getNombre).orElse("n/a"))
	            .append("\nModelo: " + Optional.ofNullable(this.modelo).orElse("n/a"))
	            .append("\nTipo: " + Optional.ofNullable(this.tipo).map(TipoAuto::getNombre).orElse("n/a"))
	            .append("\nCilindrada: " + Optional.ofNullable(this.motor).map(Motor::getCilindrada).orElse(0.0))
	            .append("\nTanque " + Optional.ofNullable(this.cantidadTanque).map(Tanque::getCampacidad).orElse(0))
	            .append("\nRuedas " + Arrays.toString(Optional.ofNullable(this.ruedas).orElse(new Rueda[0])))
	            .append("\nColor: " + Optional.ofNullable(this.color).map(Colores::getColor).orElse("n/a"))
	            .append("\nColorPatente: " + colorPatente)
	            .append("\nVelocidad: " + Optional.ofNullable(this.motor).map(Motor::getCilindrada).orElse(0.0) * 100).toString();

	}
	
	
	public void imprimeRuedas(Rueda[] ruedas) {
		for(Rueda rueda: ruedas) {
			System.out.println(rueda);
		}
	}

	/**
	 * Imprime la accion del objeto acelerar.
	 *
	 * @param rpm as variable
	 * @return String
	 */
	public String acelerar(int rpm) {
		return new StringBuilder("El auto: " + this.fabricante).append(" acelerando a " + rpm).append(" rpm")
				.toString();
	}

	/**
	 * Imprime la accion del objeto frenar.
	 *
	 * @param rpm as variable
	 * @return String
	 */
	public String frenar() {
		return new StringBuilder("El auto: " + this.fabricante).append(" frenando ").toString();
	}

	/**
	 * Combina ambas acciones
	 * @param rpm
	 * @return String
	 */
	public String acelerarFrenar(int rpm) {
		String acelerar = this.acelerar(rpm);
		String frenar = this.frenar();
		return acelerar + "\n" + frenar;

	}

	/**
	 * Calcula el consumo de combustible del auto
	 * @param km as integer
	 * @param porcentajeGas as float
	 * @return float
	 */
	public float calcularConsumo(int km, float porcentajeGas) {
		return (km / (porcentajeGas * this.cantidadTanque.getCampacidad()));
	}

	/**
	 * Calcula el consumo de conbustible usando parametros staticos
	 * @param km
	 * @param porcentajeGas
	 * @return
	 */
	public static float calcularConsumoStatic(int km, float porcentajeGas) {
		return (km / (porcentajeGas * Automovil.cantidadTanqueStatic));
	}

	/**
	 * Realiza el consumo de combustible con un porcentaje entero
	 * @param km
	 * @param porcentajeGas
	 * @return
	 */
	public float calcularConsumo(int km, int porcentajeGas) {
		return (km / ((porcentajeGas) / 100f *Optional.ofNullable(this.cantidadTanque).map(Tanque::getCampacidad).orElse(1)));
	}


	public Automovil(int id, Persona conductor, String fabricante, String modelo, Colores color, Tanque cantidadTanque, Motor motor,
			Rueda[] ruedas) {
		super();
		this.id = id;
		this.conductor = conductor;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.color = color;
		this.cantidadTanque = cantidadTanque;
		this.motor = motor;
		this.ruedas = ruedas;
	}


	public Automovil() {
		super();
		// TODO Auto-generated constructor stub
	}

	



	



	
}
