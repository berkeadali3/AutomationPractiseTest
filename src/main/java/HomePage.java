import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    By productLocator = By.cssSelector("#homefeatured > li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.first-in-line.first-item-of-tablet-line.first-item-of-mobile-line > div > div.left-block > div > a.product_img_link > img");

    public HomePage(WebDriver driver){
        super(driver);
    }

    public void clickFirstPopularProduct(){
        WebElement product = driver.findElement(productLocator);
        product.click();
    }
}
