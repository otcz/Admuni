package cafe.A_Correo;

public class GenerarCodigoEnviarCorreoGmail {


    public GenerarCodigoEnviarCorreoGmail() {
    }

    public void enviarCorreo() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                CorreoGmail correoGmail = new CorreoGmail("carrilloZuletaOscar@gmail.com", "KONECTA - CAFETERIA", "TOMAS CARRILLO ZULETA,<br><b>DEVELOPER</b><br><br>Por: <b>KONECTA CAFE</b>" +
                        "\nESTE ES UN MENSAJE AUTOMATICO FIN DEMOSTRATIVO, AQUI MI CV--> https://drive.google.com/file/d/1OfaXQbEtp9XJroyK3Ng8W_NyworGeJaV/view?usp=sharing");
                correoGmail.enviarCorreo();

                 correoGmail = new CorreoGmail("paula.ortega@grupokonecta.com", "KONECTA - CAFETERIA", "TOMAS CARRILLO ZULETA,<br><b>DEVELOPER</b><br><br>Por: <b>KONECTA CAFE</b>" +
                        "\nESTE ES UN MENSAJE AUTOMATICO FIN DEMOSTRATIVO, AQUI MI CV--> https://drive.google.com/file/d/1OfaXQbEtp9XJroyK3Ng8W_NyworGeJaV/view?usp=sharing");
                correoGmail.enviarCorreo();
            }
        });
        thread.start();
    }
}
