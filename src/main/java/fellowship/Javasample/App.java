package fellowship.Javasample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public static final Logger LOG=LogManager.getLogger(App.class);

    public static void main( String[] args )
    {
    	
    	String message="HEllo world";
         LOG.debug(message+"this message will print debug message");
         LOG.info(message+"this message will print info message");
         LOG.error(message+"this message will print error message");
         LOG.warn(message+"this message will print warn message");
         LOG.fatal(message+"this message will print fatal message");
         System.out.println( "Hello World!" );
         System.out.println("Hello java!!!!!");
         System.out.println("hello world java !!!!!");
         


    }
}
