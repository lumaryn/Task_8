import org.junit.*;
import simple.*;

public class Division {

    @Test
    public void DivGeneral(){

        Div a = new Div();

        Assert.assertEquals("Some problem in 'Div' function", a.getA(10,5),2);
    }
}

