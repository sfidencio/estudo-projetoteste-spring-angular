package br.com.fitalinfo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MinhaConfiguracao {

    @Bean(name="applicationName")
    public String applicationName(){
        return "Sistema de Vendas";
    }

}
