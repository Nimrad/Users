import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adduser {

    public static WebDriver driver;

    @Test
    public void Login() throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "D:\\Device\\Chrome\\chromedriver.exe");

driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://users.bugred.ru/");
  driver.findElement(By.xpath("//*[contains(text(), \"Войти\")]")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("145@mail.com");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("1111");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/form/table/tbody/tr[3]/td[2]/input")).submit();
     Thread.sleep(2000);
        driver.findElement(By.xpath("//*[contains(text(), \"Добавить пользователя\")]")).click();
        driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("Testing");
        driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("Testing@gmail.com");
        driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[3]/td[2]/input")).sendKeys("12345");
        driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[21]/td[2]/input")).submit();
     Thread.sleep(2000);
    }
}
