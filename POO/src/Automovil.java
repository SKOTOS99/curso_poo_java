
public class Automovil {

	private int id;
	private String fabricante;
	private String modelo;
	private String color;
	private int cantidadTanque = 40;
	private double cilindrada;

	private static String colorPatente = "naranja";
	private static int cantidadTanqueStatic = 50;
	private static int ultimoId;
	public static final Integer velocidadMaximaCarretera = 120;
	public static final Integer velociadaCiudad = 60;
	
	public static final String COLOR_ROJO = "rojo";

	public String detalle() {
		return new StringBuilder("Fabricante: " + this.fabricante).append("\nid " + this.id)
				.append(" \nModelo: " + this.modelo).append("\nColor: " + this.color)
				.append("\nCilindrada: " + this.cilindrada).append("\nColorPatente: " + colorPatente)
				.append("\nVelocidad: " + this.cilindrada * 100).toString();

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getCantidadTanqueStatic() {
		return cantidadTanqueStatic;
	}

	public static void setCantidadTanqueStatic(int cantidadTanqueStatic) {
		Automovil.cantidadTanqueStatic = cantidadTanqueStatic;
	}

	public String acelerar(int rpm) {
		return new StringBuilder("El auto: " + this.fabricante).append(" acelerando a " + rpm).append(" rpm")
				.toString();
	}

	public String frenar() {
		return new StringBuilder("El auto: " + this.fabricante).append(" frenando ").toString();
	}

	public String acelerarFrenar(int rpm) {
		String acelerar = this.acelerar(rpm);
		String frenar = this.frenar();
		return acelerar + "\n" + frenar;

	}

	public float calcularConsumo(int km, float porcentajeGas) {
		return (km / (porcentajeGas * this.cantidadTanque));
	}

	public static float calcularConsumoStatic(int km, float porcentajeGas) {
		return (km / (porcentajeGas * Automovil.cantidadTanqueStatic));
	}

	public int getCantidadTanque() {
		return cantidadTanque;
	}

	public void setCantidadTanque(int cantidadTanque) {
		this.cantidadTanque = cantidadTanque;
	}

	public static String getColorPatente() {
		return colorPatente;
	}

	public static void setColorPatente(String colorPatente) {
		Automovil.colorPatente = colorPatente;
	}

	// sobrecarga de metodo
	public float calcularConsumo(int km, int porcentajeGas) {
		return (km / ((porcentajeGas) / 100f * this.cantidadTanque));
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}

	public Automovil(String fabricante, String modelo, String color, int cantidadTanque, double cilindrada) {
		this(fabricante, modelo, color, cantidadTanque);
		this.cilindrada = cilindrada;
	}

	public Automovil(String fabricante, String modelo, String color) {
		this();// hace el llamdo al constructo que no recibe parametros
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.color = color;

	}

	public Automovil(String fabricante, String modelo, String color, int cantidadTanque) {
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
				&& this.modelo.equals(a.getModelo()));
	}

	@Override
	public String toString() {
		return "Automovil [fabricante=" + fabricante + ", modelo=" + modelo + ", color=" + color + ", cantidadTanque="
				+ cantidadTanque + ", cilindrada=" + cilindrada + ", detalle()=" + detalle() + ", frenar()=" + frenar()
				+ ", getFabricante()=" + getFabricante() + ", getModelo()=" + getModelo() + ", getColor()=" + getColor()
				+ ", getCilindrada()=" + getCilindrada() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
