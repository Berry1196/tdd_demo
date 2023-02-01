import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator  = new Calculator();

    }

    @AfterEach
    void tearDown() {
    }
    @Test
    public void testAdd() {
        System.out.println("testadd");

        int actual = calculator.add(1,2);
        int expected = 3;
        assertEquals(expected,actual);
    }
    @Test
    public void testMulitply() {
        System.out.println("test multiply");
        int actual = calculator.multiply(5,2);
        int expected = 10;
        assertEquals(expected,actual);

    }
}
