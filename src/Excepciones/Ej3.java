package Excepciones;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        int i=0;
        double valor;
        double[] listaDeNumeros = new double[5];
        Scanner teclado = new Scanner(System.in);

        do {
            try {
                System.out.print("Introduce un valor: ");
                valor = teclado.nextDouble();
                listaDeNumeros[i] = valor;
                i++;
            }catch (InputMismatchException e){
                System.out.println("Valor no valido");
                teclado.next();//Limpiamos el buffer
            }
        }while (i< listaDeNumeros.length);
        System.out.println(Arrays.toString(listaDeNumeros));
    }
}
