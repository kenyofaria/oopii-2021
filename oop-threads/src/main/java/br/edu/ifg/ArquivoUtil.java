package br.edu.ifg;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class ArquivoUtil {

	
	public static void gravaRegistro(String registro) {
		try {
			InputStream s = ClassLoader.getSystemResourceAsStream("oop.properties");
			Properties prop = new Properties();
			prop.load(s);
			String fullPath = prop.getProperty("path")+"oop-output.txt";
			Files.write(Paths.get(fullPath), registro.getBytes());
			System.out.println("writing file in " + fullPath);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
