/**
 * 
 */
package com.developer.proyectojsf.controllers;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * @author Julio
 *
 *clase que se encarga de cerrar la session del usuario
 */
@ManagedBean
public class SessionClosedController {
	
	@PostConstruct
	public void init() {
		System.out.println("cerrar sesión ...");
	}
	public void cerrarSession(){
		ExternalContext ex=FacesContext.getCurrentInstance().getExternalContext();
		ex.invalidateSession();
		try {
			this.redireccionar("login.xhtml");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	/*
	 * metodo que me permite direccionar al login para cerrar session
	 */
	private void redireccionar(String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}

}
