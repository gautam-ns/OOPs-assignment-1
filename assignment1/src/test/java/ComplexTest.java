import com.oops.Complex;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @Test
    void testConstructorAndGetters() {
        Complex complex = new Complex(3.0, 4.0);
        assertEquals(3.0, complex.getReal(), 0.0001, "Constructor or getReal failed");
        assertEquals(4.0, complex.getImaginary(), 0.0001, "Constructor or getImaginary failed");
    }

    @Test
    void testSetters() {
        Complex complex = new Complex(3.0, 4.0);
        complex.setReal(5.0);
        complex.setImaginary(6.0);
        assertEquals(5.0, complex.getReal(), 0.0001, "setReal failed");
        assertEquals(6.0, complex.getImaginary(), 0.0001, "setImaginary failed");
    }

    @Test
    void testGetMagnitude() {
        Complex complex = new Complex(3.0, 4.0);
        assertEquals(5.0, complex.getMagnitude(), 0.0001, "getMagnitude failed");
    }

    @Test
    void testAdd() {
        Complex c1 = new Complex(2.0, 3.0);
        Complex c2 = new Complex(1.0, 4.0);
        c1.add(c2);
        assertEquals(3.0, c1.getReal(), 0.0001, "Addition of real parts failed");
        assertEquals(7.0, c1.getImaginary(), 0.0001, "Addition of imaginary parts failed");
    }

    @Test
    void testSubtract() {
        Complex c1 = new Complex(5.0, 6.0);
        Complex c2 = new Complex(3.0, 2.0);
        c1.subtract(c2);
        assertEquals(2.0, c1.getReal(), 0.0001, "Subtraction of real parts failed");
        assertEquals(4.0, c1.getImaginary(), 0.0001, "Subtraction of imaginary parts failed");
    }

    @Test
    void testMultiply() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(3.0, 4.0);
        c1.multiply(c2);
        assertEquals(-5.0, c1.getReal(), 0.0001, "Multiplication of real parts failed");
        assertEquals(10.0, c1.getImaginary(), 0.0001, "Multiplication of imaginary parts failed");
    }

    @Test
    void testDivideDifferentValues() {
        Complex c1 = new Complex(10.0, 6.0);
        Complex c2 = new Complex(4.0, -3.0);
        c1.divide(c2);
        assertEquals(0.88, c1.getReal(), 0.0001, "Division of real parts failed for different values");
        assertEquals(2.16, c1.getImaginary(), 0.0001, "Division of imaginary parts failed for different values");
    }

    @Test
    void testPrint() {
        Complex complex = new Complex(3.0, 4.0);
        complex.print();
        // No assertion needed as this is a console output test.
        // Visually confirm the output: "3.0 + 4.0i"
    }
}