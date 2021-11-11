package in.ashokit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.ashokit.util.PasswordUtils;
@Configuration
public class AppConfig {
	
	public AppConfig() {
		System.out.println("*********Appconfig::constructor");
	}
	
	@Bean
	public PasswordUtils getinstance() {
		PasswordUtils pwd =new PasswordUtils("ASE");
		return pwd;
		
	}

}
