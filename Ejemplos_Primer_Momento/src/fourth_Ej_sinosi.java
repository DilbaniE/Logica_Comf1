import javax.swing.*;
public class fourth_Ej_sinosi {
    public static void main(String[] args) {
    //Definicion de variables-------------primer ejemplo------------
        String color = JOptionPane.showInputDialog("Ingresa un color");
        if (color.equals("red")){
            JOptionPane.showMessageDialog(null, " this color is red ");
        }else if (color.equals("blue")){
            JOptionPane.showMessageDialog(null, " this color is blue");
        } else if (color.equals("yellow")) {
            JOptionPane.showMessageDialog(null, " this color is yellow");
        }else {
            JOptionPane.showMessageDialog(null, " the color does not exist");
        }
    }
}
