import javax.swing.*;

public class twelfth_Ej_Menu_Cajero {
    public static void main(String[] args) {

        Integer dato = 1;
        Integer tarjeta1= 30000;
        Integer tarjeta2 = 10000;

        while (!dato.equals(0)){
            dato = Integer.parseInt(JOptionPane.showInputDialog("Ingresa: \n 1. para consultar saldo tarjeta1  \n 2. para consultar saldo tarjeta2 \n 3. transferir dinero \n 4. retirar dinero \n 0. para salir "));

            switch (dato){
                case 1:
                    JOptionPane.showMessageDialog(null, " consultar 1 " + tarjeta1);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, " consultar 2 " + tarjeta2);
                    break;
                case 3:
                    Integer transferirir = Integer.parseInt(JOptionPane.showInputDialog(null, " transferira de la tarjeta uno o de la tarjeta dos"));
                    Integer valor = Integer.parseInt(JOptionPane.showInputDialog(null, " valor a transferir"));

                    if (transferirir.equals(1) && valor > tarjeta1){
                        JOptionPane.showMessageDialog(null, "No tienes suficiente dinero");
                    } else if (transferirir.equals(1) && valor < tarjeta1) {
                        tarjeta1 = tarjeta1 - valor;
                        tarjeta2 = tarjeta2 + valor;
                        JOptionPane.showMessageDialog(null, "Transferencia completada");

                    } else if (transferirir.equals(2) && valor > tarjeta2) {
                        JOptionPane.showMessageDialog(null, "No tienes suficiente dinero");
                    } else if (transferirir.equals(2) && valor < tarjeta2) {
                        tarjeta2 = tarjeta2 - valor;
                        tarjeta1 = tarjeta1 + valor;
                        JOptionPane.showMessageDialog(null, "Transferencia completada");
                    }
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "retirar");
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, " salir");
                    break;
            }

        }
    }
}
