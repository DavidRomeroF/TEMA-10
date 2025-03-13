package Excepciones.Ej8_DawBankUpgrade;

public class CuentaException extends RuntimeException {
    public CuentaException(String message) {
        super(message);
    }
}
