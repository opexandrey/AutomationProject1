import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.JsonOutput;
import org.testng.Assert;

public class Project1 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\__DuoTech\\SoftWare\\Automation\\Selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

       // driver.get("http://qa-duotify.us-east-2.elasticbeanstalk.com/register.php");
       driver.navigate().to("http://qa-duotify.us-east-2.elasticbeanstalk.com/register.php");

       String expectedTitle = "Welcome to Duotify!";
       String actualTitle = driver.getTitle();

       if (expectedTitle.equals(actualTitle)){
           System.out.println("Title verified!");
       }else{
           System.out.println("Warning! Title is not verified...");
       }

//        Assert.assertEquals(actualTitle, expectedTitle);
//        System.out.println("Title verified!");




       driver.findElement(By.id("hideLogin")).click();

       driver.findElement(By.id("username")).sendKeys("opexandrey16");
       driver.findElement(By.id("firstName")).sendKeys("Andrey");
       driver.findElement(By.id("lastName")).sendKeys("Opex");
       driver.findElement(By.id("email")).sendKeys("opexandrey@16gmail.com");
       driver.findElement(By.id("email2")).sendKeys("opexandrey@16gmail.com");
       driver.findElement(By.id("password")).sendKeys("SwordFish");
       driver.findElement(By.id("password2")).sendKeys("SwordFish");

       driver.findElement(By.name("registerButton")).click();


       String expectedUrl = "http://qa-duotify.us-east-2.elasticbeanstalk.com/browse.php?";
       String actualUrl = driver.getCurrentUrl();

       if (actualUrl.equals(expectedUrl)){
           System.out.println("URL verified!");
       }else{
           System.out.println("Warning! URL is not verified...");
       }

//       Assert.assertEquals(actualUrl, expectedUrl);
//        System.out.println("URL verified!");


        driver.findElement(By.id("nameFirstAndLast")).click();
        Thread.sleep(100);
        driver.findElement(By.id("rafael")).click();
        Thread.sleep(100);

        String expectedUrl2 = "http://qa-duotify.us-east-2.elasticbeanstalk.com/register.php";
        String actualUrl2 = driver.getCurrentUrl();

        if (expectedUrl2.equals(actualUrl2)){
            System.out.println("You have successfully logged out!");
        }else{
            System.out.println("You are still logged in...");
        }

//        Assert.assertEquals(actualUrl2, expectedUrl2);
//        System.out.println("You have successfully logged out!");

        driver.findElement(By.id("loginUsername")).sendKeys("opexandrey16");
        driver.findElement(By.id("loginPassword")).sendKeys("SwordFish");
        driver.findElement(By.name("loginButton")).click();
        Thread.sleep(100);


        String expectedText = "You Might Also Like";
        String actualText = String.valueOf(driver.findElement(By.className("pageHeadingBig")).getText());


        if (expectedText.equals(actualText)){
            System.out.println("Welcome back!");
        }else{
            System.out.println("Something went wrong. Try again.");
        }


//        Assert.assertEquals(actualText, expectedText);
//        System.out.println("Welcome back");

        driver.close();





    }
}
