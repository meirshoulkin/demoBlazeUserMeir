package helper;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class AlertHandler {

    WebDriver driver;

    public AlertHandler(WebDriver driver) {
        this.driver = driver;
    }

    public static void handleAlert(Alert alert, String expectedText){
        if (alert!=null){
            alert.accept();
        } else {
            System.out.println("There is no alert window");
        }
    }
}
