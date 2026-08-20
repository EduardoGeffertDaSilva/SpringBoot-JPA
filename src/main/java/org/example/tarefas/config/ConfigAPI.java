package org.example.tarefas.config;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "API Tarefas",
                version = "v1",
                description = "Api de tarefas para estudo de JPA, Spring, Documentação"
        )

)
public class ConfigAPI {
}
