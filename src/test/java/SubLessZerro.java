import org.junit.Assert;
import org.junit.Test;
import simple.Subtr;

public class SubLessZerro {
    @Test
    public void SubLessZerro(){

        Subtr a = new Subtr();

        Assert.assertEquals("Some problem in 'subtr' function", a.getA(10,100),-90);


    }
}
