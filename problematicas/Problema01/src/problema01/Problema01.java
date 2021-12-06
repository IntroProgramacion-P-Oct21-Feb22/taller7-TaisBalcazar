/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author TaisBalcazar
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        String posicion;
        int edad;
        double estatura;
        String cadena = "";
        String cadena1 = "";
        String cadena2 = "";
        boolean bandera = true;
        String salida;
        double prom_edad;
        double prom_estatura;
        int contador = 0;
        double sumaedad = 0;
        double sumaest = 0;
        do {
            System.out.println("Ingrese el nombre del jugador");
            nombre = entrada.nextLine();

            System.out.println("Ingrese la posición del jugador");
            posicion = entrada.nextLine();

            System.out.println("Ingrese la edad del jugador");
            edad = entrada.nextInt();

            System.out.println("Ingrese la estatura del jugador");
            estatura = entrada.nextDouble();

            sumaedad = sumaedad + edad;
            sumaest = sumaest + estatura;
            contador = contador + 1;
            prom_edad = sumaedad / contador;
            prom_estatura = sumaest / contador;

            cadena = String.format("%s%d. %s -%s-,edad %d,estatura %.2f\n",
                    cadena,
                    contador,
                    nombre,
                    posicion,
                    edad,
                    estatura);
            
            cadena1 = String.format("%s %d", cadena1, edad);
            
            cadena2 = String.format("Promedio de edades:%.2f\n"
                    + "Promedio de estaturas: %.2f\n",
                    prom_edad,
                    prom_estatura);

            entrada.nextLine();

            System.out.println("Ingrese (si) para dejar de ingresar datos");
            salida = entrada.nextLine();

            if ((salida.equals("si")) || (salida.equals("SI")) || (salida.equals("Si"))) {
                bandera = false;
            }

        } while (bandera);

        System.out.printf("%s\nListado de edades:%s\n%s", cadena, cadena1, cadena2);

    }

}
