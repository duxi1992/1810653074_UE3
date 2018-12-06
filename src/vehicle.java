import javax.swing.*;

public class Vehicle
{
    private int power;
    private double weight;
    private String name;

    // Getter und Setter für Weitergabe der private Variablen
    public int getPower()
    {
        return power;
    }

    public void setPower(int power)
    {
        this.power = power;
    }

    public String printName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void calculatePower()
    {
        //Umrechnung KW in PS

        double ps = power * 1.36;
        //It accepts a double value and converts into nearest long value
        //by adding 0.5 and truncating decimal points

        // Compiler sagen, dass Objekt mehr vom Typ A als B ist

        int psErg = (int) Math.round(ps);

        JOptionPane.showMessageDialog(null, psErg);
    }
}
