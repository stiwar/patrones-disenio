package com.abstractfactory.pattern;

import com.abstractfactory.pattern.automovil.Automovil;
import com.abstractfactory.pattern.automovil.AutomovilGasolina;
import com.abstractfactory.pattern.scooter.Scooter;
import com.abstractfactory.pattern.scooter.ScooterGasolina;

public class FabricaVehiculoGasolina implements FabricaVehiculo{

	@Override
	public Automovil creaAutomovil(String modelo, String color, int potencia, double espacio) {
		return new AutomovilGasolina(modelo, color, potencia, espacio);
	}

	@Override
	public Scooter creaScooter(String modelo, String color, int potencia) {
		return new ScooterGasolina(modelo, color, potencia);
	}

}
