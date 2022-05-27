package Task11;


import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    private static WebDriver webDriver;

    public static WebDriver getInstance() {
        if (webDriver == null) {
            throw new RuntimeException("Driver is not initialized");

        }
        return webDriver;
    };


    public void init() {
        ChromeDriverManager.getInstance().setup();
        this.webDriver = new ChromeDriver();


    }

    public static void main(String[] args) {
        

        ChromeDriverManager.getInstance().setup();

        WebDriver driver = Driver.getInstance().init();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        driver.get("https://stackoverflow.com/");
        System.out.println(executor.executeScript("return document.readyState"));

        WebElement loginButton=driver.findElement(By.linkText("Log in"));
        executor = (JavascriptExecutor) driver;

        executor.executeScript("arguments[0].click();", loginButton);
        driver.quit();
    }
}
