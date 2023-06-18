package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {

    static  String baseURL = "http://the-internet.herokuapp.com/login";
    static  String browser = "Edge";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        }else {
            System.out.println("Web Browser ");
        }
        //open the URL
        driver.get(baseURL);

        //Print the title of the page
        System.out.println("Title of the page : " + driver.getTitle());

        //Print the current url
        System.out.println("Current URL of the page is : " + driver.getCurrentUrl());

        //Print the source of the page
        System.out.println("The source of the page is " + driver.getPageSource() );

        //Enter the email in the email password
        WebElement email = driver.findElement(By.name("username"));
        email.sendKeys("iamsarvat@googly.com");

        //Enter the password in the password field
        WebElement pass = driver.findElement(By.id("password"));
        pass.sendKeys("iamboss");

        //Close the Browser
        driver.close();
    }



}
