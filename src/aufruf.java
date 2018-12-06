import javax.swing.*;

class Aufgabe5{

        public static void main(String[] args)
        {
            //neue Instanz
            Vehicle seat = new Vehicle();
            //Werte zuweisen
            seat.setName("Seat");
            seat.setPower(150);

            //Ausgabe
            System.out.println("Name: " + seat.printName());
            System.out.println("PS: " + seat.getPower());
            seat.calculatePower();

            System.out.println("--------------------");
            Vehicle vw = new Vehicle();
            vw.setName("VW");
            vw.setPower(179);

            System.out.println("Name: " + vw.printName());
            System.out.println("PS: " + vw.getPower());
            vw.calculatePower();

        }
}
