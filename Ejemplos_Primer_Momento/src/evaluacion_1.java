import javax.swing.*;
public class evaluacion_1 {
    public static void main(String[] args) {
        /* //---------1 ciclos crear un programa que me permita ingresar un numero y decir si es numero primo o no-------
        Integer numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese numero"));
        Integer i;
        boolean varPrima=true;
        if (numero<2){
            varPrima=false;
        }
        else {
            for(i=2;i<numero;i++){
                if (numero%i==0){
                    varPrima=false;
                    break;
                }
            }
        }
        //imprimir si es primpo
        if (varPrima==true){
            System.out.println(numero+"es un numer primo");
        }else{
            System.out.println(numero+"no es un numer primo");
        }
        ///segunda parte del codigo
        System.out.println("numeros primos hacia atras");
        for (int dilbani=numero;dilbani>1;dilbani--){
            boolean varPrima2=true;
            for(int j=2;j<dilbani;j++){
                if (dilbani%j==0){
                    varPrima2=false;
                    break;
                }
            }
            if(varPrima2==true){
                System.out.println(dilbani);
            }
        }---*/
        //segundo punto------- hacer tres preguntas y adivina el personaje

        JOptionPane.showMessageDialog(null, "Escribe si o no");
        String question1 = JOptionPane.showInputDialog(" Tiene el zorro de nueve colas, tiene el cabello amarillo, y es hokage");
        String question2 = JOptionPane.showInputDialog(" Perdio a su familia, su hermana se convirtio en demonio, y quiere matar a todos los demonios");
        String question3 = JOptionPane.showInputDialog(" Es viejo toma mucho alchol, tiene un nieto que lo acompaña siempre, y viaja por el universo");

        if (question1.equals("si")){
            JOptionPane.showMessageDialog(null, " Su nombre es Naruto Uzumaky");
        } else if (question2.equals("si")) {
            JOptionPane.showMessageDialog(null, " Su nombre es Tayiro Kamado");
        } else if (question3.equals("si")) {
            JOptionPane.showMessageDialog(null, " Su nombre es Rick Y Morty");
        }else{
            JOptionPane.showMessageDialog(null, " El personaje no existe");
        }
    }
}
