package Notificaciones;

import java.time.LocalDateTime;

public interface Notificacion {
    void enviarMensaje(String mensaje);
    String getUltimoMensaje(); // Se agrega este método para evitar el uso de instanceof
    LocalDateTime getFechaEnvio(); // Nuevo método para obtener la fecha y hora del envío
}