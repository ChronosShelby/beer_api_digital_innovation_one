package one.digitalinnovation.beerstock.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;

@Configuration
public class SwaggerConfig {

    private static final String API_TITLE = "Beer Stock API";
    private static final String API_DESCRIPTION = "REST API for beer stock management";
    private static final String CONTACT_NAME = "Rodrigo Peleias";
    private static final String CONTACT_GITHUB = "https://gtihub.com/rpeleias";
    private static final String CONTACT_EMAIL = "rodrigo.peleis@gmail.com";

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title(API_TITLE)
                        .description(API_DESCRIPTION)
                        .version("1.0.0")
                        .contact(new Contact()
                                .name(CONTACT_NAME)
                                .url(CONTACT_GITHUB)
                                .email(CONTACT_EMAIL)));
    }
}
