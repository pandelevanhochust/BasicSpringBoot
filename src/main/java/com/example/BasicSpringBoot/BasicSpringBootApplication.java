package com.example.BasicSpringBoot;

import io.micrometer.common.util.StringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
public class BasicSpringBootApplication {

	public static void main(String[] args) {
//		ApplicationContext context = SpringApplication.run(BasicSpringBootApplication.class, args);
		SpringApplication.run(BasicSpringBootApplication.class, args);
//		final var app = new BasicSpringBootApplication(); // two are equilvalent
		final var app = new SpringApplication(BasicSpringBootApplication.class);
		final var env = app.run(args).getEnvironment();
		logApplicationStartup(env);

	}

	private static void logApplicationStartup(final Environment env) {
		String protocol = "http";
		String serverPort = "8000";
		String hostAddress = "localhost";

		try {
			hostAddress = InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			System.err.println("The host name could not be determined, using `localhost` as fallback");
		}
	}
}
