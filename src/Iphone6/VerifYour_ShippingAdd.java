package Iphone6;

import org.junit.Test;
import org.openqa.selenium.By;

public class VerifYour_ShippingAdd extends TestBase{
	
	
	public void ShippingAddress() throws InterruptedException
	{
	    	getobject("Continue3").click();
		   	Thread.sleep(2000);
			d.findElement(By.xpath("//input[@value='Continue']")).click();
				
	}

}
