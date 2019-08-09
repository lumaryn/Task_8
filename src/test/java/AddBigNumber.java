import simple.Add;
import org.junit.Assert;
import org.junit.Test;

public class AddBigNumber {

    @Test
    public void AddBigNumber(){
        Add a = new Add();

        Assert.assertEquals("The function doesn't work correct",1999999998,a.getA(999999999,999999999));
    }
}
