/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

/**
 *
 * @author TaisBalcazar
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int limite = 110;
        int numero = 2;
        int contador = 0;
        int sumador = 2;
        String cadena = "";

        while (numero < limite) {

            numero = numero + contador;
            cadena = String.format("%s %d", cadena, numero);
            sumador = sumador +2;
            contador = sumador;
        }
        
        System.out.printf("%s\n",cadena);
    }
}
