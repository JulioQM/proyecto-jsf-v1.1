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
		
		empleado.add(empleadoIBM);
		empleado.add(empleadoMicrosoft);
		empleado.add(empleadoNasa);
		return empleado;
		
	}

	
	
}
