package Task11;


import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    private static WebDriver webDriver;

    public static WebDriver getInstance() {
        if (webDriver == null) {
            init();

        }
        return webDriver;
    };


    private static void init() {
        ChromeDriverManager.getInstance().setup();
        webDriver = new ChromeDriver();


    }

}
