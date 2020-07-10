package nasco;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BI_Med_self {

	static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException, AWTException {
		
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://nasco-255213.firebaseapp.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(5000);
        waitforele(driver, "//ion-button[contains(@class,'skip-button')]");
        driver.findElement(By.xpath("//ion-button[contains(@class,'skip-button')]")).click();
        
        waitforele(driver, "//p[contains(text(),'Buy Insurance')]");
        driver.findElement(By.xpath("//p[contains(text(),'Buy Insurance')]")).click();
        
        waitforele(driver, "//p[contains(text(),'Medical')]");
        driver.findElement(By.xpath("//p[contains(text(),'Medical')]")).click();
        
        waitforele(driver, "//p[contains(text(),'Family')]");
//        scroll("//p[contains(text(),'Family')]");
        
//        Thread.sleep(7000);
        driver.findElement(By.xpath("//p[contains(text(),'Family')]")).click();
        waitforele(driver, "//div[contains(@class,'footer-input_')]/ion-item//input");
        driver.findElement(By.xpath("//div[contains(@class,'footer-input_')]/ion-item//input")).sendKeys("bhargav");
         waitforele(driver,"//div[contains(@class,'footer-input_')]/ion-buttons[2]");
         driver.findElement(By.xpath("//div[contains(@class,'footer-input_')]/ion-buttons[2]")).click();
        waitforele(driver, "//div[contains(@class,'footer-input_')]/ion-item//input");
         driver.findElement(By.xpath("//div[contains(@class,'footer-input_')]/ion-item//input")).sendKeys("bhargav123@gmail.com");
        waitforele(driver,"//div[contains(@class,'footer-input_')]/ion-buttons[2]");
        driver.findElement(By.xpath("//div[contains(@class,'footer-input_')]/ion-buttons[2]")).click();
        waitforele(driver, "//p[contains(text(),'Male')]");
        driver.findElement(By.xpath("//p[contains(text(),'Male')]")).click();
        waitforele(driver, "//p[contains(text(),'Single')]");
        driver.findElement(By.xpath("//p[contains(text(),'Single')]")).click();
        waitforele(driver, "//p[contains(text(),'With NSSF')]");
        driver.findElement(By.xpath("//p[contains(text(),'With NSSF')]")).click();
//        js.executeScript("window.scrollBy(0, 750)", "");
//        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        driver.findElement(By.xpath("//*[@id=\"menu-content\"]/app-home/ion-content/div/div/ion-grid[3]/ion-row/ion-col/app-bot-message/div/div/div[2]/div/div/p")).click();
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        
        Thread.sleep(7000);
        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
//        driver.findElement(By.xpath(xpathExpression))
        waitforele(driver,"//div[contains(@class,'footer-input_')]//button");
        driver.findElement(By.xpath("//div[contains(@class,'footer-input_')]//button")).click();
//        waitforele(driver,"//ion-modal[@id='ion-overlay-1']//ion-content");
//        WebElement dateWidget = driver.findElement(By.xpath("//ion-modal[@id='ion-overlay-1']//ion-content"));
        waitforele(driver,"//ion-modal[@id='ion-overlay-1']//ion-content/ion-grid/ion-row[1]/ion-col[2]//ion-row/ion-col[3]");
        driver.findElement(By.xpath("//ion-modal[@id='ion-overlay-1']//ion-content/ion-grid/ion-row[1]/ion-col[2]//ion-row/ion-col[3]")).click();;
//        List<WebElement> columns=driver.findElements(By.xpath("//ion-modal[@id='ion-overlay-1']//ion-content/ion-grid/ion-row[1]/ion-col[2]//ion-row/ion-col[3]"));
       List<WebElement> columns = driver.findElements(By.xpath("//*[@id='ion-overlay-2']/div/li-ionic4-datepicker-modal/ion-content/ion-list"));
       
       System.out.println("start");
        for (WebElement cell: columns){
           //Select 13th Date
        	System.out.println("enter");
        	int i = 1;
        	System.out.println(cell.toString());
        	System.out.println(i);
        	i++;
           /*if (cell.getText().equals("1995")){
        	   waitforele(driver,"//ion-label[contains(text(),'1995')]");
              cell.findElement(By.xpath("//ion-label[contains(text(),'1995')]")).click();
              break;
         }*/
        }
        
        
	}
	
	public static WebElement waitforele(WebDriver driver,String item)
    {
        WebDriverWait wait = new WebDriverWait(driver,30);
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(item)));
        
    }

	public static void scroll(String item) throws InterruptedException
	{
		WebElement webElement = driver.findElement(By.xpath(item));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", webElement);
        Thread.sleep(10000);
        System.out.println("scrolling");
	}
}
