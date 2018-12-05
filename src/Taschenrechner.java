public class Taschenrechner {

        public static void main(String[] args) {




            int a = 10;
            int b = 20;

            System.out.println(Taschenrechner.addierenI(a,b));
            System.out.println(Taschenrechner.subtrahierenI(a,b));
            System.out.println(Taschenrechner.multiplizierenI(a,b));
            System.out.println(Taschenrechner.dividierenI(a,b));

            //Gleitkomma Zahlen
            double c = 2.5;
            double d = 3.5;

            System.out.println(Taschenrechner.addierenD(c,d));
            System.out.println(Taschenrechner.subtrahierenD(c,d));
            System.out.println(Taschenrechner.multiplizierenD(c,d));
            System.out.println(Taschenrechner.dividierenD(c,d));

        }



    public static int addierenI ( int a, int b)
    {
        return a + b;
    }

    public static int subtrahierenI ( int a, int b)
    {
        return a - b;
    }

    public static int multiplizierenI ( int a, int b)
    {
        return a * b;
    }

    public static int dividierenI ( int a, int b)
    {
        return a / b;
    }

    public static double addierenD ( double c, double d)
    {
        return (int) (c + d);
    }

    public static double subtrahierenD ( double c, double d)
    {
        return (int) (c - d);
    }

    public static double multiplizierenD ( double c, double d)
    {
        return (int) (c * d);
    }

    public static double dividierenD ( double c, double d)
    {
        return (int) (c / d);
    }

}