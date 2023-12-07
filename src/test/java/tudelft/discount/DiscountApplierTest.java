package tudelft.discount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.Arrays;
import java.util.List;

public class DiscountApplierTest {

    private DiscountApplier discountApplier;
    private ProductDao productDao;

    @BeforeEach
    void setUp() {
        productDao = Mockito.mock(ProductDao.class);
        discountApplier = new DiscountApplier(productDao);
    }

    @Test
    void newPricesForBusinessCategory() {

        List<Product> businessProducts = Arrays.asList(
                new Product("3D Samsung Printer", 999.5, "BUSINESS"),
                new Product("Coffee Machine", 1.0, "BUSINESS"));

        Mockito.when(productDao.all()).thenReturn(businessProducts);
        discountApplier.setNewPrices();

        Assertions.assertEquals(1099.45, businessProducts.get(0).getPrice());
        Assertions.assertEquals(1.1, businessProducts.get(1).getPrice());
    }

    @Test
    void newPricesForHomeCategory() {
        List<Product> homeProducts = Arrays.asList(
                new Product("Samsung Radio", 99.0, "HOME"),
                new Product("Wall Paint", 1.0, "HOME"));

        Mockito.when(productDao.all()).thenReturn(homeProducts);
        discountApplier.setNewPrices();

        Assertions.assertEquals(89.1, homeProducts.get(0).getPrice(),0.1);
        Assertions.assertEquals(0.9, homeProducts.get(1).getPrice(), 0.1);
    }
}
