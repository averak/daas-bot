package dev.abelab.daas.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Setting Swagger-ui
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket dock() {
        return new Docket(DocumentationType.SWAGGER_2) //
                .useDefaultResponseMessages(false) //
                .select() //
                .build() //
                .apiInfo(apiInfo()) //
                .tags( //
                        new Tag("Dajare", "ダジャレ") //
                );
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("daas-bot API").build();
    }
}
