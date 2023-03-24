/**
 * 
 */
package com.smx.prueba.cliente.ws;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.inject.Named;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.smx.prueba.cliente.ws.vo.PeliculaResponseVO;

/**
 * @author llall
 *
 */
@Named
public class PeliculaClienteWs {

	/**
	 * @return
	 */
	/**
	 * @return
	 */
	/**
	 * @return
	 */
	/**
	 * @return
	 */
	public PeliculaResponseVO obtenerDatosPelicula() {

		try {
			URL url = new URL("https://api.themoviedb.org/3/movie/popular?api_key=e1f172bd60af3c04eaff757943bfe1f6");
			HttpURLConnection cx = (HttpURLConnection) url.openConnection();
			cx.setRequestMethod("GET");

			cx.setRequestProperty("Content-Type", "application/json");

			if (cx.getResponseCode() != 200) {
				throw new RuntimeException("Error HTTP : " + cx.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(cx.getInputStream()));

			String salida;
			StringBuilder sb = new StringBuilder();
			while ((salida = br.readLine()) != null) {
				sb.append(salida);
			}

			System.out.println(sb.toString());
			Gson gson = new Gson();

			PeliculaResponseVO pel = gson.fromJson(sb.toString(), new TypeToken<PeliculaResponseVO>() {
			}.getType());
			
//			List<PeliculaDataVO> peliculaDataVOs = pel.getResults();
//
//			return peliculaDataVOs;
			
			return pel;
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
}
