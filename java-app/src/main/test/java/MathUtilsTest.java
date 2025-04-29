import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class MathUtilsTest {

    private MathUtils mathUtils;

    @BeforeEach
    public void setup() {
        mathUtils = new MathUtils();
    }

    @Test
    public void testAdd() {
        assertEquals(5, mathUtils.add(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, mathUtils.subtract(4, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(12, mathUtils.multiply(3, 4));
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, mathUtils.divide(6, 3));
    }

    @Test
    public void testDivideByZero() {
        assertEquals(-1.0, mathUtils.divide(5, 0));
    }
}
