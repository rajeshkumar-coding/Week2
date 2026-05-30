package org.testleaf.SeleniumLearing_VSCode.Week2;

import org.openqa.selenium.chrome.ChromeDriver;
public class SeleCd {
public static void main(String[] args) { 
ChromeDriver driver=new ChromeDriver(); 
driver.get("https://www.facebook.com");
driver.manage().window().maximize();
//close chrome driver
driver.close();  
} 
}
