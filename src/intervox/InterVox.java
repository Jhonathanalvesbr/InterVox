package intervox;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterVox {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jhonathan Alves\\Desktop\\chromedriver2.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.intervox.pt/login");

        WebElement element = null;
        List<WebElement> elements = null;

        elements = driver.findElements(By.tagName("button"));
        /*for (WebElement e : elements) {
            System.out.println(e.getText());
        }*/
        elements.get(0).click();
        element = elements.get(0);
        elements = driver.findElements(By.tagName("div"));

        for (int i = 0; i < 1; i++) {
            System.out.println(elements.get(i).getText());

        }
        List<WebElement> el = null;
        el = elements.get(1).findElements(By.tagName("div"));
        System.out.println(el.size());
        for (int i = 0; i < 1; i++) {
            System.out.println(elements.get(i).getText());

        }
        el = elements.get(1).findElements(By.tagName("li"));
        System.out.println(el.size());
        for (int i = 0; i < 1; i++) {
            System.out.println(elements.get(i).getText());
        }
        el = elements.get(1).findElements(By.tagName("a"));
        System.out.println(el.size());
        for (int i = 0; i < 1; i++) {
            System.out.println(elements.get(i).getText());

        }

        /*String html = driver.getPageSource();
        int x = html.indexOf("text-input-email");
        String user = html.substring(x, x + 30);
        x = html.indexOf("text-input-password");
        String pass = html.substring(x, x + 33);
        //x = html.indexOf("field-remember_checkbox");
        //String lbl = html.substring(x, x + 37);

        // Get all the elements available with tag name 'p'
        WebElement username = driver.findElement(By.id(user));
        WebElement password = driver.findElement(By.id(pass));
        username.sendKeys("Jhonathanalves_br@hotmail.com");
        password.sendKeys("32106478");
        WebElement botao = driver.findElement(By.xpath("//button[@type='submit' and contains(., 'Entrar')]"));
        botao.click();
        
        WebElement element = null;
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
