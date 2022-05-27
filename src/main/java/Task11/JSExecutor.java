package Task11;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutor {
    public static void main(String[] args) {
        ChromeDriverManager.getInstance().setup();

        WebDriver driver = new ChromeDriver();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        driver.get("https://stackoverflow.com/");
        System.out.println(executor.executeScript("return document.readyState"));

        WebElement loginButton=driver.findElement(By.linkText("Log in"));
        executor = (JavascriptExecutor) driver;

        executor.executeScript("arguments[0].click();", loginButton);
        driver.quit();
    }
}
