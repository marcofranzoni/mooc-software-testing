package tudelft.discount;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiscountApplierTest {

    @Test
    void businessDiscountApplier() {

        Product firstProduct = new Product("firstProduct", 1, "BUSINESS");
        ProductDao dao = Mockito.mock(ProductDao.class);

        List<Product> products = Arrays.asList(firstProduct);
        Mockito.when(dao.all()).thenReturn(products);

        DiscountApplier discountApplier = new DiscountApplier(dao);
        discountApplier.setNewPrices();

        assertEquals(0.9, firstProduct.getPrice());
    }

    @Test
    void homeDiscountApplier() {

        Product firstProduct = new Product("firstProduct", 1, "HOME");
        ProductDao dao = Mockito.mock(ProductDao.class);

        List<Product> products = Arrays.asList(firstProduct);
        Mockito.when(dao.all()).thenReturn(products);

        DiscountApplier discountApplier = new DiscountApplier(dao);
        discountApplier.setNewPrices();

        assertEquals(1.1, firstProduct.getPrice());
    }

    @Test
    void emptyDiscountApplier() {

        ProductDao dao = Mockito.mock(ProductDao.class);

        List<Product> products = Arrays.asList();
        Mockito.when(dao.all()).thenReturn(products);

        DiscountApplier discountApplier = new DiscountApplier(dao);
        discountApplier.setNewPrices();

    }

    @Test
    void nullDiscountApplier() {
        ProductDao dao = Mockito.mock(ProductDao.class);

        List<Product> products = new ArrayList<>();
        products.add(null);
        Mockito.when(dao.all()).thenReturn(products);

        DiscountApplier discountApplier = new DiscountApplier(dao);
        discountApplier.setNewPrices();

    }
}
