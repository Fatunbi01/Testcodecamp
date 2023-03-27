import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
class Kongaorderingflow {
    //import the selenium webdriver
    private WebDriver driver;
    @BeforeTest
   public void start() throws InterruptedException {
       //locate where the chrome driver is
       System.setProperty("webdriver.chromedriver.exe", "resources/chromedriver.exe");
       //open your chrome browser
       ChromeOptions option = new ChromeOptions();
       option.addArguments("--remote-allow-origins=*");
       WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver(option);
       //input your url
       driver.get("https://www.konga.com/");
       Thread.sleep(2000);
        //maximize the browser
        driver.manage().window().maximize();
        //click on the login button to open login page
        driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[1]/div/div/div[4]/a")).click();
        Thread.sleep(2000);
    }
    @Test (priority = 1)
    public void positivelogin() throws InterruptedException {
        //input your username in the username field
        driver.findElement(By.id("username")).sendKeys("macoyoptions@gmail.com");
        //input your password on the password field
        driver.findElement(By.id("password")).sendKeys("Chinyere$12");
        //click on the login page
        driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[4]/section/section/aside/div[2]/div/form/div[3]/button")).click();
        Thread.sleep(2000);
    }
    @Test (priority = 2)
    public void ClickComputerAndAccessories() throws InterruptedException{
        //from the categories, click on computer and accessories
        WebElement ComputerAndAccessories = driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[2]/div/a[2]"));
        ComputerAndAccessories.click();
        Thread.sleep(2000);
    }
    @Test (priority = 3)
    public void ClickLaptopSubCategory() throws InterruptedException{
        //click laptop subcategory
        WebElement LaptopSubCategory = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[3]/section/div/section/div[2]/div[2]/ul/li[3]/a/label/span"));
        LaptopSubCategory.click();
        Thread.sleep(2000);
    }
}
    @Test (priority = 4)
    public void clickAppleMacBooks() throws InterruptedException {
        //click on apple macbooks
        WebElement AppleMacBooks = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[3]/section/div/section/div[2]/div[2]/ul/li[3]/a/ul/li[1]/a/label/span"));
        AppleMacBooks.click();
        Thread.sleep(10000);
    }
    @Test (priority = 5)
    public void verifyItem() throws InterruptedException {
        // search for an item
        //Click on add an item to the cart for Apple MacBook Pro 2021 With M1 Max - 16" - 1TB SSD - 64GB RAM Unified Memory - Space Grey
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[3]/section/section/section/section/ul/li[1]/div/div/div[2]/form/div[3]/button")).click();
        Thread.sleep(10000);
    }
    @Test (priority = 6)
    public void clickCartButton() throws InterruptedException {
        // click on my cart button
        driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[1]/div/div/a[2]/span[1]")).click();
        Thread.sleep(10000);
    }
    @Test(priority = 7)
    public void clickContinueToCheckout() throws InterruptedException {
        //click checkout on the iframe that displays
        driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[3]/section/section/aside/div[3]/div/div[2]/button")).click();
        Thread.sleep(20000);
    }
    @Test (priority = 8)
    public void clickRegisteredAddress() throws InterruptedException {
        //Select the address by click on your registered address
        driver.findElement(By.id("5995549")).click();
        Thread.sleep(10000);

        driver.quit();
}



