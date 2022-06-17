/**
 * 
 */
package com.veeha.openid.oidc.jwtauthorities;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

import com.veeha.openid.oidc.utils.YamlLoaderInitializer;

@SpringBootApplication
public class SpringOidcJwtAuthoritiesApplication {
    
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SpringOidcJwtAuthoritiesApplication.class);
        ApplicationContextInitializer<ConfigurableApplicationContext> yamlInitializer = new YamlLoaderInitializer("jwtauthorities-application.yml");
        application.addInitializers(yamlInitializer);
        application.run(args);
    }
}
