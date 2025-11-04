package core;

import com.sun.jna.WString;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

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
        System.out.println(driver.getTitle());
    }

    public static void selecionajanela(){

        String parentWindow = driver.getWindowHandle();
        //driver.findElement(By.id("frmcaindex:btnOk")).click();

        for(String windowHandles : driver.getWindowHandles()){
            if(!windowHandles.equals(parentWindow)){
                driver.switchTo().window(windowHandles);
            }
        }

        System.out.println(driver.getTitle());

    }


    public static void identificajanela(String nome){

        driver.switchTo().frame(nome);
    }

    public static void relativeparent(String nome){

        driver.switchTo().parentFrame();
        driver.switchTo().frame(nome);
        System.out.println(driver.getTitle());
    }

    public static void esperaelemento(WebElement elemento){

        driver.manage().window().maximize();
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(d -> elemento.isDisplayed());
    }

    public static void titulo(){

        System.out.println(driver.getTitle());
    }
    public static void fecharjanela(){
        driver.close();
    }
}
