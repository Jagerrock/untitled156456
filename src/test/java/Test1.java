import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=2&zip_code=61144&first_name=sgshg&last_name=sdgfsdfg&email=jagerrock92%40gmail.com&password1=9063467&password2=456456456");

        WebElement el = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[4]/td/span"));
        try {
            Assert.assertEquals("Account is created", el.getText());
        } finally {
            driver.close();
            driver.quit();
        }



    }
}
