package project_5_com_utimateqa_nb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 1. Setup Chrome browser
 * 2. Open URL "https://courses.ultimateqa.com/users/sign_in";
 * 3. Print the title of the page
 * 4. Print the current url
 * 5. Print the page source
 * 6. Enter the email to email field
 * 7. Enter the password to password field
 * 8. Close the browser
 */
public class LoginTest {
    public static void main(String[] args) {
        // baseUrl
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        // 1. set up Chrome browser
        WebDriver driver = new ChromeDriver();
        //2. Open URL
        driver.get(baseUrl);
        // maximise the window
        driver.manage().window().maximize();
        // 3. Print the title of the page
        String title = driver.getTitle();
        System.out.println("Title of the page " + title);
        //  4. Print the current url
        System.out.println("The current Url : " + driver.getCurrentUrl());
        //  5. Print the page source
        System.out.println("Page source : " + driver.getPageSource());
        // 6. Enter the email to email field
        WebElement emailField = driver.findElement(By.id("user[email]"));
        emailField.sendKeys("jamesbond1212@gmail.com");
        // 7. Enter the password to password field
        WebElement passwordField = driver.findElement(By.id("user[password]"));
        passwordField.sendKeys("Bond007%");
        // 8. Close the browser
        driver.close();
    }
}
