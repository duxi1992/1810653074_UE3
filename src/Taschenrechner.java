public class Taschenrechner
{
    public static void main(String[] args)
    {
        System.out.println("Addieren");
        Addition(1, 2 );
        Addition(2.5,3.5);

        System.out.println("Subtrahieren");
        Subtraktion(2, 1);
        Subtraktion(2.5, 1.5);

        System.out.println("Multiplizieren");
        Multiplikation(1 , 2);
        Multiplikation(2.5, 3.5);

        System.out.println("Dividieren");
        Division(4.5, 3.5);
    }
    //Addition
    public static void Addition(int a, int b)
    {
        int ergebnis = a + b;
        System.out.println(ergebnis);
    }
    public static void Addition (double a, double b)
    {
        double ergebnis = a + b;
        System.out.println(ergebnis);
    }
    //Subtraktion
    public static void Subtraktion(int a, int b)
    {
        int ergebnis = a - b;
        System.out.println(ergebnis);
    }
    public static void Subtraktion (double a, double b)
    {
        double ergebnis = a - b;
        System.out.println(ergebnis);
    }
    //Multiplikation
    public static void Multiplikation(int a, int b)
    {
        int ergebnis = a * b;
        System.out.println(ergebnis);
    }
    public static void Multiplikation(double a, double b)
    {
        double ergebnis = a * b;
        System.out.println(ergebnis);
    }
    //Division
    public static void Division(int a, int b)
    {
        int ergebnis = a / b;
        System.out.println(ergebnis);
    }
    public static void Division(double a, double b)
    {
        double ergebnis = a / b;
        System.out.println(ergebnis);
    }
}
}