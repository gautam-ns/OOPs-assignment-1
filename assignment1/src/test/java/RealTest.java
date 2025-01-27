import com.oops.Real;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RealTest {

    @Test
    void testConstructorAndGetReal() {
        Real real = new Real(5.0);
        assertEquals(5.0, real.getReal(), 0.0001, "Constructor or getReal failed");
    }

    @Test
    void testSetReal() {
        Real real = new Real(5.0);
        real.setReal(10.0);
        assertEquals(10.0, real.getReal(), 0.0001, "setReal failed");
    }

    @Test
    void testAdd() {
        Real real = new Real(5.0);
        real.add(3.0);
        assertEquals(8.0, real.getReal(), 0.0001, "add method failed");
    }

    @Test
    void testSubtract() {
        Real real = new Real(5.0);
        real.subtract(2.0);
        assertEquals(3.0, real.getReal(), 0.0001, "subtract method failed");
    }

    @Test
    void testMultiply() {
        Real real = new Real(5.0);
        real.multiply(4.0);
        assertEquals(20.0, real.getReal(), 0.0001, "multiply method failed");
    }

    @Test
    void testDivide() {
        Real real = new Real(20.0);
        real.divide(4.0);
        assertEquals(5.0, real.getReal(), 0.0001, "divide method failed");
    }

    @Test
    void testDivideByZero() {
        Real real = new Real(20.0);
        assertThrows(ArithmeticException.class, () -> real.divide(0.0), "Divide by zero should throw an exception");
    }
}
