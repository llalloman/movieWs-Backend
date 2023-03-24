/**
 * 
 */
package com.smx.prueba.conf;

import org.glassfish.jersey.server.ResourceConfig;

/**
 * @author llall
 *
 */
public class Configuration extends ResourceConfig {
	
public Configuration() {
		
		packages("com.smx.prueba.controller.ws");
	}

}
