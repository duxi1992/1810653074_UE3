import javax.swing.*;

class Vehicle
{
    private int power;
    private double weight;
    private String name;


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


        double ps = power * 1.36;


        int psErg = (int) Math.round(ps);

        JOptionPane.showMessageDialog(null, psErg);
    }
}
