/**
 * 
 */
package com.smx.prueba.cliente.ws.vo;

/**
 * @author llall
 *
 */
public class PeliculaDataVO {

	final String URL_PATH_IMG = "https://image.tmdb.org/t/p/w500​";
	
	String original_title;
	String poster_path;
	
	public String getOriginal_title() {
		return original_title;
	}
	public void setOriginal_title(String original_title) {
		this.original_title = original_title;
	}
	public String getPoster_path() {
		return poster_path;
	}
	public void setPoster_path(String poster_path) {
		this.poster_path = URL_PATH_IMG.concat(poster_path);
	}
	
	
	
	
}
