import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProductDetailPage extends BasePage{

    By quantityLocator = By.cssSelector("#quantity_wanted");
    By sizeLocator = By.cssSelector("#group_1");
    By addToCardButtonLocator = By.cssSelector("#add_to_cart > button");
    By checkoutLocator = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a");

    public ProductDetailPage(WebDriver driver){
        super(driver);
    }

    public void addToCard(){
        WebElement quantityTextBox = driver.findElement(quantityLocator);
        WebElement addToCardButton = driver.findElement(addToCardButtonLocator);
        Select sizeSelector = new Select(driver.findElement(sizeLocator));

        quantityTextBox.clear();
        quantityTextBox.sendKeys("2");
        sizeSelector.selectByVisibleText("M");
        addToCardButton.click();
    }
    public void clickToCard(){
        WebElement cardLink = driver.findElement(checkoutLocator);
        cardLink.click();
    }
}
