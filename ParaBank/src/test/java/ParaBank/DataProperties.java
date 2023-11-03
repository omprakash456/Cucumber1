package ParaBank;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DataProperties {
String url,firstname,lastname,address,city,state,zipcode,phone,ssn,username,password,cpassword;
	public DataProperties() {
			data();
}
public void data() {
	File file = new File("");
	FileInputStream fios = null;
	
	try {
		fios = new FileInputStream(file);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	
	Properties prop = new Properties();
	try {
		prop.load(fios);
	} catch (IOException e) {
		e.printStackTrace();
	}
	url=prop.getProperty("url");
	firstname = prop.getProperty("firstname");
	lastname=prop.getProperty("lastname");
	address=prop.getProperty("address");
	city=prop.getProperty("city");
	state=prop.getProperty("state");
	zipcode=prop.getProperty("zipcode");
	phone=prop.getProperty("phone");
	ssn=prop.getProperty("ssn");
	
	username=prop.getProperty("username");
	password=prop.getProperty("password");
	cpassword=prop.getProperty("cpassword");
  
    }

}

