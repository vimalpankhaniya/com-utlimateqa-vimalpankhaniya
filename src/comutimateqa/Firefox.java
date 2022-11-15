package comutimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Firefox {
    public static void main(String[] args) {
        String baseurl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.gheko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new ChromeDriver();

        // Launch the URL
        driver.get(baseurl);

        // Maximise the window
        driver.manage().window().maximize();

        // we give the implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Get the title of the page
        String title = driver.getTitle();
        System.out.println("Page Title is :" + title);

        // Get tje current URL
        System.out.println("Current URL :" + driver.getCurrentUrl());

        // Get page source
        System.out.println("Page source :" + driver.getPageSource());

        // Find the email field element
        WebElement EmailField = driver.findElement(By.id("user[email]"));
        EmailField.sendKeys("vimal@gmail.com");

        // Find the password field element
        WebElement passwordField = driver.findElement(By.name("user[password]"));
        passwordField.sendKeys("Champ234");

    }}


