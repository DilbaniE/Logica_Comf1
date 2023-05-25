import javax.swing.*;

public class Third_Ej_Condicion {
    public static void main(String[] args) {
       /* // Defini variables------------------------- primer ejermplo----------------

        Integer x = 2;
        Integer y = 1;

        // si esta lloviendo abro el paraguas, si no la cierro
        if (x > y){
            JOptionPane.showMessageDialog(null, " esto es verdaderi ");
        }else{
            JOptionPane.showMessageDialog(null, " esto es falso ");
        }*/


        /* //----------- Defini variables -------------segundo ejermplo------------------------
        String name = JOptionPane.showInputDialog("Ingresa tu name");
        Integer password = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa tu contraseña"));

        // validar datos de un usuario
        if (name.equals("dilbani") && password.equals(123456)){
            JOptionPane.showMessageDialog(null, " welcome ");
        }else{
            JOptionPane.showMessageDialog(null, " Intruso ");
        }*/


        /*//------------Definicion de variables -----------tercer ejermplo ----------------------

        String trabajador = JOptionPane.showInputDialog("Estas trabajando");
        // programa que valida si esta trabajando o no
        if (trabajador.equals("si")){
            String cafe = JOptionPane.showInputDialog("Tienes cafe");
            if (cafe.equals("no")){
                JOptionPane.showMessageDialog(null, " tomate un cafe");
            }else{
                JOptionPane.showMessageDialog(null, " sigue trabajando");
            }
        }else{
            JOptionPane.showMessageDialog(null, " ve a dormir ");
        }*/


        /*//------------Definicion de variables -----------cuarto ejermplo ----------------------
        String user1 = JOptionPane.showInputDialog("User1 Ingresa piedra, papel, o tijera");
        String user2 = JOptionPane.showInputDialog("User2 Ingresa piedra, papel, o tijera");

        //programa de piedra papel o tijera
        if (user1.equals("piedra") && user2.equals("tijera")){
            JOptionPane.showMessageDialog(null, "gana el user uno con piedra");
        }else if (user1.equals("tijera") && user2.equals("papel")) {
            JOptionPane.showMessageDialog(null, "gana el user uno con tijera");

        }else if(user1.equals("papel") && user2.equals("piedra")) {
            JOptionPane.showMessageDialog(null, "gana el user uno con papel");
        } else if (user1.equals(user2)) {
            JOptionPane.showMessageDialog(null, "empate");
        }else{
            JOptionPane.showMessageDialog(null, "gano el user 2 con " + user2);
        }*/


        /*//------------Definicion de variables---------------------- quinto ejemplo------------
        String name = JOptionPane.showInputDialog("Ingrese nombre");
        Integer age = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa tu edad"));
        String nombre = "luis";
        Integer edad = 18;

        if (name.equals(nombre) && age.equals(edad)) {
            JOptionPane.showMessageDialog(null, "eres jurado de votacion");
        } else if (name.equals(nombre) && age < 18) {
            JOptionPane.showMessageDialog(null, " no puedes ser jurado ni votar");
        } else if (age < 18) {
            JOptionPane.showMessageDialog(null, " no puedes votatar");
        } else if (age >= 25) {
            JOptionPane.showMessageDialog(null, " su mesa de botacion es la numero 1");
        } else if (age > 26 && age <= 35) {
            JOptionPane.showMessageDialog(null, " su mesa de botacion es la numero 2");
        } else if (age > 35) {
            JOptionPane.showMessageDialog(null, " su mesa de botacion es la numero 3");
        }*/


        //------------Definicion de variables---------------------- seis ejemplo------------
        String letra = JOptionPane.showInputDialog("Ingrese una vocal");

        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")){
            JOptionPane.showMessageDialog(null, " Esto es una vocal" + letra);
        }else{
            JOptionPane.showMessageDialog(null, " no es una vocal");
        }
    }
}
