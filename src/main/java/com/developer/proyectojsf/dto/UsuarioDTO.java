/**
 * 
 */
package com.developer.proyectojsf.dto;

/**
 * @author Julio
 *
 *Clase que me permitira contener la informacion del usuario en session
 */
public class UsuarioDTO {
	
	private String usuario;
	private String password;
	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}
	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}