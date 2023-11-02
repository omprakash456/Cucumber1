package Cucumber1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Data {
	String strUserName, strPassword,strurl;
	public Data() {
		data();
	}
	public void data() {
	File file=new File("C:\\Omprakash_Assesment\\Cucmber\\src\\test\\resources\\Features\\Data.properties");
	FileInputStream fileInput = null;
	try {
		fileInput =  new FileInputStream(file);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	
   Properties prop = new Properties();
    try {
    	prop.load(fileInput);
    }catch (IOException e) {
    	e.printStackTrace();
    }
    strurl = prop.getProperty("url");
    strUserName = prop.getProperty("username");
    strPassword =  prop.getProperty("password");
		
}
}
