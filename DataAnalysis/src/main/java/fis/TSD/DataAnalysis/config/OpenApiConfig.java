package fis.TSD.DataAnalysis.config;


import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components()
                                .addSecuritySchemes(HttpHeaders.AUTHORIZATION, new SecurityScheme()
                                        .type(SecurityScheme.Type.APIKEY)
                                        .in(SecurityScheme.In.HEADER)
                                        .name(HttpHeaders.AUTHORIZATION))
//                        .addSecuritySchemes("key_role", new SecurityScheme()
//                                .type(SecurityScheme.Type.APIKEY)
//                                .in(SecurityScheme.In.HEADER)
//                                .name("key_role"))
//                        .addSecuritySchemes("realm", new SecurityScheme()
//                                .type(SecurityScheme.Type.APIKEY)
//                                .in(SecurityScheme.In.HEADER)
//                                .name("realm"))
                )
                .addSecurityItem(new SecurityRequirement()
                                .addList(HttpHeaders.AUTHORIZATION)
//                        .addList("key_role")
//                        .addList("realm")
                )
                .info(new Info()
                        .title("SPRO API")
                        .description("This is a API list that will be used in the system.")
                        .version("1.0.0"));
    }
}
