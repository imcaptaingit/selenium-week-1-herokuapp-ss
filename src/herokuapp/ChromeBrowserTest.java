package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {

    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";

        //Set up the Chrome Browser
        WebDriver driver = new ChromeDriver();

        //Open URL
        driver.get(baseUrl);

        //Print the title of the page
        System.out.println(driver.getTitle());

        //Print the current URL
        System.out.println(driver.getCurrentUrl());

        //Get the Page Source
        System.out.println(driver.getPageSource());

        //Enter the email in the email field
        WebElement email = driver.findElement(By.id("username"));
        email.sendKeys("iamsarvat@googly.com");

        //Enter the password to password field
        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys("Iamboss777");

        //close browser
        driver.close();


    }


}
