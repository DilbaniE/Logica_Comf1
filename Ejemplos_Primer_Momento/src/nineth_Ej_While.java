import javax.swing.*;

public class nineth_Ej_While {
    public static void main(String[] args) {
       /* //Declaracion de variables ------------------- ejemplo uno ----------------------
        String respuesta = JOptionPane.showInputDialog("esta trabajando si o no");
        while (respuesta.equals("si")){
            JOptionPane.showMessageDialog(null,"tomate un break ");
            respuesta = JOptionPane.showInputDialog("aun esta trabajando si o no");
        }
        JOptionPane.showMessageDialog(null, "ve a descansar ");*/

        //Declaracion de variables ------------------- ejemplo dos ----------------------
        String user ="dilbani";
        Integer  password = 123456;
        String usuario = " ";
        Integer contrase = 0;
        while (!usuario.equals(user) || !contrase.equals(password)){
            usuario = JOptionPane.showInputDialog("Ingresa el usuario");
            contrase = Integer.parseInt(JOptionPane.showInputDialog("ingresa la contraseña"));
          if (!usuario.equals(user) || !contrase.equals(password)){
              JOptionPane.showMessageDialog(null,"el usuario o contraseña son erroneos ");
          }
        }
        JOptionPane.showMessageDialog(null, "welcome");
    }
}
