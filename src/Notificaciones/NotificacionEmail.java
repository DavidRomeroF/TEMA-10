package Notificaciones;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class NotificacionEmail implements Notificacion {
    private String mensaje;


    @Override
    public void enviarMensaje(String mensaje) {
        this.mensaje = mensaje;
        System.out.println(mensaje);
    }

    @Override
    public String getUltimoMensaje() {
        return mensaje;
    }

    @Override
    public LocalDateTime getFechaEnvio() {
        LocalDateTime fechaEnvio = LocalDateTime.now();
        return fechaEnvio;
    }
}
