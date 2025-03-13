package Notificaciones;

public class TestNotificaciones {
    public static void main(String[] args) {
        Notificacion email = new NotificacionEmail();
        Notificacion sms = new NotificacionSMS();

        probarNotificacion(email, "Hola, este es un mensaje por email.");
        probarNotificacion(sms, "Hola, este es un mensaje por SMS.");
    }

    public static void probarNotificacion(Notificacion notificacion, String mensajeEsperado) {
        notificacion.enviarMensaje(mensajeEsperado);

        if (notificacion.getUltimoMensaje().equals(mensajeEsperado)) {
            System.out.println("TEST PASADO: El mensaje fue enviado correctamente en " + notificacion.getFechaEnvio());
        } else {
            System.out.println("TEST FALLIDO: El mensaje no coincide.");
        }
    }
}