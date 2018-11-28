package spring.boot.chapter2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Chapter2Application {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Chapter2Application.class);
        app.run(args);
        app.setAddCommandLineProperties(true);
    }
}
