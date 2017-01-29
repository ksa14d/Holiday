package holiday.web;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class HolidayApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(HolidayApplication.class);
	}

	private static SpringApplicationBuilder configureApplication(SpringApplicationBuilder builder) {
		return builder.sources(HolidayApplication.class).bannerMode(Banner.Mode.OFF);
	}

	public static void main(String[] args) {
		SpringApplication.run(HolidayApplication.class, args);
	}


//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//		return configureApplication(builder);
//	}
//
//	public static void main(String[] args) {
//		configureApplication(new SpringApplicationBuilder()).run(args);
//	}
//
//	private static SpringApplicationBuilder configureApplication(SpringApplicationBuilder builder) {
//		return builder.sources(HolidayApplication.class).bannerMode(Banner.Mode.OFF);
//	}
}
