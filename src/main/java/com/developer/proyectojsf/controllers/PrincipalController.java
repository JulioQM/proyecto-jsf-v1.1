/**
 * 
 */
package com.developer.proyectojsf.controllers;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.List;

import com.developer.proyectojsf.entity.Empleado;
import com.developer.proyectojsf.services.EmpleadoService;

/**
 * @author Julio clase controller que se encarga de procesar informacion para la
 *         pantalla principal
 */
@ManagedBean
@ViewScoped
public class PrincipalController {
	/*
	 * lista de empleados para tabla
	 */
	private List<Empleado> empleados;
	/*
	 * Servicio con los metodos que realiza la logica de negocio de enpleados.
	 */
	private EmpleadoService empleadoService = new EmpleadoService();

	/*
	 * metodo que me permite llamar mi entidad creada
	 */
	@PostConstruct
	public void init() {
		this.consultarEmpleado();
	}

	public void consultarEmpleado() {

		this.empleados = this.empleadoService.consultarEmpleado();

	}

	/**
	 * @return the empleados
	 */
	public List<Empleado> getEmpleados() {
		return empleados;
	}

	/**
	 * @param empleados the empleados to set
	 */
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	/**
	 * @return the empleadoService
	 */
	public EmpleadoService getEmpleadoService() {
		return empleadoService;
	}

	/**
	 * @param empleadoService the empleadoService to set
	 */
	public void setEmpleadoService(EmpleadoService empleadoService) {
		this.empleadoService = empleadoService;
	}
	
	

}
