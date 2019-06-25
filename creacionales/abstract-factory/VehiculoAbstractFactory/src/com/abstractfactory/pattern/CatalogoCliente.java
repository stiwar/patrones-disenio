package com.abstractfactory.pattern;

import com.abstractfactory.pattern.automovil.Automovil;
import com.abstractfactory.pattern.scooter.Scooter;

public class CatalogoCliente {

	public static void main(String[] args) {
		
		// ejemplo de fabrica de vehiculos eléctricos
		
		FabricaVehiculo fabrica = new FabricaVehiculoElectricidad();
		Automovil auto = fabrica.creaAutomovil("antiguo", "azul", 1100, 5);
		Scooter scooter = fabrica.creaScooter("clasico", "negro", 200);
		
		auto.mostrarCaracteristicas();
		scooter.mostrarCaracteristicas();

	}

}
