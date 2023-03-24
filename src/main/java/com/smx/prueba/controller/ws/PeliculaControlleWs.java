/**
 * 
 */
package com.smx.prueba.controller.ws;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.smx.prueba.cliente.ws.PeliculaClienteWs;

/**
 * @author llall
 *
 */

@Path("/api")
@Stateless
public class PeliculaControlleWs {
	
	private Gson gson;
	//@Inject
	PeliculaClienteWs clienteWs = new PeliculaClienteWs();
	
	public PeliculaControlleWs() {
		gson = new Gson();
	}

	@GET
	@Path("/estado")
	public Response estado(){
	
		String salida = "Exito";
		return Response.status(Response.Status.OK).entity(salida).build();
		
	}
	
	@GET
	@Path("/movie")
	@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
	public Response listar() {
		//List<Config> lista = new ArrayList<>();
		String salida;
		try {
//			lista = configService.listar();
			salida = gson.toJson(clienteWs.obtenerDatosPelicula());
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
		return Response.status(Response.Status.OK).entity(salida).build();
	}
	
}
