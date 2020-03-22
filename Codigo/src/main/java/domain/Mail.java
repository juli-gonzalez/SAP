package domain;

import org.simplejavamail.api.email.Email;
import org.simplejavamail.api.mailer.config.TransportStrategy;
import org.simplejavamail.email.EmailBuilder;
import org.simplejavamail.mailer.MailerBuilder;

public class Mail {

        private String receptor;
        private String asunto;
        private String cuerpo;

    public Mail(String receptor, String asunto, String cuerpo) {
        this.receptor = receptor;
        this.asunto = asunto;
        this.cuerpo = cuerpo;
    }

    public void enviarMail() {
        Email email = EmailBuilder.startingBlank()
                .from("testsapmailahk@gmail.com")
                .to(receptor)
                .withSubject(asunto)
                .withPlainText(cuerpo)
                .buildEmail();

        MailerBuilder
                .withSMTPServer("smtp.gmail.com", 587, "testsapmailahk@gmail.com", "BaJ8MjL2GQrGM")   .withTransportStrategy(TransportStrategy.SMTP_TLS)
                // or
                //.withSMTPServer("smtp.gmail.com", 465, "your user", "your password")
                //.withTransportStrategy(TransportStrategy.SMTPS);
                .buildMailer()
                .sendMail(email);
    }
}
