package Excepciones.Ej8_DawBankUpgrade;

import java.util.ArrayList;

public class CuentaBancaria {
    private static final float LIMITE=50;
    private static final float AVISO=3000;
    private final String IBAN;
    private final String TITULAR;
    private float saldo = 0;
    private final ArrayList <String> MOVIMIENTOS = new ArrayList();

    public CuentaBancaria(String IBAN, String TITULAR) {
        this.IBAN = validarIBAN(IBAN);
        this.TITULAR = validarTITULAR(TITULAR);
    }

    public String getIBAN(){
        return IBAN;
    }

    public String getTITULAR(){
        return TITULAR;
    }

    public String validarIBAN(String IBAN) {//Comprobación si el IBAN es Español y válido.
        if (IBAN.matches("ES[0-9]{22}"))
            return IBAN;
        else
            throw new CuentaException("IBAN no valido");
    }

    public String validarTITULAR(String titular) {//Comprobación si Titular esta vació
        if (this.TITULAR == null && titular.isEmpty())
            throw new CuentaException("ERROR. Titula vacio");
        else
            return titular;
    }

    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    public float getSaldo(){
        return saldo;
    }

    public void infoCuenta(){//Saca por pantalla la info de la cuenta
        System.out.printf("Cuenta con IBAN: %s\n" +
                "Titular: %s\n" +
                "Con saldo %.2f\n", IBAN, TITULAR, saldo);
    }

    public void ingreso(float cantidadDinero){//Método para ingresar dinero
        if (cantidadDinero<=0){
            try {
                throw new CuentaException("ERROR. Cantidad no validad");
            }catch (CuentaException e){
                System.out.println(e.getMessage());
            }
        }
        else {
            setSaldo(getSaldo()+cantidadDinero);

            try {
                if (cantidadDinero > AVISO) {
                    throw new AvisarHaciendaExeption("AVISO: Notificar a hacienda");
                }
            } catch (AvisarHaciendaExeption e) {
                System.out.println(e.getMessage());
            }
            MOVIMIENTOS.add((MOVIMIENTOS.size()+1)+". INGRESO: +"+cantidadDinero);//Añade una nueva posición a la lista con el movimiento
        }
    }
    public void retirar(float cantidadDinero){//Método para retirar dinero
        if (cantidadDinero<=0 || (getSaldo()+LIMITE)<cantidadDinero){
            try {
                throw new CuentaException("ERROR.Cantidad de dinero no valida");
            }catch (CuentaException e){
                System.out.println(e.getMessage());
            }
        }
        else {
            setSaldo(getSaldo()-cantidadDinero);
            try {
                if (getSaldo() < 0 && getSaldo() >= -LIMITE) {
                    throw new CuentaException("AVISO: Saldo negativo");
                }
            }catch (CuentaException e){
                System.out.println(e.getMessage());
            }
            MOVIMIENTOS.add((MOVIMIENTOS.size()+1)+". RETIRO: -"+cantidadDinero);//Añade una nueva posición a la lista con el movimiento
        }
    }

    public void mostrarMovimientos(){//Método para mostrar la lista de movimientos
        for (int i=0; i<MOVIMIENTOS.size(); i++) {
            System.out.println(MOVIMIENTOS.get(i));
        }
    }
}
