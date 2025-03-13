package Excepciones.Ej5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) throws NumeroNegativo, NumeroPositivo {
        Scanner pabloMotos = new Scanner(System.in);
        int valor;
        boolean seguir = true;
        do {
            try {
                System.out.print("Introduce un valor negativo: ");
                valor = pabloMotos.nextInt();
                imprimeNegativo(valor);
                System.out.print("Introduce un valor: ");
                valor = pabloMotos.nextInt();
                imprimePositivo(valor);
            }catch (InputMismatchException e){
                System.err.println("ERROR. VALOR NO VALIDO");
                seguir = false;
            }
        }while (seguir);
    }

    public static void imprimePositivo(int p) throws NumeroNegativo{
        if (p < 0) {
            throw new NumeroNegativo("El numero es negativo");
        }
        System.out.println(p);
    }

    public static void imprimeNegativo(int n) throws NumeroPositivo{
        if (n>=0){
            throw new NumeroPositivo("El numero es positivo");
        }
        System.out.println(n);
    }
}

