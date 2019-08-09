import org.junit.Assert;
import org.junit.Test;
import simple.Add;

public class AddGeneral {

    @Test
    public void generalAddition(){

       Add a = new Add();

        Assert.assertEquals("Some problem in 'add' function", a.getA(100,100),200);


    }

}
