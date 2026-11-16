import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestOrder {
    @Test
    @Order(1)
    void firstTest() {}

    @Test
    @Order(2)
    void secondTest() {}
}
