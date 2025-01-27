import com.oops.Imaginary;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ImaginaryTest {

    @Test
    void testConstructorAndGetter() {
        Imaginary imaginary = new Imaginary(5.0);
        assertEquals(5.0, imaginary.getImaginary(), 0.0001, "Constructor or getImaginary failed");
    }

    @Test
    void testSetter() {
        Imaginary imaginary = new Imaginary(5.0);
        imaginary.setImaginary(10.0);
        assertEquals(10.0, imaginary.getImaginary(), 0.0001, "setImaginary failed");
    }

    @Test
    void testAdd() {
        Imaginary imaginary = new Imaginary(5.0);
        imaginary.add(3.0);
        assertEquals(8.0, imaginary.getImaginary(), 0.0001, "add failed");
    }

    @Test
    void testSubtract() {
        Imaginary imaginary = new Imaginary(5.0);
        imaginary.subtract(3.0);
        assertEquals(2.0, imaginary.getImaginary(), 0.0001, "subtract failed");
    }

    @Test
    void testMultiply() {
        Imaginary imaginary = new Imaginary(5.0);
        imaginary.multiply(3.0);
        assertEquals(15.0, imaginary.getImaginary(), 0.0001, "multiply failed");
    }

    @Test
    void testDivide() {
        Imaginary imaginary = new Imaginary(9.0);
        imaginary.divide(3.0);
        assertEquals(3.0, imaginary.getImaginary(), 0.0001, "divide failed");
    }

    @Test
    void testDivideByZero() {
        Imaginary imaginary = new Imaginary(9.0);
        Exception exception = assertThrows(ArithmeticException.class, () -> imaginary.divide(0.0), "divide by zero did not throw an exception");
        assertTrue(exception.getMessage().contains("/ by zero"), "Unexpected exception message");
    }
}
