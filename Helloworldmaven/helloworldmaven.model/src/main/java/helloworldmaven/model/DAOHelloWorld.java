package helloworldmaven.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class DAOHelloWorld {
	
	private static String FileName = "HelloWorld.txt";
	private static DAOHelloWorld instance = null;
	private String helloWorldMessage = null;
	
	private DAOHelloWorld () {
		
	}
	
	public static DAOHelloWorld getInstance() {
		if(instance == null) {
			instance = new DAOHelloWorld();			
		}
		
			
		return instance;
	}
	
	//private static void setInstance(DAOHelloWorld instance) {
		
	//}
	
	private void readFile() {
		InputStream is = getClass().getClassLoader().getResourceAsStream(FileName);//permet de lire le flux
		BufferedReader bf = new BufferedReader(new InputStreamReader(is));//transforme le flux en caractères
		try {
			helloWorldMessage = bf.readLine();
			bf.close();
			is.close();
		}catch(IOException e) {
			e.printStackTrace();		
		}

	}
	
	public String getHelloWorldMessage() {
		readFile();
		return helloWorldMessage;
	}
	
	public void setHelloWorldMessage(String getHelloWorldMessage) {
		
	}
	

}
