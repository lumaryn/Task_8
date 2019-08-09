package simple;

public class Add {
    private static int a;


    public static int getA(int i, int y) {
        try {
            a = i + y;

        }catch (ArithmeticException e) {
            System.out.println(e);
        }
        return a;
    }
}
