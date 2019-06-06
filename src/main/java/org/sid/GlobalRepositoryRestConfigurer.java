package org.sid;

import org.sid.entities.Genre;
import org.sid.entities.Idee;
import org.sid.entities.IdeeMotsCle;
import org.sid.entities.MotsCle;
import org.sid.entities.TypeIdee;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
@Configuration
public class GlobalRepositoryRestConfigurer extends RepositoryRestConfigurerAdapter {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		// TODO Auto-generated method stub
		config.setReturnBodyOnCreate(true);
		config.setReturnBodyOnUpdate(true);
		config.exposeIdsFor(Idee.class,Genre.class,TypeIdee.class, IdeeMotsCle.class, MotsCle.class);
		config.getCorsRegistry()
		.addMapping("/**")
		.allowedOrigins("http://localhost:4200")
		.allowedHeaders("*")
		.allowedMethods("OPTIONS","HEAD", "GET","PUT", "POST","DELETE","PATCH");
	}
	
}
