import org.junit.*;
import simple.*;

public class MultByZerro {

    @Test
    public void multZerro(){

        Mult a = new Mult();

        Assert.assertEquals("Some problem in 'Mult' function", a.getA(0,0),0);
    }

}
