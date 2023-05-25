import javax.swing.*;

public class Primer_Ejercicio {
    public static void main(String[] args) {
        //--------------------Definiendo variables--------------
            String x = "Hola dilbani";
            Integer y = 2;
            Float n = 1.3f;
            boolean control = false;
            //---------------------//
            Integer a = 12;
            Integer b = 20;
            Integer f = a+b;
            //---------------------//
            String name = JOptionPane.showInputDialog("Ingresa tu name");
            Integer age = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa tu name"));

        //----------------------imprimir---------------------
        System.out.println("hola mundo de dilbani");
        JOptionPane.showMessageDialog(null, "hola mundo" + " " + name + " " + " su edad es "+ " " + age);
        JOptionPane.showMessageDialog(null, x  +" "+ y + " " +  n + " "+ control);
        JOptionPane.showMessageDialog(null, f);

    }
}
