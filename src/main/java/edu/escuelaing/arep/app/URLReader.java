package edu.escuelaing.arep.app;
import java.io.*;
import java.net.*;

public class URLReader {
	
	public static void main(String[] args) throws Exception {
		URL escuela = new URL("http://campusvirtual.escuelaing.edu.co:80/moodle/mod/assign/view.php?id=34731");
		
		
		System.out.println("Protocolo: "+ escuela.getProtocol());
		System.out.println("Authority: "+ escuela.getAuthority());
		System.out.println("Host: "+ escuela.getHost());
		System.out.println("Port: "+ escuela.getPort());
		System.out.println("Path: "+ escuela.getPath());
		System.out.println("Query: "+ escuela.getQuery());
		System.out.println("FIle: "+ escuela.getFile());
		System.out.println("Reference: "+ escuela.getRef());
	}

}
