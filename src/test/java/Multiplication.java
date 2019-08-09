import org.junit.*;
import simple.*;

public class Multiplication {

    @Test
    public void multGeneral(){

        Mult a = new Mult();

        Assert.assertEquals("Some problem in 'Mult' function", a.getA(5,5),25);
    }

}
