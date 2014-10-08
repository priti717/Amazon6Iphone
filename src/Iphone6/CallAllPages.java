package Iphone6;

import org.junit.Test;

public class CallAllPages extends TestBase {
	
	@Test
	public void Calling_Registration() throws InterruptedException{
		
		new RegistrationandSearch().Test();
		Thread.sleep(2000);
		new DeliveryAddress().AddressDetails();
		Thread.sleep(2000);
		new VerifYour_ShippingAdd().ShippingAddress();
		Thread.sleep(3000);
	}

}


