import org.junit.Assert;
import org.junit.Test;
import simple.Subtr;

public class SubGeneral {

    @Test
    public void SubGeneral(){

        Subtr a = new Subtr();

        Assert.assertEquals("Some problem in 'subtr' function", a.getA(10,6),4);


    }

}
