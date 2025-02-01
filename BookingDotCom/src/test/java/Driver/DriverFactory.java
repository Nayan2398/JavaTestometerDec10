package Driver;

public class DriverFactory {
	
	public static DriverManager getDriverManager(String browserName) {
		
		switch (browserName.toLowerCase()) {
		
		case "chrome":
			return new ChromeManager();
			
			
		case "firefox":	
			return new FireFoxDriver();
			
			
		default :
			throw new IllegalArgumentException("Invalid browsername ");
		}		
		
	}
	
	}
	
	
