package com.abstractfactory.pattern;

import com.abstractfactory.pattern.automovil.Automovil;
import com.abstractfactory.pattern.scooter.Scooter;

public interface FabricaVehiculo {

	Automovil creaAutomovil(String modelo, String color, int potencia, double espacio);
	Scooter creaScooter(String modelo, String color, int potencia);

}
