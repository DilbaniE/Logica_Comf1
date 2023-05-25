import javax.swing.*;

public class sixth_Ej_SwhichIf {
    public static void main(String[] args) {
        // Definicion de variables ------------------ primer ejemplo-----------------
        Integer confirma;

        Integer dato = Integer.parseInt(JOptionPane.showInputDialog("ingresa 1 para Nezuko 2 para Konnan"));

        switch (dato){
            case 1:
                confirma = Integer.parseInt(JOptionPane.showInputDialog("ingresa 1 para Nezuko 2 para Konnan"));
                if (confirma.equals(1)){
                    JOptionPane.showMessageDialog(null, "welcome nezuko");
                }else{
                    JOptionPane.showMessageDialog(null, "tu no eres nezuko");
                }
                break;
            case 2:
                confirma = Integer.parseInt(JOptionPane.showInputDialog("ingresa 1 para Nezuko 2 para Konnan"));
                if (confirma.equals(2)){
                    JOptionPane.showMessageDialog(null, "welcome konnan");
                }else{
                    JOptionPane.showMessageDialog(null, "tu no eres  konnan");
                }
                break;
        }
    }
}
