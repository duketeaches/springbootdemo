/**
 * 
 */
package duke.learn.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author Kazi
 *
 */
@SpringBootApplication
@EnableJpaRepositories("duke.learn.spring.repo")
@EntityScan("duke.learn.spring.model")
public class Application {

    public static void main(String[] args) {
	SpringApplication.run(Application.class, args);
    }
}
