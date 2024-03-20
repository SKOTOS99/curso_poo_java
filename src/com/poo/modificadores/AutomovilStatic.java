package com.poo.modificadores;
import com.poo.modificadores.constants.Colores;
import com.poo.modificadores.models.automovil.Automovil;

public class AutomovilStatic {
	
	public static void main(String[] args) {
		Automovil porche = new Automovil();
		porche.setFabricante("euro");
		porche.setColor(Colores.ROJO);
		porche.setModelo("plus");
		porche.setCilindrada(2500);
		porche.setCantidadTanque(40);
		
		System.out.println(porche.detalle());
		System.out.println(porche.calcularConsumoStatic(30, 70));
	
	}

}
