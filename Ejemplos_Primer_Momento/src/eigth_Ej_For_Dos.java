import javax.swing.*;

public class eigth_Ej_For_Dos {
    public static void main(String[] args) {
       /* // declarando variables-----------------ejemplo uno----------------------
        Integer capuchinos = 1;
        Integer i;

        // programa que informa cuando debe recargar la maquina
        for (i=1; i<=9; i++){
            JOptionPane.showMessageDialog(null, " eligio capuchino ");
            if (capuchinos <= 10){
                JOptionPane.showMessageDialog(null, " su capuchino numero " + capuchinos);
                capuchinos = capuchinos+1;
            }
        }
        JOptionPane.showMessageDialog(null, " recarga la cafetera  capuchino numero " + capuchinos);*/


        // declarando variables-----------------ejemplo dos-----------------------------
        String respuesta1 = "Bogota";
        String respuesta2 = "Medellin";
        String respuesta3 = "Petro";
        Integer i;

        // programa para validar respuesta
        for (i=1; i<=3; i++){
            String pregunta1 = JOptionPane.showInputDialog("Cual es la capital de colombia?");
            String pregunta2 = JOptionPane.showInputDialog("Donde se celebra la feria de las flores");
            String pregunta3 = JOptionPane.showInputDialog("quien es el precidente de Colombia");

            if (pregunta1.equals("Bogota") && pregunta2.equals("Medellin") && pregunta3.equals("Petro")){
                JOptionPane.showMessageDialog(null, "sus respuestas son correctas");
                i=i+3;
            } else if (i<3) {
                JOptionPane.showMessageDialog(null, "perdiste tienes otro intento");
            }else {
                JOptionPane.showMessageDialog(null, "perdiste ya no hay solucion");
            }
        }
    }
}
