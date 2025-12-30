import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://automationexercise.com/login");

        driver.findElement(By.name("email")).sendKeys("test@test.com");
        driver.findElement(By.name("password")).sendKeys("test123");
        driver.findElement(By.xpath("//button[text()='Login']")).click();

        System.out.println("Login test executed");

        driver.quit();
    }
}
