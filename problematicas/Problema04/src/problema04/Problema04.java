/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

/**
 *
 * @author TaisBalcazar
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int limite = 15;
        int numerador = 1;
        int denominador = 3;
        String signo;
        String cadena = "1 ";

        while (denominador <= limite) {

            if (denominador == 3 || denominador == 7
                || denominador == 11 || denominador == 15) {
                signo = "-";
            } else {
                signo = "+";
            }

            cadena = String.format("%s%s %d/%d ",
                    cadena,
                    signo,
                    numerador,
                    denominador);

            denominador = denominador + 2;
        }
        
        System.out.println(cadena);
    }
}
