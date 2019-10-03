/**
 * 
 */
package duke.learn.spring.actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * @author Kazi
 *
 */
@Component
public class HealthCheck implements HealthIndicator {

    @Override
    public Health health() {
	System.out.println("Doing health check");
	return Health.up().build();

    }

}
