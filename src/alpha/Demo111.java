package alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.w3c.dom.DOMConfiguration;

import net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable;

public class Demo111 
{
	private static Logger log=LogManager.getLogger(Demo111.class.getName());
	
	public static void main(String[] args) 
	{
	
		  log.trace("Trace Message!");
	      log.debug("Debug Message!");
	      log.info("Info Message!");
	      log.warn("Warn Message!");
	      log.error("Error Message!");
	      log.fatal("Fatal Message!");
	}
}

