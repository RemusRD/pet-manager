package com.pet.manager;

import com.pet.manager.model.Author;
import com.pet.manager.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner createMongoDbIndex(
            AuthorRepository repository
    ) {
        return args -> {
            //repository.findAuthorByFirstName(author.getFirstName());
            //Create indexes
        };
    }
}
