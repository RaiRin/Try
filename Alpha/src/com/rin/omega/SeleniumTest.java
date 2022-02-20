package com.rin.omega;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	 static ChromeDriver dr;

		public static void openBrowser() {
			
			System.setProperty("webdriver.chrome.driver", "/Users/rainnyrin/Desktop/BTC07312021M/chromedriver");
			
			dr = new ChromeDriver();
			
		}
		
		public static void goToAnyWebSite(String url) {
			dr.get("https://www.macys.com/");
		}
		
		public static void getTitle() {
			
			 dr.findElement(By.cssSelector(" head > title"));
			 
		}
		
		public void verifyPageTitle(String expectedTitle) {
			
			String actualTitle = dr.getTitle();
			boolean b = actualTitle.equals("Macy's - Shop Fashion Clothing & Accessories - Official Site - Macys.com");
			
			if(b) {
				System.out.println("Macy's - Shop Fashion Clothing & Accessories - Official Site - Macys.com");
			}
			else {
				System.out.println("Fail : title did not match : " + actualTitle);
			}
			
		}
	
		public void closeBrowser() throws InterruptedException {
				wait(3000);
				dr.quit();
}



}
