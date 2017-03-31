package com.cts.pocselenium.test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {

	public static void main(String[] args) throws Exception {
		System.out.println("Internet Explorer is selected");
		System.setProperty("webdriver.ie.driver","D:/jars/selenium/IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:9081/DETInventoryWeb/pages/jsp/login.jsp");
		
		driver.findElement(By.name("userID")).sendKeys("3063098");
        driver.findElement(By.name("password")).sendKeys("test");
        driver.findElement(By.xpath("//input[@type='submit' and @title='Login']")).submit();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Login Success");
        
        
        /*driver.findElement(By.linkText("Create Email Template and B2B MFT Objects")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.name("detsNumber")).sendKeys("DET-2016");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@type='button' and @value='    GO   ']")).click();
        
        System.out.println("done loading");
        
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Select dropdown = new Select(driver.findElement(By.id("mailboxSelectedAction")));
        dropdown.selectByValue("Add");
        
        System.out.println("Add Mailbox opened");
        
       
        String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
        String subWindowHandler = null;

        Set<String> handles = driver.getWindowHandles(); // get all window handles
        Iterator<String> iterator = handles.iterator();
        while (iterator.hasNext()){
            subWindowHandler = iterator.next();
        }
        driver.switchTo().window(subWindowHandler); // switch to popup window
                                                    // perform operations on popup
        
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Select partner = new Select(driver.findElement(By.id("partnrName")));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       
        System.out.println("Partner selected");
        
        partner.selectByIndex(1);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//INPUT[@type='button' and @value='     Save     ']")).submit();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.switchTo().window(parentWindowHandler);  // switch back to parent window.
        */
        
        
        /*//validating radio button
        List<WebElement>radioButton = driver.findElements(By.name("mlbxZip"));
        boolean rbutton=false;
        boolean rbuttonEnable=false;
        String validate="";
        System.out.println(radioButton.toString() + radioButton.size());
        rbutton=radioButton.get(0).isSelected();
        rbuttonEnable=radioButton.get(0).isEnabled();
        
        
        System.out.println("if before");
        if(rbuttonEnable == true )
        {
            	System.out.println("Radio button Enabled");
            	validate= (rbutton == true)? "Yes option is selected":"No option is selected" ;
            	System.out.println(validate);

        }
        else
        {
            	System.out.println("Radio Button is Disabled");
            	validate= (rbutton == true)? "Yes option is selected":"No option is selected" ;
            	System.out.println(validate);
        }*/	
        
        driver.findElement(By.linkText("Manage Application Connections")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
	    driver.findElement(By.linkText("Approve Pending connection")).click();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   // driver.findElement(By.linkText("Update")).click();
	    //int index = 6;
	    //WebElement baseTable = driver.findElement(By.className("tablesorter"));
	   
	   // List<WebElement> tableRows = baseTable.findElements(By.tagName("tr"));
	    //tableRows.get(6).findElement(By.linkText("UPDATE")).click();
	    driver.findElement(By.xpath(".//*[@id='processtableEnvelope1']/table/tbody/tr[3]/td[3]/a")).click();
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    // ERROR: Caught exception [ERROR: Unsupported command [waitForPopUp | custInfo | 30000]]
	    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=custInfo | ]]
	   // driver.findElement(By.cssSelector("input.blue-button")).click();
		
	   // driver.close();
        
	}

}
