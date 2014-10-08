package Iphone6;
//import java.awt.List;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.bcel.generic.Select;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegistrationandSearch extends TestBase {
	

	public void Test() throws InterruptedException{
		
		System.out.println("test");
		
		getobject("YourSignIn").click();
		String email= (Alphanum());
		
		Thread.sleep(2000);
	    getobject("EmailAddress").sendKeys(email+"@gmail.com");
		
		getobject("NoButton").click();
		Thread.sleep(2000);
		getobject("SignInServer").click();
		Thread.sleep(2000);
		getobject("Name").sendKeys(email);
		getobject("RetypeEmail").sendKeys(email+"@gmail.com");
		Thread.sleep(1000);
		getobject("Password").sendKeys("Password");
		Thread.sleep(1000);
		getobject("RetypePassword").sendKeys("Password");
		getobject("CreateAccount").click();
		Thread.sleep(2000);
		getobject("Search").sendKeys("iphone 6 case");
		getobject("Go").click();
		Thread.sleep(2000);
		//getobject("Iphone6").click();
		d.findElement(By.xpath(".//*[@id='result_0']/h3/a/span")).click();
		Thread.sleep(2000);
		getobject("Quantity").click();
		Thread.sleep(1000);
		//
	getobject("Quantity").sendKeys("3");
	System.out.println("testvisible1");
	
	d.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	//AddCartButton
	d.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	
	Thread.sleep(2000);
	//proceed button
	d.findElement(By.xpath("//span[@id='hlb-ptc-btn']")).click();
			
	}


public static String Alphanum(){
    String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    String ret = "";
    int length = chars.length();
    for (int i = 0; i < 8; i ++){
        ret += chars.split("")[ (int) (Math.random() * (length - 1)) ];
    }
    return ret;
}
}

//AddBasket=.//*[@id='bb_atc_button']
