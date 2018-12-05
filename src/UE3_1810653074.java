import javax.swing.*;

public class UE3_1810653074 {

    public static void main(String[] args) {

        partialString(JOptionPane.showInputDialog(null,"Bitte geben Sie einen Wert ein"));
    }

    public static void partialString(String a)
    {
        int length = a.length();
        System.out.println(length);
        if (length < 3)
        {
            System.out.println("Geben Sie einen längeren Wert ein");
        } else
        {
            String length1 = a.substring(length/2); // (2) wäre ab den 3. Buchstaben
            System.out.println(length1);
        }

    }
    }
