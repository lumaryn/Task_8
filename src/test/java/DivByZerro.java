import org.junit.*;
import simple.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DivByZerro {

    @Test
    public void DivZero()  {

        Div a = new Div();
        assertThrows(ArithmeticException.class, () -> a.getA(0, 0));
    }
}
