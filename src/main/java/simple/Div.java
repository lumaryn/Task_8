package simple;

public class Div {
   private int a;
    public int getA(int i, int y) {
        try {
            a = i / y;

       }catch (ArithmeticException e) {
        System.out.println(e);
   }
        return a;
    }
}