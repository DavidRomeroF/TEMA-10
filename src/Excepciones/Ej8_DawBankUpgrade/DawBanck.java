package Excepciones.Ej8_DawBankUpgrade;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DawBanck {
    public static void main(String[] args){
        boolean seguir=true;
        int seleccion;
        String IBAN,titular;
        Scanner teclado = new Scanner(System.in);
        CuentaBancaria usr1 = null;

        do {
            try {
                System.out.println("Introduce el IBAN de la cuenta: ");
                IBAN = teclado.nextLine();
                System.out.println("Introduce el nombre completo del titular: ");
                titular = teclado.nextLine();

                usr1 = new CuentaBancaria(IBAN,titular);
                seguir = false;
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }while (seguir);


        seguir=true;
        do {
            {
                System.out.println("""
                    Menu Cuenta:
                    1. Mostrar el IBAN, el titular y el saldo.
                    2. Mostrar el IBAN
                    3. Mostrar el titular
                    4. Saldo
                    5. Ingresar
                    6. Retirar
                    7. Mostrar lista de movimientos
                    8. Salir
                    """);
                seleccion = teclado.nextInt();

                switch (seleccion) {
                    case 1:
                        usr1.infoCuenta();
                        break;
                    case 2:
                        System.out.printf("IBAN: %s\n", usr1.getIBAN());
                        break;
                    case 3:
                        System.out.printf("Titular: %s\n", usr1.getTITULAR());
                        break;
                    case 4:
                        System.out.printf("Saldo: %.2f\n", usr1.getSaldo());
                        break;
                    case 5:
                        System.out.print("Que cantidad quieres ingresar: ");
                        usr1.ingreso(teclado.nextFloat());
                        break;
                    case 6:
                        System.out.printf("Que cantidad quieres retirar.\n" +
                                "Saldo: %.2f\n",usr1.getSaldo());
                        usr1.retirar(teclado.nextFloat());
                        break;
                    case 7:
                        System.out.println("Lista Movimientos: ");
                        usr1.mostrarMovimientos();
                        break;
                    case 8:
                        seguir=false;
                        break;
                    default:
                        try {
                            throw new CuentaException("AVISO: Valor no valido.");
                        }catch (CuentaException e){
                            System.out.println(e.getMessage());
                        }
                }
            }
        }while (seguir);
    }
}
