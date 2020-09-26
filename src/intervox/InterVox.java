package intervox;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Sleeper;

public class InterVox {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Documents\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.intervox.pt/login");
        
       
        WebElement element = null;
        List<WebElement> elements = null;
        List<WebElement> links = null;
        
        element = driver.findElement(By.xpath("//SPAN[@class='sc-bwzfXH eJuetI']"));
        element.click();
        String html = driver.getPageSource();
        int x = html.indexOf("text-input-email");
        String user = html.substring(x, x + 30);
        x = html.indexOf("text-input-password");
        String pass = html.substring(x, x + 33);
        WebElement username = driver.findElement(By.id(user));
        WebElement password = driver.findElement(By.id(pass));
        username.sendKeys("Jhonathanalves_br@hotmail.com");
        password.sendKeys("32106478");
        WebElement botao = driver.findElement(By.xpath("//button[@type='submit' and contains(., 'Entrar')]"));
        botao.click();
        
        elements = driver.findElements(By.xpath("//BUTTON[@type='button']/self::BUTTON"));
        for (WebElement e : elements) {
            if(e.getText().equals("TOPIC")){
                e.click();
                break;
            }
        }
        
        /*links = driver.findElements(By.xpath("//LI[@class='px-2 py-2 pointer hover:bg-gray-200 text-sm']"));
        links.get(0).click();
        
        elements = driver.findElements(By.xpath("//a[contains(@href,'topic_albums')]"));
        for (WebElement e : elements) {
            e.click();
            break;
        }
        Thread.sleep(5000);
        
        links = driver.findElements(By.xpath("//BUTTON[contains(@class,'')]"));
        links.get(0).click();
        Thread.sleep(5000);
        Actions action = new Actions(driver);
        action.sendKeys(Keys.END).build().perform();
        Thread.sleep(3000);
        action.sendKeys(Keys.END).build().perform();
        
        links = driver.findElements(By.xpath("//a[contains(@href,'tracks')]"));
        
        element = links.get(0);
        element.click();
        
        /*
        elements = driver.findElements(By.xpath("//BUTTON[@type='button']/self::BUTTON"));
        for (WebElement e : elements) {
            if(e.getText().equals("TOPIC")){
                e.click();
                break;
            }
        }
        
        elements = driver.findElements(By.xpath("//div[@class='flex flex-row flex-wrap items-start content-start w-full mb-10 xl:pt-10']"));
        for (WebElement e : elements) {
            System.out.println(e.getText());
            e.click();
            break;
        }
        
        
        
        
        //x = html.indexOf("field-remember_checkbox");
        //String lbl = html.substring(x, x + 37);

        // Get all the elements available with tag name 'p'
        
        
        /*WebElement element = null;
        element = driver.findElement(By.tagName("div"));
        List<WebElement> elements = null;
        elements = element.findElements(By.tagName("button"));
        for (WebElement e : elements) {
            if (e.getText().equals("TOPIC")) {
                element = e;
                break;
            }
        }
        
        //element = driver.findElement(By.tagName("div"));
        elements = driver.findElements(By.tagName("button"));
        for (WebElement e : elements) {
            System.out.println(e.getText());
        }*/
    }
}
