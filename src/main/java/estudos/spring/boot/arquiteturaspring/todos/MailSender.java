package estudos.spring.boot.arquiteturaspring.todos;

import org.springframework.stereotype.Component;

@Component
public class MailSender {

    public void enviarEmail(String message) {
        System.out.println("Email enviado: " + message);
    }
}
