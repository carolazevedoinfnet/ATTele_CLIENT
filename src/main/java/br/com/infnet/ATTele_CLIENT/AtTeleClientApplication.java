package br.com.infnet.ATTele_CLIENT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class AtTeleClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtTeleClientApplication.class, args);
	}

}
