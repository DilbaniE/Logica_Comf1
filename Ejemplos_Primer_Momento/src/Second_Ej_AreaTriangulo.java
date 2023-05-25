import javax.swing.*;

public class Second_Ej_AreaTriangulo {
    public static void main(String[] args) {
        //---------- variables-------------
        Integer altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura"));
        Integer base = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base"));
        float resultado = base*altura/2f;
        //-------------------------------------
        Integer[] numers = {3, 6, 9,};

        //---------- imprimir-------------
        JOptionPane.showMessageDialog(null, " El are del triangulo es " + resultado  );
        JOptionPane.showMessageDialog(null, numers[0]*3 + " " + numers[1]*3 + " " + numers[2]*3 );
    }
}
