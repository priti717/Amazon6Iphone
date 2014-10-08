package Iphone6;

import org.openqa.selenium.By;

public class DeliveryAddress extends TestBase 
{

	
	public void AddressDetails() throws InterruptedException{
		
		 //Fullname
		
        getobject("Fullname").sendKeys("testname");
       
        //add line1

        getobject("AddressLine1").sendKeys("21A");

        //city

        getobject("city").sendKeys("london");

        //state

        getobject("State").sendKeys("mitcham lane");
       

        //postcode

        getobject("Postcode").sendKeys("sw166lq");
       

        //Unitedkingdom
   
        getobject("DropdownCountry").click();

        d.findElement(By.xpath("//*[text()='United Kingdom']")).click();

    
        getobject("phoneNumber").sendKeys("+44757877777");
        
      
        getobject("click").click();
       

	}
}
