package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor;
        try {
            valor = teclado.nextInt();
            System.out.println("Valor introducido: "+valor);
        }catch (InputMismatchException e){
            System.out.println("Valor introducido incorrecto.");
        }finally {
            teclado.close();
        }
    }
}
