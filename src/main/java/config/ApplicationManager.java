package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ApplicationManager {

      protected WebDriver driver;
      public WebDriver getDriver(){
          return driver;
      }

      @BeforeMethod
    public void SetUp(){
          driver = new ChromeDriver();
          driver.manage().window().maximize();
      }

      @AfterMethod
    public void TearDown(){
//          if (driver!=null)
//              driver.quit();
      }
}
