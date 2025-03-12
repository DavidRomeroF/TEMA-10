package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        int seleccion = 0;
        int[] listaValores = new int[(int) (Math.random()*100)+1];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < listaValores.length; i++) {
            listaValores[i] = (int) (Math.random()*10)-1;
        }

        do {
            try {
                System.out.print("Selecciona una posición: ");
                seleccion = teclado.nextInt();
                System.out.println("El valor en la posición " + seleccion + " es: " + listaValores[seleccion]);
            } catch (InputMismatchException e) {
                System.out.println("Valor no valido");
                teclado.next();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Valor fuera del rango del array");
            }
        } while (seleccion >= 0);
    }
}
