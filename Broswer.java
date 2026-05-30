package org.testleaf.SeleniumLearing_VSCode.Week2;

public class Broswer {

public String launchBrowser(String broswerName)
{
System.out.println("Broswer Launched");
return broswerName;
}
 
public void loadUrl(){
    System.out.println("Application URL loaded");
}
public static void main(String[] args) {
    Broswer browact = new Broswer();
    browact.launchBrowser("Chrome");
    browact.loadUrl();
}

}
