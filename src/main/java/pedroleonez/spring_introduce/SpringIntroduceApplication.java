package pedroleonez.spring_introduce;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pedroleonez.spring_introduce.model.MovieData;
import pedroleonez.spring_introduce.service.ConsumeApi;
import pedroleonez.spring_introduce.service.DataConverter;

@SpringBootApplication
public class SpringIntroduceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringIntroduceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumeApi = new ConsumeApi();
		var json = consumeApi.getData("https://www.omdbapi.com/?i=tt3896198&apikey=a06071ca");
		System.out.println(json);

		DataConverter dataConverter = new DataConverter();
		MovieData movieData = dataConverter.getData(json, MovieData.class);
		System.out.println(movieData);
	}
}
