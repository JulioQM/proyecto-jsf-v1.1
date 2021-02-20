/**
 * 
 */
package com.developer.proyectojsf.services;

import java.util.ArrayList;
import java.util.List;

import com.developer.proyectojsf.entity.Empleado;

/**
 * @author Julio
 * clase quer permite realizar la logica de negocio
 */
public class EmpleadoService {
	/*
	 * metodo que permite visualizar la lista de empleados de tal empresa TI
	 * @return {@link Empleado} lista de empleados
	 */
	public List<Empleado> consultarEmpleado() {
		List <Empleado> empleado= new ArrayList<Empleado>();
		
		Empleado empleadoIBM=new Empleado();
		Empleado empleadoMicrosoft=new Empleado();
		Empleado empleadoNasa=new Empleado();
		
		Empleado empleadoLinux=new Empleado();
		Empleado empleadoApple=new Empleado();
		Empleado empleadoDisney=new Empleado();

		Empleado empleadoKFC=new Empleado();
		Empleado empleadoSansumg=new Empleado();
		Empleado empleadoAcer=new Empleado();
		
		Empleado empleadoHP=new Empleado();
		Empleado empleadoOracle=new Empleado();
		Empleado empleadoHeroku=new Empleado();
		
		empleadoIBM.setNombre("carlos");
		empleadoIBM.setApellido("cautemo");
		empleadoIBM.setCiudad("quito");
		empleadoIBM.setGenero("masculino");
		
		empleadoMicrosoft.setNombre("ramom");
		empleadoMicrosoft.setApellido("velasquez");
		empleadoMicrosoft.setCiudad("canada");
		empleadoMicrosoft.setGenero("masculino");
		
		empleadoNasa.setNombre("rowal");
		empleadoNasa.setApellido("castillo");
		empleadoNasa.setCiudad("barcelona");
		empleadoNasa.setGenero("masculino");
		
		empleadoLinux.setNombre("rowaler");
		empleadoLinux.setApellido("castillo");
		empleadoLinux.setCiudad("barcelona");
		empleadoLinux.setGenero("masculino");
		
		empleadoApple.setNombre("silvia");
		empleadoApple.setApellido("castillo");
		empleadoApple.setCiudad("barcelona");
		empleadoApple.setGenero("masculino");
		
		empleadoDisney.setNombre("rodriguez");
		empleadoDisney.setApellido("castillo");
		empleadoDisney.setCiudad("barcelona");
		empleadoDisney.setGenero("masculino");
		
		empleadoKFC.setNombre("andersom");
		empleadoKFC.setApellido("castillo");
		empleadoKFC.setCiudad("barcelona");
		empleadoKFC.setGenero("masculino");
		
		empleadoSansumg.setNombre("nina");
		empleadoSansumg.setApellido("castillo");
		empleadoSansumg.setCiudad("barcelona");
		empleadoSansumg.setGenero("masculino");
		
		empleadoAcer.setNombre("fausto");
		empleadoAcer.setApellido("castillo");
		empleadoAcer.setCiudad("barcelona");
		empleadoAcer.setGenero("masculino");
		
		 empleadoHP.setNombre("hugo");
		 empleadoHP.setApellido("castillo");
		 empleadoHP.setCiudad("barcelona");
		 empleadoHP.setGenero("masculino");
		
		 empleadoOracle.setNombre("solin");
		 empleadoOracle.setApellido("castillo");
		 empleadoOracle.setCiudad("barcelona");
		 empleadoOracle.setGenero("masculino");
		
		 empleadoHeroku.setNombre("jorge");
		 empleadoHeroku.setApellido("castillo");
		 empleadoHeroku.setCiudad("barcelona");
		 empleadoHeroku.setGenero("masculino");
		
		empleado.add(empleadoIBM);
		empleado.add(empleadoMicrosoft);
		empleado.add(empleadoNasa);
		empleado.add(empleadoLinux);
		empleado.add(empleadoApple);
		empleado.add(empleadoDisney);
		empleado.add(empleadoKFC);
		empleado.add(empleadoSansumg);
		empleado.add(empleadoAcer);
		empleado.add(empleadoHP);
		empleado.add(empleadoNasa);
		empleado.add(empleadoHeroku);
		return empleado;
		
	}

	
	
}
