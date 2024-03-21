package com.poo.modificadores.models.automovil;

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
	private static String colorPatente = Colores.AMARILLO.getColor();
	private TipoAuto tipo;
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
				.append("\nid " + this.id)
				.append("\nModelo: " + this.modelo)
				.append("\nTipo: " + this.tipo.getNombre())
				.append("\nCilindrada: " + this.motor.getCilindrada())
				.append("\nTanque " + this.cantidadTanque.getCampacidad())
				.append("\nRuedas " + this.ruedas[0])
				.append("\nColor: " + this.color.getColor())
				.append("\nColorPatente: " + colorPatente)
				.append("\nVelocidad: " + this.motor.getCilindrada() * 100).toString();

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
		return (km / ((porcentajeGas) / 100f * this.cantidadTanque.getCampacidad()));
	}

	/**
	 * Constructor automovil
	 * @param fabricante
	 * @param modelo
	 * @param color
	 * @param cantidadTanque
	 * @param cilindrada
	 */
	public Automovil(String fabricante, String modelo, Colores color, Tanque cantidadTanque, Motor cilindrada) {
		this(fabricante, modelo, color, cantidadTanque);
		this.motor = cilindrada;
	}

	public Automovil(String fabricante, String modelo, Colores color) {
		this();// hace el llamdo al constructo que no recibe parametros
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.color = color;

	}

	public Automovil(String fabricante, String modelo, Colores color, Tanque cantidadTanque) {
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.color = color;
		this.cantidadTanque = cantidadTanque;
	}

	public Automovil() {
		this.id = ++Automovil.ultimoId;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Automovil)) {
			return false;
		}
		Automovil a = (Automovil) obj;

		return (this.fabricante != null && this.modelo != null && this.fabricante.equals(a.fabricante)
				&& this.modelo.equals(a.modelo));
	}

	@Override
	public String toString() {
		return "Automovil [id=" + id + ", fabricante=" + fabricante + ", modelo=" + modelo + ", color=" + color
				+ ", cantidadTanque=" + cantidadTanque + ", cilindrada=" + motor + "]";
	}
	



	
}
