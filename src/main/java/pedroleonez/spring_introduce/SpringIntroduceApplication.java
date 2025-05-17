package pedroleonez.spring_introduce;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIntroduceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringIntroduceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello, Spring Boot!");
	}
}
