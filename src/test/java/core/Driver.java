package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertNotNull;

public class Driver {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void inicializaNavegador(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    public static void mudarjanela(int janela){

        String currHandle = getDriver().getWindowHandle();
        assertNotNull(currHandle);
        Object[] windowHandles = driver.getWindowHandles().toArray();
        driver.switchTo().window((String)windowHandles[janela]);
    }
}
