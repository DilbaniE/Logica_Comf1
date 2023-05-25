import javax.swing.*;

public class eleventh_Ej_WithImg {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Ingresa tu name");
        String respuesta = JOptionPane.showInputDialog("Quieres ser mi novia?");

        if (respuesta.equals("si")){
            JOptionPane.showMessageDialog(null, " ", " ", JOptionPane.INFORMATION_MESSAGE,new ImageIcon("src/happy.png"));
        }else {
            JOptionPane.showMessageDialog(null, " ", " ", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/sad.jpg"));
        }
    }
}
