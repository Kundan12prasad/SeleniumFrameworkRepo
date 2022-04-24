package com.beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DemoBeta {

	private static  Logger log = LogManager.getLogger(DemoBeta.class.getName());
	public static void main(String[] args)
	{
		log.debug("I am debugging");
		if(10>4)
		{
			log.info("Object is present");
		}	
		
		log.error("Object is not  present");
		
		
		log.fatal("This is fatal");
		
		

	}

}
