package br.com.unipe.aula.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("br.com.unipe.aula")
@EnableWebMvc
public class RootConfig {

}
