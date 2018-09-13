import com.sun.org.apache.bcel.internal.generic.DREM;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Wiki {
 static WebDriver  driver;

    public static void main(String[] args) {
        // String absolutePath = new File("src\\main\\resources\\geckodriver.exe").getAbsolutePath();
        // System.setProperty("webdriver.gecko.driver", absolutePath);

        //System.setProperty("webdriver.gecko.driver", "C:\\Users\\kerbu\\IdeaProjects\\wiki\\src\\main\\resources\\geckodriver.exe");


        System.setProperty(
                "webdriver.gecko.driver",
                new File(Wiki.class.getResource("/geckodriver.exe").getFile()).getPath());
        System.setProperty(
                "webdriver.chrome.driver",
                new File(Wiki.class.getResource("/chromedriver.exe").getFile()).getPath());


      /*  System.setProperty(
                "phantomjs.binary.patch",
                new File(Wiki.class.getResource("/phantomjs.exe").getFile()).getPath());*/





        //driver = new FirefoxDriver();

        driver = new ChromeDriver();



        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);  // неявное ожидание 5 секунд
        driver.manage().window().maximize();


        driver.get("https://passport.i.ua/");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-checkmark']")).click();

//          !!!!!!!!!!!!!!!!! boock-buffett !!!!!!!!!!!!!
       /* driver.get("https://promo.maximarkets.org/book-buffett/");

        driver.findElement(By.xpath("//*[@id=\"modal\"]/div/a")).click();

        driver.findElement(By.xpath("//*[@id=\"RForm-0\"]/form/div[1]/input")).sendKeys("test");
        driver.findElement(By.xpath("//*[@id=\"RForm-0\"]/form/div[2]/input")).sendKeys("test");
        driver.findElement(By.xpath("//*[@id=\"RForm-0\"]/form/div[4]/input")).sendKeys("test@dfg.aseui");
        driver.findElement(By.xpath("//*[@id=\"txtPhone\"]")).sendKeys("0000000000000");
        driver.findElement(By.xpath("//*[@id=\"RForm-0\"]/form/div[6]/button")).click();


        driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("test123");
        driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("test123");
        driver.findElement(By.xpath("//*[@id=\"agreement\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"openAccBtn\"]")).click();*/


/*


        driver.get("https://en.wikipedia.org/wiki/Main_Page");

        driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Chuck Norris");

        driver.findElement(By.xpath("//input[@id='searchButton']")).click();



        driver.get("http://www.ironspider.ca/forms/checkradio.htm");


        ClickChackboxIfnotSelect("red");
        ClickChackboxIfnotSelect("red");
        ClickChackboxIfnotSelect("blue");
        ClickChackboxIfnotSelect("green");

        ClickRadioButtonIfnotSelect(2);
        ClickRadioButtonIfnotSelect(3);
        ClickRadioButtonIfnotSelect(1);
        ClickRadioButtonIfnotSelect(1);

*/


        // неявное ожидание и выпадающий список (гугл дивы)

        /*WebDriverWait wait = (new WebDriverWait(driver,5));

        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?continue=https%3A%2F%2Fwww.google.de%2Fsearch%3Fq%3Dgoogle%26oq%3Dgoogle%26aqs%3Dchrome..69i57j69i60l3j69i65j69i60.3871j0j4%26sourceid%3Dchrome%26ie%3DUTF-8&hl=mn&flowName=GlifWebSignIn&flowEntry=SignUp");

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1")));

        driver.findElement(By.xpath("//div[@class='MocG8c B9IrJb LMgvRb KKjvXb']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='OA0qNb ncFHed']")));

        driver.findElement(By.xpath("//*[@id='lang-chooser']/div[2]/div/content[text()='\u202AУкраїнська\u202C']/..")).click();

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='OA0qNb ncFHed']")));

        driver.quit();*/




       /* driver.get("https://login.yahoo.com/account/create?authMechanism=primary&done=https%3A%2F%2Fwww.yahoo.com%2F&eid=100&add=1&src=fpctx&intl=us&lang=en-US&specId=yidReg");

        driver.findElement(By.xpath("//select[@id='usernamereg-month']")).click();
        driver.findElement(By.xpath("//option[text()='September']")).click();

        driver.findElement(By.xpath("//select[@name='shortCountryCode']")).click();
        driver.findElement(By.xpath("//option[@data-code='+380']")).click();

        driver.quit();*/


        /*driver.get("http://www.ironspider.ca/forms/checkradio.htm");
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[1]/form/input"));

        checkBoxes.get(3).click();


        for ( WebElement checkbox : checkBoxes){
            if(!checkbox.isSelected()){
                checkbox.click();
            }
        }
        System.out.println(checkBoxes.size());
*/


       /*driver.get("https://www.w3schools.com/html/html_tables.asp");



       WebElement tableElement = driver.findElement(By.xpath("//table[@id='customers']"));

       Table table = new Table(tableElement, driver);


        System.out.println("Rows number is: " + table.getRows().size());
        System.out.println(table.getValueFromCell(2,3));
        System.out.println(table.getValueFromCell(4,1));
        System.out.println(table.getValueFromCell(4,"Company"));
        System.out.println(table.getValueFromCell(1,"Country"));
        System.out.println(table.getValueFromCell(2,"Contact"));

        driver.quit();*/


        // !!!!!!!!!!!!!!!!     Сложные действия. Класс actions    !!!!!!!!!!!!!!!!!!!!!


      /*  driver.get("https://www.ebay.com/");

       WebElement link = driver.findElement(By.xpath("//tr[@role='list']//a[text()='Electronics']"));

        WebElement element = driver.findElement(By.xpath("//tr[@role='list']//a[text()='Electronics']"));  // тестовый элемент для примера.

       Actions actions = new Actions(driver);

       actions.moveToElement(link).build().perform();    // невести мышкой

        actions.dragAndDrop(element, link).build().perform();  // перетянуть элемент один в элемент два


        actions.clickAndHold(element).moveToElement(link).release().build().perform(); // Нажать и не отпускать кликом мыши на элемент, перетащить его на другой элемент, и отпустить кнопку мыши.


        Action action = actions.clickAndHold(element).moveToElement(link).release().build();   // собрать действия в переменную

        action.perform();   // выполнить ранее собранные методы


        actions.doubleClick(element); // дабл клик)

        actions.contextClick(element); // клик правой кномпок*/


        //!!!!!!!!!!!!!!!!!!!!!!!!    JAVASCRIPT     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!



     /*   driver.get("https://ru.wikipedia.org/wiki/%D0%97%D0%B0%D0%B3%D0%BB%D0%B0%D0%B2%D0%BD%D0%B0%D1%8F_%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0");
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        jse.executeScript("window.scrollBy(0,1000)","");
        jse.executeScript("window.scrollBy(0,-1000)","");
       // jse.executeScript("alert('HELLO WORLD!');");*/


        //     !!!!!!!!!!!!!!!!!!!!!!!!!!!!  ALERT !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


      /*  driver.get("https://www.oracle.com/technetwork/java/javase/downloads/jdk10-downloads-4416644.html");
        driver.findElement(By.xpath("//a[text()='jdk-10.0.2_windows-x64_bin.exe']")).click();

        driver.switchTo().alert().accept();

        driver.get("https://google.com/");

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        jse.executeScript("confirm('Are you sure?')");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        driver.switchTo().alert().dismiss();*/


        //    !!!!!!!!!!!!!!!!!!!!!!  работа с окнами !!!!!!!!!!!!!!!!!!!!!!

       /* driver.get("https://www.oracle.com/technetwork/java/javase/downloads/jdk10-downloads-4416644.html");

        String firstWindow = driver.getWindowHandle();
        driver.findElement(By.xpath("//a[text()='Oracle Binary Code License Agreement for Java SE']")).click();

        for (String windowsHandler: driver.getWindowHandles() ){
            driver.switchTo().window(windowsHandler);
        }

        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='Terms']")).click();

        driver.switchTo().window(firstWindow);
        driver.findElement(By.xpath("//span[text()='Overview']/parent::a")).click();*/


        // !!!!!!!!!!!!!!!!!!!!!!! Работа с вкладками !!!!!!!!!!!!!!!!!!!!!!!!!!


     /*   driver.get("https://signup.live.com/");

        String firstTab = driver.getWindowHandle();
        driver.findElement(By.xpath("//a[text()='Terms of Use']")).click();

        for (String tab: driver.getWindowHandles() ){
            driver.switchTo().window(tab);
        }

        driver.findElement(By.xpath("//div[@id='div14b_Store']")).click();

        driver.switchTo().window(firstTab);
        driver.findElement(By.xpath("//input[@id='MemberName']")).sendKeys("test test");*/


//              !!!!!!!!!!!!!!!!!!!!!!! Состояния элементов !!!!!!!!!!!!!!!!!!!!!!!!!!!

        /*driver.get("http://127.0.0.1:5500/index.html");


        WebElement buttonDis = driver.findElement(By.xpath("//button[@id='myBtn']"));
        WebElement buttonTry = driver.findElement(By.xpath("//button[@id='lol']"));


        System.out.println(buttonDis.isEnabled());
        buttonTry.click();
        System.out.println(buttonDis.isEnabled());


        driver.get("https://www.ebay.com/");

        WebElement link1 = driver.findElement(By.xpath("//a[text()='Following']"));
        WebElement link2 = driver.findElement(By.xpath("//a[@title='Electronics - Cell Phones & Accessories']"));

        System.out.println(link1.isDisplayed());
        System.out.println(link2.isDisplayed());


        Actions action = new Actions(driver);

        if (link2.isDisplayed()){
            link2.click();
        }

        action.moveToElement(driver.findElement(By.xpath("//*[@id=\"navigationFragment\"]/div/table/tbody/tr/td[5]"))).build().perform();

        WebDriverWait wait = new WebDriverWait(driver,3);

        wait.until(ExpectedConditions.visibilityOf(link2));
        if (link2.isDisplayed()) {
            link2.click();
            System.out.println("click");
        }
*/


        //  !!!!!!!!!!!!!!!!!!!!!!!!!!!! Проверка наличия элемента на странице !!!!!!!!!!!!!!!!!!!!!!!


        /*driver.get("https://github.com/");

        System.out.println(driver.findElements(By.xpath("//a[text()='Log in']")).size());
        System.out.println(driver.findElements(By.xpath("//a[text()='Sign in']")).size());

        if(driver.findElements(By.xpath("//a[text()='Sign in']")).size()>0) System.out.println("Есть такой");

        if(driver.findElements(By.xpath("//a[text()='Log in']")).size() == 0) System.out.println("Нет такого");*/





        // !!!!!!!!!!!!!!!!!!!!!!!!!!!! Нажатие клавиш на клавиатуре +  СКРИНШОТЫ  !!!!!!!!!!!!!!!!!!!!!!!

       /* driver.get("https://ru.wikipedia.org/wiki/%D0%97%D0%B0%D0%B3%D0%BB%D0%B0%D0%B2%D0%BD%D0%B0%D1%8F_%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0");

        WebElement serchInput = driver.findElement(By.xpath("//input[@id='searchInput']"));


        String select = Keys.chord(Keys.CONTROL, "a");
        String cut = Keys.chord(Keys.CONTROL,"x");
        String paste = Keys.chord(Keys.CONTROL,"v");


        serchInput.sendKeys(Keys.chord(Keys.SHIFT,"test text"));

        serchInput.sendKeys(select);

        serchInput.sendKeys(cut);
        serchInput.sendKeys(paste);

        serchInput.sendKeys(Keys.ENTER);

        Date dateNow = new Date();
        SimpleDateFormat format = new SimpleDateFormat("hh_mm_ss");
        String fileName = format.format(dateNow) + ".png";

        File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);


        try {
            FileUtils.copyFile(scr, new File("C:\\Scren\\" + fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }

        driver.quit();
*/




       // !!!!!!!!!!!!!!!!!!!!!!!!  Загрузка ФАЙЛОВ !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


       /* driver.get("https://images.google.com/");

        driver.findElement(By.xpath("//a[@aria-label='Bildersuche']")).click();

        driver.findElement(By.xpath("//a[text()='Bild hochladen']")).click();

        driver.findElement(By.xpath("//input[@id='qbfile']")).sendKeys("C:\\Users\\kerbu\\Desktop\\0506dff8-1c7b-4e69-a208-170527e614cd.jpg");*/
    }



    private static void ClickChackboxIfnotSelect(String name)
    {
        String patch = "//input[@value='%s']";
        patch = String.format(patch, name);
        if(!driver.findElement(By.xpath(patch)).isSelected()) {
            driver.findElement(By.xpath(patch)).click();
        }
        }

    private static void ClickRadioButtonIfnotSelect(int numb)
    {

        String patch = "//*[@id=\"Content\"]/div[1]/blockquote[2]/form/input[%s]";
        patch = String.format(patch, numb);
        if(!driver.findElement(By.xpath(patch)).isSelected()) {
            driver.findElement(By.xpath(patch)).click();
        }
    }
    }



