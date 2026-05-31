package org.testleaf.SeleniumLearing_VSCode.Week2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
public static void main(String[] args) {
    ChromeOptions opt = new ChromeOptions();
    opt.addArguments("--incognito");
    ChromeDriver driver = new ChromeDriver(opt);
    //opt.addArguments("guest");
    //ChromeDriver driver=new ChromeDriver(opt);
    driver.get("http://leaftaps.com/opentaps/control/main");
    driver.manage().window().maximize();
    WebElement username = driver.findElement(By.id("username"));
    WebElement password = driver.findElement(By.id("password"));
    WebElement login = driver.findElement(By.className("decorativeSubmit"));
    username.sendKeys("DemoCSR"); 
    password.sendKeys("crmsfa");
    login.click();
    WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
    crmsfa.click();
    WebElement leads = driver.findElement(By.linkText("Leads"));
    leads.click();
    WebElement createlead = driver.findElement(By.linkText("Create Lead"));
    createlead.click();
    WebElement company = driver.findElement(By.id("createLeadForm_companyName"));
    company.sendKeys("FC Global Services India LLP");
    WebElement Firstname = driver.findElement(By.id("createLeadForm_firstName"));
    Firstname.sendKeys("Rajeshkumar");
    WebElement lastname = driver.findElement(By.id("createLeadForm_lastName"));
    lastname.sendKeys("Punniyakotti");
    WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
    Select sourceopt = new Select(source);
    sourceopt.selectByIndex(5);
    WebElement marketc = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
    Select marketcopt = new Select(marketc);
    marketcopt.selectByVisibleText("Catalog Generating Marketing Campaigns");
    WebElement impnote = driver.findElement(By.id("createLeadForm_importantNote"));
    impnote.sendKeys("Automation Testing in Selenium using Java");
    WebElement submitbtn = driver.findElement(By.name("submitButton"));
    submitbtn.click();
    // WebElement leadid = driver.findElement(By.id("viewLead_companyName_sp"));
    // String message = leadid.getText();
    // System.out.println(message);
    // String lastSeven = message.substring(message.length() - 7);
    // System.out.println("Last 7 characters: " + lastSeven);
    // String cleanedText = lastSeven.replace("(", "").replace(")", "");
    // System.out.println("Cleaned text: " + cleanedText);
    // WebElement findlead = driver.findElement(By.linkText("Find Leads"));
    // findlead.click();
    // WebElement Findleadtext = driver.findElement(By.name("id"));
    // Findleadtext.sendKeys(cleanedText);
    // WebElement findleadbtn = driver.findElement(By.id("ext-gen334"));
    // findleadbtn.click();
    // WebElement findidlink = driver.findElement(By.className("linktext"));
    // findidlink.click();
    String title = driver.getTitle();
    System.out.println(title);
    if (title.equals("View Lead | opentaps CRM"))
    {
        System.out.println("Test Passed");
    }
    else
         System.out.println("Test Failed");
         //driver.close();
  }
}


