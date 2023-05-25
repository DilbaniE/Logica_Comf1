import javax.swing.*;

public class seventh_Ej_For {
    public static void main(String[] args) {
        // declaracion de variables--------------- ejemplo uno
         Integer candidato1 = 0;
         Integer candidato2 = 0;
         Integer i;

         // un programa para elegir un candidato
        for (i=1; i<=6; i++){
            JOptionPane.showMessageDialog(null, "elige un candidato jaime o dilbani");
            String voto = JOptionPane.showInputDialog("Ingresa tu  voto jaime o dilbani");
            if (voto.equals("jaime")){
                JOptionPane.showMessageDialog(null, "usted voto por jaime");
                candidato1 = candidato1 + 1;
            } else if (voto.equals("dilbani")) {
                JOptionPane.showMessageDialog(null, "usted voto por dilbani");
                candidato2 = candidato2 + 1;
            }else{
                JOptionPane.showMessageDialog(null, " el candidato no existe");
            }
        }
        if (candidato1>candidato2){
            JOptionPane.showMessageDialog(null, "el ganador es jaime");
        } else if (candidato2>candidato1) {
            JOptionPane.showMessageDialog(null, "el ganador es dilbani");
        }else {
            JOptionPane.showMessageDialog(null, "empate");

        }
    }
}
