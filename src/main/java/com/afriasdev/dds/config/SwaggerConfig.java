package com.afriasdev.dds.config;

import io.swagger.v3.oas.models.OpenAPI;

import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

     @Bean
     public OpenAPI customOpenAPI() {
         return new OpenAPI()
             .info(new Info()
                     .title("DDS API")
                     .version("1.0.0")
                     .description("API documentation for the DDS application")
                     .contact(new Contact()
                             .name("Andrés Frias")
                             .email("afriasdev@gmail.com")
                             .url("https://github.com/SentenciaSQL")
                     )
             );
     }
}
