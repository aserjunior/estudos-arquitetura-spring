package estudos.spring.boot.arquiteturaspring.configuration;

import estudos.spring.boot.arquiteturaspring.montadora.Motor;
import estudos.spring.boot.arquiteturaspring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MontadoraConfiguration {

    @Bean(name = "motorAspirado")
    public Motor motorAspirado() {
        Motor motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.ASPIRADO);
        motor.setModelo("XPTO-01");
        return motor;
    }

    @Bean(name = "motorEletrico")
    public Motor motorEletrico() {
        Motor motor = new Motor();
        motor.setCavalos(110);
        motor.setCilindros(4);
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.ELETRICO);
        motor.setModelo("TH-40");
        return motor;
    }

    @Bean(name = "motorTurbo")
    @Primary
    public Motor motorTurbo() {
        Motor motor = new Motor();
        motor.setCavalos(180);
        motor.setCilindros(4);
        motor.setLitragem(1.5);
        motor.setTipo(TipoMotor.TURBO);
        motor.setModelo("XPTO-01");
        return motor;
    }
}
