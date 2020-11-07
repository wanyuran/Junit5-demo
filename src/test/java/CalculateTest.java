import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateTest {

    @BeforeAll
    public static void before() {
        System.out.println("start!");
    }

    @AfterAll
    public static void after() {
        System.out.println("end!");
    }

    @BeforeEach
    public void beforeCase() {
        System.out.println("before each~~~~");
    }

    @AfterEach
    public void afterCase() {
        System.out.println("after each~~~~");
    }

    @Test
    public void addTest() {
        int result = Calculate.add(1, 2);
        System.out.println("result add");
        assertEquals(3, result);
    }

    @Test
    public void subtractTest() {
        int result = Calculate.subtract(1, 1);
        System.out.println("result subtract");
        assertEquals(0, result);
    }

    @Test
    public void multiplyTest() {
        int result = Calculate.multiply(1, 2);
        System.out.println("result multiply");
        assertEquals(2, result);
    }

    @Test
    public void divideTest() {
        int result = Calculate.divide(2, 2);
        System.out.println("result divide");
        assertEquals(1, result);
    }

    @Test
    public void countTest() throws InterruptedException {
        int result = Calculate.count(1);
        result = Calculate.count(1);
        result = Calculate.count(1);
        result = Calculate.count(1);
        System.out.println("result count");
        assertEquals(4, result);
    }


}
