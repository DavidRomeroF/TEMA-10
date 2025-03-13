package Excepciones.Ej7;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner pabloMotos = new Scanner(System.in);
        ArrayList<Gato> listaGatos = new ArrayList<>();
        int creados=1, edad;
        String nombre;
        Gato tmp;

        System.out.println("Programa para introducir gatos");
        do {
            try {
                System.out.print("Introduce el nombre: ");
                nombre = pabloMotos.next();
                pabloMotos.nextLine();

                System.out.print("Introduce la edad: ");
                edad = pabloMotos.nextInt();

                tmp = new Gato(nombre,edad);
                creados++;
                listaGatos.add(tmp);

                System.out.println("Gato añadido correctamente\n");
            } catch (InputMismatchException e){
                System.out.println("ERROR.Valor no valido");
                pabloMotos.nextLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }while (creados<=5);

        for (Gato a:listaGatos){
            a.imprime();
        }
    }
}
