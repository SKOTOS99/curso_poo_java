
public enum Colores {
	ROJO("Rojo"),
	AMARILLO("Amarillo"),
	AZUL("Azul"),
	NARANJA("Naranja");
	
	private final String color;

	private Colores(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}
	
	
	
}
