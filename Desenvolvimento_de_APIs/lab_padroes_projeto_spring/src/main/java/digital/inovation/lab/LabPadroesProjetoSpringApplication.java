package Desenvolvimento_de_APIs.lab_padroes_projeto_spring.src.main.java.digital.inovation.lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class LabPadroesProjetoSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(LabPadroesProjetoSpringApplication.class, args);
    }
}