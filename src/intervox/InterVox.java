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

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jhonathan Alves\\Desktop\\chromedriver2.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.intervox.pt/login");

        Actions action = new Actions(driver);
        
        //Thread.sleep(10000);
        
        WebElement element = null;
        List<WebElement> elements = null;
        List<WebElement> links = null;

        Thread.sleep(3000);
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

        Thread.sleep(3000);
        //driver.navigate().back();

        element = driver.findElement(By.tagName("div"));
        elements = element.findElements(By.tagName("button"));
        for (WebElement e : elements) {
            if (e.getText().equals("TOPIC")) {
                e.click();
                break;
            }
        }
        Thread.sleep(3000);

        links = driver.findElements(By.xpath("//LI[@class='px-2 py-2 pointer hover:bg-gray-200 text-sm']"));
        links.get(0).click();
        Thread.sleep(3000);

        List<WebElement> temas = null;
        temas = driver.findElements(By.xpath("//a[contains(@href,'topic_albums')]"));
        Thread.sleep(1000);
        action.sendKeys(Keys.END).build().perform();
        for (int j = 24; j < temas.size(); j++) {
            temas = driver.findElements(By.xpath("//a[contains(@href,'topic_albums')]"));
            Thread.sleep(3000);
            action.sendKeys(Keys.END).build().perform();
            Thread.sleep(1000);
            action.sendKeys(Keys.END).build().perform();
            temas.get(j).click();
            System.out.println("--" + temas.get(j).getText() + "--");
            /*for (WebElement e : elements) {
            e.click();
            System.out.println(e.getText());
            break;
        }*/
            Thread.sleep(3000);
            links = driver.findElements(By.xpath("//BUTTON[contains(@class,'')]"));
            links.get(0).click();
            Thread.sleep(3000);

            action.sendKeys(Keys.END).build().perform();
            Thread.sleep(1000);
            action.sendKeys(Keys.END).build().perform();
            Thread.sleep(1000);
            action.sendKeys(Keys.END).build().perform();
            Thread.sleep(1000);
            action.sendKeys(Keys.END).build().perform();
            Thread.sleep(1000);
            action.sendKeys(Keys.END).build().perform();
            Thread.sleep(1000);
            action.sendKeys(Keys.END).build().perform();
            Thread.sleep(1000);
            action.sendKeys(Keys.END).build().perform();
            Thread.sleep(1000);
            action.sendKeys(Keys.END).build().perform();
            Thread.sleep(1000);
            action.sendKeys(Keys.END).build().perform();
            Thread.sleep(1000);
            action.sendKeys(Keys.END).build().perform();
            Thread.sleep(1000);

            for (int i = 0; i < links.size(); i++) {
                links = driver.findElements(By.xpath("//a[contains(@href,'tracks')]"));

                element = links.get(i);
                element.click();

                Thread.sleep(3000);

                elements = driver.findElements(By.xpath("//a[contains(@href,'download_zip')]"));
                for (WebElement e : elements) {
                    System.out.println(driver.findElement(By.xpath("//DIV[@class='items-center']")).getText() + ";" + e.getAttribute("href") + ".zip");
                }

                driver.navigate().back();
                action.sendKeys(Keys.END).build().perform();
            Thread.sleep(1000);
            action.sendKeys(Keys.END).build().perform();
            Thread.sleep(1000);
            action.sendKeys(Keys.END).build().perform();
            Thread.sleep(1000);
            action.sendKeys(Keys.END).build().perform();
            Thread.sleep(1000);
            action.sendKeys(Keys.END).build().perform();
            Thread.sleep(1000);
            action.sendKeys(Keys.END).build().perform();
            Thread.sleep(1000);
            action.sendKeys(Keys.END).build().perform();
            Thread.sleep(1000);
            action.sendKeys(Keys.END).build().perform();
            Thread.sleep(1000);
            action.sendKeys(Keys.END).build().perform();
            Thread.sleep(1000);
            action.sendKeys(Keys.END).build().perform();
            Thread.sleep(1000);

            }
            element = driver.findElement(By.tagName("div"));
            elements = element.findElements(By.tagName("button"));
            for (WebElement e : elements) {
                if (e.getText().equals("TOPIC")) {
                    e.click();
                    break;
                }
            }
            Thread.sleep(3000);

            links = driver.findElements(By.xpath("//LI[@class='px-2 py-2 pointer hover:bg-gray-200 text-sm']"));
            links.get(0).click();
            Thread.sleep(3000);

            temas = driver.findElements(By.xpath("//a[contains(@href,'topic_albums')]"));

        }
    }
}
