import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    int a=12;
    String b="samim";

    void halal(){

    }


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/farzanaafroza/Downloads/chromedriver 2");
        ChromeDriver driver = new ChromeDriver();

        //driver.get("https://www.target.com/circle/enroll/join");
        driver.get("https://www.target.com/");
        driver.findElement(By.id("search")).sendKeys("Reza");
       // driver.findElement(By.id("search")).sendKeys("System.currentTimeMillis()");

        // driver.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/button[2]")).click();
       // driver.findElement(By.id("username")).sendKeys("Md");
       // driver.findElement(By.
        driver.findElement(By.id("search")).sendKeys("testuser" + System.currentTimeMillis() + "@gmail.com");





    }


}
