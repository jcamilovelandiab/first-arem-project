package edu.escuelaing.arem.project;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class Controller 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to my App!" );
        try {
			AppServer.init();
			//AppServer.listen();
		} catch (IOException e) {
			System.out.println("The server could not initialize correctly.");
		}
    }
}
