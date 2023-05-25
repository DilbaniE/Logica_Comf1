import javax.swing.*;

public class fifth_Ej_Swichs {
    public static void main(String[] args) {
        // Definicion de variables ------------------ primer ejemplo-----------------
        String name = JOptionPane.showInputDialog("Ingresa tu nombre");
        switch (name){
            case "dilbani":
                JOptionPane.showMessageDialog(null, " eres administrador ");
                break;
            case "jaime":
                JOptionPane.showMessageDialog(null, " eres el jefe ");
                break;
            default:
                JOptionPane.showMessageDialog(null, " eres invitado");
                break;
        }

    }
}
