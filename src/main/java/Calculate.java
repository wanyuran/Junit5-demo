import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Calculate {
    public static int result = 0;

    public static int subtract(int x, int y) {
        result = x - y;
        return result;
    }

    public static int add(int x, int y) {
        result = x + y;
        return result;
    }

    public static int count(int x) throws InterruptedException {
        int i = result;
        Thread.sleep(1000);
        result = i + x;
        return result;
    }

    public static int multiply(int x, int y) {
        result = x * y;
        return result;
    }

    public static int divide(int x, int y) {
        result = x/y;
        return result;
    }
}
