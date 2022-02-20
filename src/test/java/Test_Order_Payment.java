import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Test_Order_Payment extends BaseTest {

    HomePage homePage;
    ProductDetailPage productDetailPage;

    @Test @Order(1)
        public void clickFirstPopularProduct(){
        homePage = new HomePage(driver);
        homePage.clickFirstPopularProduct();
        }

    @Test @Order(2)
    public void addToCard() throws InterruptedException {
        productDetailPage = new ProductDetailPage(driver);
        productDetailPage.addToCard();
        Thread.sleep(2000);
    }

    @Test @Order(3)
    public void clickToCard() {
        productDetailPage = new ProductDetailPage(driver);
        productDetailPage.clickToCard();
    }
         }





