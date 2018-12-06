import javax.swing.*;

class fibonacci
{
    public static void main(String[] args)
    {
        //Zahl einlesen

        int a = Integer.parseInt(JOptionPane.showInputDialog("Bitte Zahl eingeben!"));
        System.out.println("Fibonacci rekursiv");

        //Zeit messen

        double startR = System.currentTimeMillis();

        //Fibonacci rekursiv
        System.out.println("fib(" + a + ") =  " + fibonacciRekursiv(a));

        double timeR = System.currentTimeMillis() - startR;
        System.out.println(timeR/1000 + " s elapsed");
        System.out.println("---------------------------------");


        //Fibonacci iterativ

        System.out.println("Fibonacci iterativ");
        int startI = 0;
        System.out.println("fib(" + a + ") =  " + fibonacciIterativ(a));
        double timeI = System.currentTimeMillis() - startI;
        System.out.println(timeI/1000 + " s elapsed");
        System.out.println("---------------------------------");

    }

    private static int fibonacciRekursiv(int n)
    {
        // 0 = 0, 1 = 1, 2 = 1, 3 = 2, 4 = 3, 5 = 5
        if (n == 1 || n == 2) return 1;
        else if (n == 0) return 0;
        else return fibonacciRekursiv(n-1) + fibonacciRekursiv(n - 2);
    }

    private static int fibonacciIterativ(int n)
    {
        if (n == 1 || n == 2) return 1;
        else if (n == 0) return 0;

        //    Zahlen        1                     1                       2
        // 1. Schritt   zweite Ziffer         erste Ziffer
        // 2. Schritt       temp    zweite Z. = zweite Z. + erste Z.
        // 3. Schritt                            temp                   zweite Z.

        int zweiteZiffer = 1;
        int ersteZiffer = 1;

        for (int i=2; i<n; i++)
        {
            int temp = zweiteZiffer;
            zweiteZiffer += ersteZiffer;
            ersteZiffer = temp;
        }
        return zweiteZiffer;
    }
}}