import javax.swing.*;

public class aufruf {

    public class Aufruf
    {
        public static void main(String[] args)
        {
            vehicle.Vehicle auto1 = new vehicle.Vehicle();
            vehicle.Vehicle auto2 = new vehicle.Vehicle();

            auto1.name="VW";
            auto2.name="Prosche";

            JOptionPane.showMessageDialog(null,"Ein " +auto1.name +" hat... ");
            vehicle.Vehicle.calculatePower(180);

            JOptionPane.showMessageDialog(null, "Ein " +auto2.name +" hat... ");
            vehicle.Vehicle.calculatePower(170);
        }
    }
}
