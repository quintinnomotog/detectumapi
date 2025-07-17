package br.com.quintinno.detectumapi;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Application implements CommandLineRunner {

	private Logger log = LoggerFactory.getLogger(Application.class);

	private LocalDateTime dataBuild = LocalDateTime.now();

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	public String api() {
		StringBuilder apiInfo = new StringBuilder()
				.append("\n")
				.append("Aplicação:  CredentiumService \n")
				.append("Porta:      8761 \n")
				.append("Publicação: " + dataBuild + "\n")
				.append("Ambiente:   Desenvolvimento");
		return apiInfo.toString();
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this.api());
		log.info(api());
	}

}
