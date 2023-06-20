package project_5_com_utimateqa_nb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTest {
static String browser = "Edge";
static String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
static WebDriver driver;
    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")){
        driver = new ChromeDriver();
    } else if (browser.equalsIgnoreCase("Firefox")){
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser Name");
        }
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
