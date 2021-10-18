package chatbot;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HandleChatCRMPro {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://crmpro.com/index.html");

        WebDriverWait wait = new WebDriverWait(driver, 30);
        System.out.println("Waiting for frame");

        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[contains(@style,'height') and contains(@class,'intercom')]")));
        System.out.println("Frame found and switched");

        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Welcome to Free CRM')]"))).perform();
        System.out.println("Mouse hover over element");
        Thread.sleep(5000);

        driver.findElement(By.xpath("//div[contains(@class,'intercom-lr0ri6 es6hgh14')]")).click();
        System.out.println("Closing chat bot");


        //  //div[contains(text(),'Welcome to Free CRM')]  - text inside box
        //  //div[contains(@aria-label,'Dismiss')]    - dismiss button






    }
}
