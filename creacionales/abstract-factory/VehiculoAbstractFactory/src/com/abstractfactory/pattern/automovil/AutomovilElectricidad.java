package com.abstractfactory.pattern.automovil;

public class AutomovilElectricidad extends Automovil {

	public AutomovilElectricidad(String modelo, String color, int potencia, double espacio) {
		super(modelo, color, potencia, espacio);
	}

	@Override
	public void mostrarCaracteristicas() {
		System.out.println("Automóvil eléctrico de modelo: " + modelo + " de color: " + color + " de potencia: "
				+ potencia + " de espacio: " + espacio);
	}

}
