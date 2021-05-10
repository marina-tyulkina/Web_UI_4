package homework4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TestTriangleSquare {

    private static Logger logger = LoggerFactory.getLogger(TestTriangleSquare.class);

    @Test
    void testPositiveABC() {
        int a = 3;
        int b = 4;
        int c = 5;
        boolean result = TriangleSquare.SquareTriangle(a, b, c);
        Assertions.assertTrue(result, "3 числа положительные");

    }

    @Test
    void testAllNumbersAreEqual() {
        int a = 5;
        int b = 5;
        int c = 5;
        boolean result = TriangleSquare.SquareTriangle(a, b, c);
        Assertions.assertTrue(result, "3 стороны равны");

    }

    @Test
    void testOneNumberIsNull() {
        int a = 6;
        int b = 5;
        int c = 0;
        boolean result = TriangleSquare.SquareTriangle(a, b, c);
        Assertions.assertFalse(result, "Одно число - ноль");

    }

    @Test
    void testOneNumberIsNegative() {
        int a = 5;
        int b = -5;
        int c = 2;
        boolean result = TriangleSquare.SquareTriangle(a, b, c);
        Assertions.assertFalse(result, "Одно из чисел отрицательное");

    }


}
