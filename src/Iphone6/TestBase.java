package Iphone6;
//Copyright (c) 2013 VocaLink Ltd


import java.io.File;

import java.io.FileInputStream;

import java.io.IOException;

import java.util.Properties;

import org.apache.commons.io.FileUtils;

import org.junit.After;

import org.junit.Before;







import org.openqa.selenium.By;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;



import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;





public class TestBase {


 public static Properties OR = null;

 public static WebDriver d = null;

 public static boolean isLoggedIn = false;



 @Before

 public void setUp() throws IOException, InterruptedException {

              

     OR = new Properties();

     FileInputStream fn = new FileInputStream(System.getProperty("user.dir") + "/src/Config1/OR.properties");

     OR.load(fn);



 d = new FirefoxDriver();

 // d= new InternetExplorerDriver();

  d.get("http://www.amazon.co.uk/");


     d.manage().window().maximize();

     System.out.println("Welcome to Amazon");

 }





 @After
 public void closeTheBrowser()
 {
	 d.close();
 }

 public static WebElement getobject(String xpathKey) {

     try {

         return d.findElement(By.xpath(OR.getProperty(xpathKey)));

     } catch (Throwable t) {

         return null;

     }

     
    
 }
}



 



 

 




 
