package Driver;

import org.openqa.selenium.WebDriver;

public class Driver {
	
    private final ThreadLocal<WebDriver> driver = new ThreadLocal <>();
	
	
	private Driver () {
		
		super();
	}

    public static final Driver instance = new Driver ();
    
    
    public static Driver getDriverInstance() {
    	return instance;
    }
    
    public WebDriver getDriver () {
    	return driver.get();   
    	}
    
    public void  setDriver(final WebDriver driverParam) {
    	
        driver.set( driverParam);
        
        
    }
    
    public void closeDriver () {
    	
    	driver.get().quit();
    	
    	driver.remove();
    }
    
      
    
	}
	

