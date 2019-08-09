import org.junit.*;
import simple.*;

public class DivByZerro {

    @Test
    public void DivByZerro(){

        Div a = new Div();

        Assert.assertEquals("Some problem in 'Div' function", a.getA(0,0),0);
    }
}