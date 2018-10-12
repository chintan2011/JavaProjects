package myownapi;

import java.io.*;
import java.nio.file.*;

public class OSOperations {

	public File[] getAllContentsOfDirectory(String path) {

		File directory = new File(path);
		File[] contentsOfDirectory = directory.listFiles();

		for(File object : contentsOfDirectory) {
			if(object.isFile()) {
				System.out.format("File Name: %s%n", object.getName());
			}
			else if(object.isDirectory()) {
				System.out.format("Direcotry Name: %s%n", object.getName());
			}
		}		
		return contentsOfDirectory;
	}
	
	public String getOS() {
		String osName = System.getProperty("os.name").toLowerCase();
		boolean isMacOs = osName.startsWith("mac os x");
		if (isMacOs) 
		{
		  System.out.println("This is: " + osName.toUpperCase());
		}
		return osName;
	}
}

