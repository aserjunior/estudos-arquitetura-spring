package estudos.spring.boot.arquiteturaspring.configuration;

import estudos.spring.boot.arquiteturaspring.montadora.Motor;
import estudos.spring.boot.arquiteturaspring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MontadoraConfiguration {

    @Bean
    public Motor motor() {
        Motor motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.ASPIRADO);
        motor.setModelo("XPTO-01");
        return motor;
    }
}
