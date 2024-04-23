import org.example.Product;
import org.junit.Test;
import static org.junit.Assert.*;


public class ProductTest {

    @Test
    public void testAllTrue() {
        Product p1 = new Product("Торт");
        Product p2 = new Product("Ванилин");
        Product p3 = new Product("Какао");
        Product p4 = new Product("Тесто");
        Product p5 = new Product("Кофеин");
        Product p6 = new Product("Вода");
        Product p7 = new Product("Мука");
        Product p8 = new Product("Яйца");

        assertTrue(p1.addComponent(p2));
        assertTrue(p1.addComponent(p3));
        assertTrue(p1.addComponent(p4));
        assertTrue(p3.addComponent(p5));
        assertTrue(p3.addComponent(p6));
        assertTrue(p4.addComponent(p7));
        assertTrue(p4.addComponent(p8));

    }

    @Test
    public void testWithRecursion() {
        Product p1 = new Product("Тесто");
        Product p2 = new Product("Мука");
        Product p3 = new Product("Яйца");
        Product p4 = new Product("Вода");
        Product p5 = new Product("Пшеница");


        assertTrue(p1.addComponent(p2));
        assertTrue(p1.addComponent(p3));
        assertTrue(p1.addComponent(p4));
        assertFalse(p2.addComponent(p1));
        assertTrue(p2.addComponent(p5));
        assertFalse(p5.addComponent(p1));

    }
}
