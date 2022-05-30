package homeTask4PartThree;

public class Methods {
    private int a;
    private int b;

    public Methods(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void add() throws IllegalAccessException, MyException {
        validate();
        System.out.println(a + b);

    }

    public void minus() throws MyException, IllegalAccessException {
        validate();
        System.out.println(a - b);

    }

    public void multiply() throws MyException, IllegalAccessException {
        validate();
        System.out.println(a * b);

    }

    public void divide() throws MyException, IllegalAccessException {
        validate();
        System.out.println(a / b);

    }

    private void validate() throws IllegalAccessException, MyException {
        // Якщо a<0 і b<0 викидаємо IllegalArgumentException
        if (a < 0 && b < 0) {
            throw new IllegalArgumentException("a<0 && b<0");
        }
        // Якщо a=0 і b!=0 або a!=0 і b=0 викидаємо ArithmeticException
        else if ((a == 0 && b != 0) || (a != 0 && b == 0)) {
            throw new ArithmeticException("(a==0 && b!=0) || (a!=0 && b==0)");
        }
        // Якщо a=0 і b=0 викидаємо IllegalAccessException
        else if (a == 0 && b == 0) {
            throw new IllegalAccessException("a==0 && b==0");
        }
        //Якщо a>0 і b>0 викидаємо MyException
        else if (a > 0 && b > 0) {
            throw new MyException("a>0 && b>0");
        }
    }

}
