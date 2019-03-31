import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.Keys;


public class miTest {
    //Firefox
    WebDriver driver= new FirefoxDriver();
    @Test
    public void verificar(){
        //Go to the Google page
        driver.navigate().to("https://www.google.com/");

}

