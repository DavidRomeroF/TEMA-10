package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2;
        try {
            num1 = teclado.nextInt();
            num2 = teclado.nextInt();
            System.out.println("La division es: "+(num1/num2));
        }catch (InputMismatchException e){
            System.out.println("Valor introducido incorrecto.");
        }
        catch (ArithmeticException a){
            System.out.println("Error. Division / by 0");
        }
        finally {
            teclado.close();
        }
    }
}
