import org.junit.*;
import simple.*;

public class CalcGeneral {

    @Test
    public void CalcGeneral(){

        Operation op = new Operation();

        Assert.assertEquals("Some problem in function", 0,op.getResult(2,2));
    }

}
