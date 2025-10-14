package com.imt.framework.web.tuto;

import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.imt.framework.web.tuto.presentation.LivreResource;

@Component
@ApplicationPath("librairy")
@Configuration
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig(){
        register(LivreResource.class);
    }
}
