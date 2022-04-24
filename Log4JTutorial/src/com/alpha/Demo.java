package com.alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {

	private static  Logger log = LogManager.getLogger(Demo.class.getName());
	public static void main(String[] args)
	{
		log.debug("Clicked on button");
		if(10>4)
		{
			log.info("Performs action");
		}	
		
		log.error("Object is not present");
		
		
		log.fatal("Object is missing");
		
		

	}

}
