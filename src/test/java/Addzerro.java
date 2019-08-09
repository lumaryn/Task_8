import simple.Add;
import org.junit.Assert;
import org.junit.Test;

public class Addzerro {

    @Test
    public void Addzerro(){
        Add a = new Add();

        Assert.assertEquals("Some problem in 'add' function",0,a.getA(0,0));
    }
}


