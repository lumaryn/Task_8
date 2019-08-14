import org.junit.Assert;
import org.junit.Test;
import simple.Div;

public class Division {

    @Test
    public void DivGeneral(){

        Div a = new Div();

        Assert.assertEquals("Some problem in 'Div' function", a.getA(10,5),2);
    }
}

