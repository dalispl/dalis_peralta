
package com.tlaxcala.controller;

import java.util.Collections;

import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class ConfiguracionSwagger {
    
    /**
     * @return
     */
	
    @Bean
	public Docket apiDocket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.tlaxcala.controller"))
				.paths(PathSelectors.any())
				.build().apiInfo(getApiInfo());
	}
	
	private ApiInfo getApiInfo() {
		return new ApiInfo(
				"MEDIC API ",
				"Servicio Medico API",
				"1.0",
				"https://www.finanzastlax.gob.mx/",
				new Contact("Finanzas", "https://www.finanzastlax.gob.mx/", "dalila_peraltal@finanzastlax.gob.mx"),
				"LICENSE",
				"LICENSE URL",
				Collections.emptyList()
				);
	}
}
