package edu.escuelaing.arep.app;
import java.io.*;
import java.net.*;

public class ReaderEjercicio2 {
	
	public static void main(String[] args) throws Exception {
		
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String urlStr = br.readLine(); 
		URL url = new URL(urlStr);
		//URL url = new URL("http://www.google.com/");
		
		// create a urlconnection object
		BufferedReader reader = new BufferedReader (new InputStreamReader(url.openStream()));
		
		String inputLine;
		File file = new File("resultado.html");
		FileWriter writer = new FileWriter(file);
		// read from the urlconnection via the bufferedreader
	    while ((inputLine = reader.readLine()) != null){
	    	writer.write(inputLine + "\n");
	    }
	    writer.close();
	    reader.close();
		
	}
	

}
