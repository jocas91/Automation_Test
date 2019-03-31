import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.Keys;


public class miTest {
    WebDriver driver= new FirefoxDriver();
    @Test
    public void verificar(){
        //Go to the Google page
        driver.navigate().to("https://www.google.com/");
        
        //Type in Google’s search “Focus Services
        driver.findElement(By.name("q")).sendKeys("Focus services");
        
        //Click on “Search button”
        driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div/div[3]/center/input[1]")).click();
        
        //Verify the https://www.focusservices.com URL exists in the results
        assertTrue(isTextPresent("https://www.focusservices.com/"));

        //Click on Focus Services – Beyond Expectations hyperlink
        driver.findElement(By.cssSelector("div.g:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1) > h3:nth-child(1)")).click();

        //Verify the “Now Hiring!” button exists into this page
        assertTrue(isTextPresent("Now Hiring!"));

        //Click on “Careers” Tab 
        driver.findElement(By.linkText("Careers")).click();
        
        //Locate Keywords field. Type “inbound” word. Enter this search. 
        
        //Click on the second register found
        
        //Verify this record have job’s description
	}
	//verify
	public boolean isTextPresent(String text){
        try{
            boolean b = driver.getPageSource().contains(text);
            return b;
        }
        catch(Exception e){
            return false;
        }
    }
}

