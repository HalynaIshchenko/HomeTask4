package homeTask4PartThree;

public class Main {

    public static void main(String[] args) throws MyException, IllegalAccessException {
        //  Якщо a>0 і b>0 викидаємо MyException
        Methods methods1 = new Methods(0, 0);
        methods1.add();

      /* //  Якщо a=0 і b=0 викидаємо IllegalAccessException
       Methods methods2  = new Methods(0,0);
        methods2.divide();
        */

      /*  // Якщо a=0 і b!=0 або a!=0 і b=0 викидаємо ArithmeticException - case 1
        Methods methods3  = new Methods(1,0);
        methods3.multiply();
        */

      /*  // Якщо a=0 і b!=0 або a!=0 і b=0 викидаємо ArithmeticException - case 2
        Methods methods4  = new Methods(0,1);
        methods4.minus();
        */

     /*  // Якщо a=0 і b=0 викидаємо IllegalAccessException
        Methods methods5  = new Methods(-1,-1);
        methods5.add();
        */
    }
}
