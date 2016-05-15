package day29;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		String str="org.openqa.selenium.firefox.FirefoxDriver";
		Class.forName(str).newInstance();
		

	}

}
