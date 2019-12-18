import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LMS {

    public static WebDriver driver;

    @Test
    public void Login() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Device\\Chrome\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://users.bugred.ru/");

        driver.findElement(By.xpath("//*[contains(text(), \"Войти\")]")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("rozga@gmail.com");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("478911");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/form/table/tbody/tr[3]/td[2]/input")).submit();
     Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"fat-menu\"]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"fat-menu\"]/ul/li[1]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[2]/td[2]/input")).sendKeys(Keys.CONTROL + "a");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("Reglan");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[3]/td[2]/select")).sendKeys("Мужской");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[4]/td[2]/input")).sendKeys("11.11.2011");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[5]/td[2]/input")).sendKeys("12.12.2012");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[6]/td[2]/textarea")).sendKeys(Keys.CONTROL + "a");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[6]/td[2]/textarea")).sendKeys("To walk with a cat");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[7]/td[2]/input")).sendKeys(Keys.CONTROL + "a");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[7]/td[2]/input")).sendKeys("111222333444");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[8]/td[2]/input")).click();
        Thread.sleep(2000);
    }
}
