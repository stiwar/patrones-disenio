package com.abstractfactory.pattern;

import com.abstractfactory.pattern.automovil.Automovil;
import com.abstractfactory.pattern.automovil.AutomovilElectricidad;
import com.abstractfactory.pattern.scooter.Scooter;
import com.abstractfactory.pattern.scooter.ScooterElectricidad;

public class FabricaVehiculoElectricidad implements FabricaVehiculo{

	@Override
	public Automovil creaAutomovil(String modelo, String color, int potencia, double espacio) {
		return new AutomovilElectricidad(modelo, color, potencia, espacio);
	}

	@Override
	public Scooter creaScooter(String modelo, String color, int potencia) {
		return new ScooterElectricidad(modelo, color, potencia);
	}

}
