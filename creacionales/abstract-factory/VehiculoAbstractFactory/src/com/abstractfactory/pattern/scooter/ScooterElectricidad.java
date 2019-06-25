package com.abstractfactory.pattern.scooter;

public class ScooterElectricidad extends Scooter{

	public ScooterElectricidad(String modelo, String color, int potencia) {
		super(modelo, color, potencia);
	}

	@Override
	public void mostrarCaracteristicas() {
		System.out.println("Scooter el�ctrica de modelo: " + modelo + " de color: " + color + " de potencia: " + potencia);
	}
	
}
