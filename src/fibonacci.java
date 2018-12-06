import javax.swing.*;

public class fibonacci {

public static void main (String[]args) {

    public static long fib(int a)
    {


        if (a == 1 || a == 2) return 1;
        else return fib(a - 1) + fib(a - 2);
    }


    public class FibonacciDemo1 {

        public class main(
        String[] args)

        {

            System.out.print("Geben Sie ein Zahl an: ");

            int a = Integer.parseInt(JOptionPane.showInputDialog("Bitte eine Zahl eingeben"));

            System.out.println("fib(" + a + ") = " + fibonacci(a));

        }

        public int fibonacci(int a) {

            if (a == 1 || a == 2) return 1;

            else return fibonacci(a - 1) + fibonacci(a - 2);

        }

    }
}
}