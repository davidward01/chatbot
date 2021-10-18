package chatbot;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleChatPeloton {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://onepeloton.com");

        WebDriverWait wait = new WebDriverWait(driver, 30);
        System.out.println("waiting for frame");

        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[contains(@class,'drift-frame-controller')]")));
        System.out.println("frame found and switched");
        Thread.sleep(5000);

        driver.findElement(By.xpath("//div[contains(@class,'drift-widget-avatar square drift-controller-icon--avatar-avatar')]")).click();
        System.out.println("Clicked chat box to open");
        Thread.sleep(5000);

        driver.findElement(By.xpath("//div[contains(@class,'drift-widget-controller drift-widget-controller--align-right square drift-widget-controller--closed')]")).click();
        System.out.println("Closed chat box");
    }
}
