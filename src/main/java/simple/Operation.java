package simple;

import java.util.Scanner;

public class Operation {
    private char ch;
    private int a;
    Scanner sc = new Scanner(System.in);

    public void setCh() {
        try {
            System.out.println("Укажите операцию: + or - or / or *");
            while ((ch != '+') & (ch != '-') & (ch != '/') & (ch != '*')) {
                this.ch = sc.next().charAt(0);

                if ((ch != '+') & (ch != '-') & (ch != '/') & (ch != '*')) {
                    System.out.println("Введены некорректные символы. Укажите операцию: + or - or / or *");
                }
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public int getResult(int i, int y)
    {
        try {
            if (ch == '+') {
                Add add = new Add();
                int a = add.getA(i, y);
                this.a = a;
            } else if (ch == '-') {
                Subtr subtr = new Subtr();
                int a = subtr.getA(i, y);
                this.a = a;
            } else if (ch == '*') {
                Mult mult = new Mult();
                int a = mult.getA(i, y);
                this.a = a;
            }
              else if (ch == '/') {
                Div div = new Div();
                int a = div.getA(i, y);
                this.a = a;
            } else {
                System.out.println("Произошла неведомая ошибка");
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return a;
    }
}