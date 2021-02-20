/**
 * 
 */
package com.developer.proyectojsf.controllers;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.developer.proyectojsf.dto.UsuarioDTO;

/**
 * @author Julio
 *
 *clase que se encargara de tener la informacion del usuario cuando se loggee o ingrese al aplicativo
 */
@ManagedBean
@SessionScoped
public class SessionController {
	//USUARIO QUE SE MANTENDRA EN SESSION
	private UsuarioDTO usuarioDTO;
	
	/*
	 * INICIALIZO LA SESSION DEL USUARIO
	 */
	
	@PostConstruct
	public void init() {
		System.out.println("cargando la informacion del usuario en la session");
	}
	/**
	 * @return the usuarioDTO
	 */
	public UsuarioDTO getUsuarioDTO() {
		return usuarioDTO;
	}

	/**
	 * @param usuarioDTO the usuarioDTO to set
	 */
	public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
		this.usuarioDTO = usuarioDTO;
	}
	
}
